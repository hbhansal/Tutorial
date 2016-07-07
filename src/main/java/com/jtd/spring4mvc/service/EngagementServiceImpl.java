package com.jtd.spring4mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import com.jtd.spring4mvc.dao.EngagementDao;
import com.jtd.spring4mvc.entity.Engagement;
import com.jtd.spring4mvc.entity.Sectors;




@Service("engagementService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EngagementServiceImpl implements EngagementService {

	@Autowired
	private EngagementDao engagementDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEngagement(Engagement engagement) {
		engagementDao.addEngagement(engagement);
	}

	public EngagementDao getEngagementDao() {
		return engagementDao;
	}

	public void setEngagementDao(EngagementDao engagementDao) {
		this.engagementDao = engagementDao;
	}

	@Override
	public Engagement getEngagement(int engagementId) {
		return engagementDao.getEngagement(engagementId);
	}

	

	@Override
	public List<Engagement> getEngagements() {
		return engagementDao.getEngagements();
	}

	@Override
	public List<Sectors> getSectors() {
		
		return engagementDao.getSectors();
	}

	@Override
	public void deleteEngagement(int engagementId) {
		engagementDao.deleteEngagement(engagementId);
		
	}

	@Override
	public void updateEngagement(Engagement engagement) {
		this.engagementDao.updateEngagement(engagement);
		
	}

	

}
