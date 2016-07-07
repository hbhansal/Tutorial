package com.jtd.spring4mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jtd.spring4mvc.dao.CauseCodeDao;
import com.jtd.spring4mvc.entity.CauseCodeBean;
import com.jtd.spring4mvc.entity.Engagement;
@Service("causeCodeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CauseCodeServiceimpl implements CauseCodeService {
	
	@Autowired
	private CauseCodeDao causeCodeDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCauseCode(CauseCodeBean causeCodeBean) {
		causeCodeDao.addCauseCode(causeCodeBean);
		
	}

	public CauseCodeDao getCauseCodeDao() {
		return causeCodeDao;
	}

	public void setCauseCodeDao(CauseCodeDao causeCodeDao) {
		this.causeCodeDao = causeCodeDao;
	}

	@Override
	public List<CauseCodeBean> getCauseCodes() {
		return causeCodeDao.getCauseCodes();
	}

	@Override
	public void updateCauseCode(CauseCodeBean causeCodeBean) {
		this.causeCodeDao.updateCauseCode(causeCodeBean);
		
	}

	@Override
	public CauseCodeBean getCauseCode(int causeCodeId) {
		return causeCodeDao.getCauseCode(causeCodeId);
	}

	@Override
	public void deleteCauseCode(int causeCodeId) {
		causeCodeDao.deleteCauseCode(causeCodeId);
		
	}

	@Override
	public List<Engagement> getEngagements() {
		return causeCodeDao.getEngagements();
	}

}
