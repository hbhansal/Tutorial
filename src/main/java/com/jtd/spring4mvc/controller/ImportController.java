package com.jtd.spring4mvc.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jtd.spring4mvc.dao.FileImportDAO;
import com.jtd.spring4mvc.entity.ImportFile;

 
/**
 * Handles requests for the file upload page.
 */
@Controller
public class ImportController {
    @Autowired
    private FileImportDAO fileImportDao;
    
    @RequestMapping("/user/importData")
	public String getUserPage(ModelMap model) {
		model.addAttribute("msg", "Welcome page for the Normal users!!");
		return "userImportData";
	}
    
    
   @RequestMapping(value = "/user/doImport", headers=("content-type=multipart/*"), method = RequestMethod.POST)
    public String handleFileUpload(HttpServletRequest request,
    		
    		@RequestParam("file") MultipartFile file) throws Exception {
	   		ImportFile importFile = new ImportFile();
              
  				try{
  			
                Workbook workbook = new XSSFWorkbook(file.getInputStream());
            
                Sheet firstSheet = workbook.getSheetAt(0);
                Iterator<Row> iterator = firstSheet.iterator();
                boolean flag=false;
                
                while (iterator.hasNext()) {
                	Row nextRow = iterator.next();
                	if(flag==false){
                		nextRow = iterator.next();
                		flag=true;
                	}
                    
                   
                    Iterator<Cell> cellIterator = nextRow.cellIterator();
                     
                    while (cellIterator.hasNext()) {  
                    	
                    	Cell cell = cellIterator.next();
                         
                    	switch(cell.getColumnIndex()){
                    	
                    	case 0:importFile.setCalRef(cell.getStringCellValue());
                    		break;
                    	case 1:importFile.setCategory(cell.getStringCellValue());
                    		break;
                    	case 2:importFile.setCustomer(cell.getStringCellValue());
                        		break;
                    	case 3:importFile.setOpenDate(cell.getDateCellValue());
                    		break;
                    	case 4:importFile.setPriority(cell.getStringCellValue());
                    		break;
                    	case 5:importFile.setStatus(cell.getStringCellValue());
                    		break;
                    	case 6:importFile.setAssignedTo(cell.getStringCellValue());
                    		break;
                    	case 7:importFile.setClosedAt(cell.getDateCellValue());
                    		break;
                    	case 8:importFile.setClosedBy(cell.getStringCellValue());
                    		break;
                    	case 9:importFile.setFixedBy(cell.getStringCellValue());
                    		break;
                    	case 10:importFile.setCauseCode(cell.getStringCellValue());
                    		break;
                    	case 11:importFile.setProblemSummary(cell.getStringCellValue());
                    		break;
                    	
                    	}
                    	
                    }
                    
                  fileImportDao.save(importFile);
                	//System.out.println("done!!");
                }
                 
                workbook.close();
               // inputStream.close();
                }
            
                catch(IOException e){
                	e.printStackTrace();
                }
            
        
                
                
                return "userImportData";
    }
    
   
   @RequestMapping(value = "/user/saveData", method = RequestMethod.POST)
   public void saveData(HttpServletRequest request, @RequestParam("datatoBeSaved") ImportFile data){
	   
	   System.out.println(data.getAssignedTo());
	   System.out.println(data.getCauseCode());
	   
   }
   		
}
    
