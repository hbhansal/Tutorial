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
import com.jtd.spring4mvc.service.BussinessUnitService;



@Controller
public class BussinessUnitController {
	
	@Autowired
	private BussinessUnitService bussinessunitService;
	
	
		public BussinessUnitService getBussinessunitService() {
		return bussinessunitService;
	}


	public void setBussinessunitService(BussinessUnitService bussinessunitService) {
		this.bussinessunitService = bussinessunitService;
	}


	List obj=null;
	
	
	@RequestMapping("/admin/ManageBU")
	public ModelAndView getManageBU(ModelMap model) {

		BussinessUnit BussinessUnit=new BussinessUnit();
		
		obj=bussinessunitService.getEngagements();
		System.out.println("obj engment detqails are ---------->:"+bussinessunitService.getBussinessUnits());
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("BussinessUnit", BussinessUnit);
		//modelMap.put("bussinessUnits",  bussinessunitService.getBussinessUnits());
		modelMap.put("bussiness",  bussinessunitService.getBussinessUnits());
		modelMap.put("engagements",  obj);
		return new ModelAndView("ManageBU", modelMap);
		
		
		
	}


	@RequestMapping(value = "/admin/saveBussinessUnit", method = RequestMethod.POST)
	public ModelAndView saveBussinessUnit(@ModelAttribute("BussinessUnit") BussinessUnit bussinessunit, 
			BindingResult result) {
		
		BussinessUnit Bussinessobj=new BussinessUnit();
		System.out.println("the save eng details are ------------------>: "+bussinessunitService.getBussinessUnits());
		bussinessunitService.addBussinessUnit(bussinessunit);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bussiness",  bussinessunitService.getBussinessUnits());
		model.put("engagements",  bussinessunitService.getEngagements());
		model.put("BussinessUnit", Bussinessobj);	
		System.out.println(bussinessunit.toString());
		return new ModelAndView("ManageBU",model);
	}
	
	@RequestMapping(value = "/admin/editBussinessUnit", method = RequestMethod.GET)
	public ModelAndView editBussinessUnit(@ModelAttribute("BussinessUnit")  BussinessUnit bussinessunit,
			BindingResult result) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("BussinessUnit",  bussinessunitService.getBussinessUnit(bussinessunit.getBusUnitID()));
		model.put("bussiness",  bussinessunitService.getBussinessUnits());
		System.out.println("the bussiness:"+bussinessunitService.getBussinessUnits());
		model.put("engagements",  bussinessunitService.getEngagements());
		System.out.println("the edit  details are ------------------>: "+bussinessunit);
		return new ModelAndView("ManageBU", model);
	}
	
	@RequestMapping(value = "/admin/deleteBussinessUnit", method = RequestMethod.GET)
	public ModelAndView deleteBussinessUnit(@ModelAttribute("BussinessUnit")  BussinessUnit bussinessunit,
			BindingResult result) {
		
		bussinessunitService.deleteBussinessUnit(bussinessunit.getBusUnitID());
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("BussinessUnit", bussinessunit);
		model.put("bussiness",  bussinessunitService.getBussinessUnits());
		model.put("engagements",  bussinessunitService.getEngagements());
		return new ModelAndView("ManageBU", model);
	}
	
	
}