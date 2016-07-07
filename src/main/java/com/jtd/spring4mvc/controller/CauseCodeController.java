package com.jtd.spring4mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jtd.spring4mvc.entity.BussinessUnit;
import com.jtd.spring4mvc.entity.CauseCodeBean;
import com.jtd.spring4mvc.service.CauseCodeService;

@Controller
public class CauseCodeController 
{
	@Autowired
	private CauseCodeService causeCodeService;
	
	
	public CauseCodeService getCauseCodeService() {
		return causeCodeService;
	}


	public void setCauseCodeService(CauseCodeService causeCodeService) {
		this.causeCodeService = causeCodeService;
	}


List obj=null;



@RequestMapping("/admin/ManageCauseCode")
public ModelAndView getManageCauseCode(ModelMap modelMap) {

	CauseCodeBean causeCodeBean=new CauseCodeBean();
	
	
	System.out.println("the home cascode details are ------------------>: "+causeCodeService.getCauseCodes());
//	causeCodeService.addCauseCode(causeCodeBean);
	Map<String, Object> model = new HashMap<String, Object>();
	model.put("CauseCodeBean",  causeCodeBean);
	model.put("CauseCodeBeans",  causeCodeService.getCauseCodes());
	model.put("engagements",  causeCodeService.getEngagements());
	
	
	return new ModelAndView("ManageCauseCode",model);
		
}


@RequestMapping(value = "/admin/saveCauseCode", method = RequestMethod.POST)
public ModelAndView saveBussinessUnit(@ModelAttribute("CauseCodeBean") CauseCodeBean causeCodeBean, 
		BindingResult result) {
	
	
	
	causeCodeService.addCauseCode(causeCodeBean);
	Map<String, Object> model = new HashMap<String, Object>();
	model.put("CauseCodeBeans",  causeCodeService.getCauseCodes());
	CauseCodeBean causeCodeObj=new CauseCodeBean();
	model.put("CauseCodeBean",  causeCodeObj);
	model.put("engagements",  causeCodeService.getEngagements());
	
	return new ModelAndView("ManageCauseCode",model);
}


@RequestMapping(value = "/admin/editCauseCode", method = RequestMethod.GET)
public ModelAndView editCauseCode(@ModelAttribute("CauseCodeBean")  CauseCodeBean causeCodeBean,
		BindingResult result) {
	System.out.println("the Edit causecode details are ------------------>: "+causeCodeBean);
	Map<String, Object> model = new HashMap<String, Object>();
	model.put("CauseCode", causeCodeService.getCauseCode(causeCodeBean.getCauseCodeID()));
	model.put("CauseCodeBeans",  causeCodeService.getCauseCodes());
	model.put("engagements",  causeCodeService.getEngagements());
	
	return new ModelAndView("ManageCauseCode", model);
}

@RequestMapping(value = "/admin/deletecauseCode", method = RequestMethod.GET)
public ModelAndView deleteBussinessUnit(@ModelAttribute("CauseCodeBean")  CauseCodeBean causeCodeBean,
		BindingResult result) {
	
	causeCodeService.deleteCauseCode(causeCodeBean.getCauseCodeID());
	
	List obj=causeCodeService.getEngagements();
	System.out.println("obj:"+obj.toString());
	Map<String, Object> modelMap = new HashMap<String, Object>();
	modelMap.put("CauseCodeBean", causeCodeBean);
	modelMap.put("CauseCodeBeans",  causeCodeService.getCauseCodes());
	modelMap.put("engagements",  obj);
	return new ModelAndView("ManageCauseCode", modelMap);
}

}
