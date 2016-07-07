package com.jtd.spring4mvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.core.context.SecurityContextHolder;

import com.google.gson.Gson;
import com.sandeep.visual.data.DataT;

@Controller
public class MyController {

	@RequestMapping("/user/userPage")
	public String getUserPage(ModelMap model) {
		model.addAttribute("msg", "Welcome page for the Normal users!!");
		return "userPage";
	}
	
	
	@RequestMapping("/admin/adminPage")
	public String getAdminPage(ModelMap model) {
		model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "adminPage";
	}
	
	
	/*@RequestMapping("/admin/ManageEngDetails")
	public String getManageEngDetails(ModelMap model) {
	//	model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "ManageEngDetails";
	}*/
	
	
	
	@RequestMapping("/admin/ManageAppDetails")
	public String getManageAppDetails(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		
		return "ManageAppDetails";
	}
	
	
/*	@RequestMapping("/admin/ManageCauseCode")
	public String getManageCauseCode(ModelMap model) {
		//model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "ManageCauseCode";
	}*/
	
	
/*	@RequestMapping("/admin/ManageBU")
	public String getManageBU(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "ManageBU";
	}*/
	
	
	@RequestMapping(value="/logout/logoutApp", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login/loginPage?logout";//You can redirect wherever you want, but generally it's a good idea to show login screen again.
	}
	
	@RequestMapping("/user/overview")
	public String getOverView(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "overview";
	}
	
	
	  @RequestMapping("/user/ajax")
	    public String helloAjaxTest() {
		  System.out.println("the user details page --------> calling");
	        return "Failure_Image";
	    }
	
	
	
	
	
	
	@RequestMapping("/user/Failure_Image")
	public @ResponseBody String getFailure_Image(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		
		Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
        System.out.println("-------------> Message from CrunchifySpringAjaxJQuery Controller..------>" + new Date().toString());
        return result;
        
	}
	
	private List<DataT> getCasuecodeData() {

		List<DataT> listOfCauecode = new ArrayList<DataT>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
			Statement stmt = conn.createStatement();
			 String sql;		       
		      sql="SELECT Causecode, COUNT(*) AS Total , (COUNT(*) / (SELECT COUNT(*) FROM fmea.repots)) * 100 AS percent FROM fmea.repots GROUP BY Causecode;";      
		      ResultSet rs1 = stmt.executeQuery(sql); 
		      while(rs1.next()){
		      Integer val1=new Integer(Math.round(rs1.getInt("percent")));
	        	 String val2 =rs1.getString( "Causecode" ) ;
	        	 DataT Datavalue = new DataT();
	        	 Datavalue.setCauseCode(val2);
	        	 System.out.println(val2);
	        	 Datavalue.setPercent(val1); 
	        	 listOfCauecode.add(Datavalue);
		      }	 
		     
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfCauecode;
	}
	
	
	@RequestMapping("/user/report")
	public String getReport(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "report";
	}
	@RequestMapping("/user/potentialFailure")
	public String getPotentialFail(ModelMap model) {
	///	model.addAttribute("msg", "Welcome page for the Admin User!!");
		return "potentialFailure";
	}
	
	
}
