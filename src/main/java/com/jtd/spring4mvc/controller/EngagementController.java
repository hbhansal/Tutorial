package com.jtd.spring4mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





import com.jtd.spring4mvc.entity.Engagement;
import com.jtd.spring4mvc.entity.Sectors;
import com.jtd.spring4mvc.service.EngagementService;



@Controller
public class EngagementController {
	
	@Autowired
	private EngagementService engagementService;
	
	
	
	public EngagementService getEngagementService() {
		return engagementService;
	}

	

	public void setEngagementService(EngagementService engagementService) {
		this.engagementService = engagementService;
	}

	List obj=null;
	
	

	@RequestMapping("/admin/ManageEngDetails")
	public ModelAndView getManageEngDetails(ModelMap model) {

		Engagement engagement=new Engagement();
		
		obj=engagementService.getSectors();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("Engagement", engagement);
		modelMap.put("engagements",  engagementService.getEngagements());
		modelMap.put("sectors",  obj);
		return new ModelAndView("ManageEngDetails", modelMap);
		
		
		
	}


	
	
	@RequestMapping(value = "/admin/saveEngagement", method = RequestMethod.POST)
	public ModelAndView saveEngagement(@ModelAttribute("Engagement") Engagement engagement, 
			BindingResult result) {
		System.out.println("the save eng details are : "+engagement);
		
		engagementService.addEngagement(engagement);
		Engagement engagementbean=new Engagement();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("engagements",  engagementService.getEngagements());
		model.put("sectors",  engagementService.getSectors());
		model.put("Engagement", engagementbean);
		System.out.println(engagement.toString());
		return new ModelAndView("ManageEngDetails",model);
	}
	
	
	
	
	
	@RequestMapping(value = "/admin/deleteEngagement", method = RequestMethod.GET)
	public ModelAndView deleteEngagement(@ModelAttribute("Engagement")  Engagement engagement,
			BindingResult result) {
		engagementService.deleteEngagement(engagement.getEngagementID());
		Engagement engagementbean=new Engagement();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("engagements",  engagementService.getEngagements());
		model.put("sectors",  engagementService.getSectors());
		model.put("Engagement", engagementbean);
		return new ModelAndView("ManageEngDetails", model);
	}
	

////////////////////////////////
	



	

	
	@RequestMapping(value = "/admin/editEngagement", method = RequestMethod.GET)
	public ModelAndView editEngagement(@ModelAttribute("Engagement")  Engagement engagement,
			BindingResult result) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("engagement",  engagementService.getEngagement(engagement.getEngagementID()));
		model.put("engagements",  engagementService.getEngagements());
		model.put("sectors",  engagementService.getSectors());
		return new ModelAndView("ManageEngDetails", model);
	}



}
