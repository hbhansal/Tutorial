package com.jtd.spring4mvc.dao;

import java.util.List;

import com.jtd.spring4mvc.entity.BussinessUnit;
import com.jtd.spring4mvc.entity.Engagement;



public interface BussinessUnitDao {
	
	public void addBussinessUnit(BussinessUnit bussinessunit);
	 
	 public List<BussinessUnit> getBussinessUnits();
	 
	 
	 public void updateBussinessUnit(BussinessUnit bussinessunit);
	 
	 public BussinessUnit getBussinessUnit(int bussinessUnitId);
	 
	 public void deleteBussinessUnit(int bussinessUnitId);
	 
	 public List<Engagement> getEngagements();

}


