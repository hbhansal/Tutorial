package com.jtd.spring4mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jtd.spring4mvc.dao.BussinessUnitDao;
import com.jtd.spring4mvc.entity.BussinessUnit;
import com.jtd.spring4mvc.entity.Engagement;
@Service("bussinessunitService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BussinessUnitServiceimpl implements BussinessUnitService{
	@Autowired
	private BussinessUnitDao bussinessUnitDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addBussinessUnit(BussinessUnit bussinessunit) {
		bussinessUnitDao.addBussinessUnit(bussinessunit);
		
	}

	@Override
	public List<BussinessUnit> getBussinessUnits() {
		return bussinessUnitDao.getBussinessUnits();
	}

	@Override
	public void updateBussinessUnit(BussinessUnit bussinessunit) {
		this.bussinessUnitDao.updateBussinessUnit(bussinessunit);
		
	}

	@Override
	public BussinessUnit getBussinessUnit(int bussinessUnitId) {
		return bussinessUnitDao.getBussinessUnit(bussinessUnitId);
	}

	@Override
	public void deleteBussinessUnit(int bussinessUnitId) {
		bussinessUnitDao.deleteBussinessUnit(bussinessUnitId);
		
	}

	public BussinessUnitDao getBussinessUnitDao() {
		return bussinessUnitDao;
	}

	public void setBussinessUnitDao(BussinessUnitDao bussinessUnitDao) {
		this.bussinessUnitDao = bussinessUnitDao;
	}

	@Override
	public List<Engagement> getEngagements() {
		return bussinessUnitDao.getEngagements();
	}

}
