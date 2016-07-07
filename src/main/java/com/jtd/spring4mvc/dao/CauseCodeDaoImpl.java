package com.jtd.spring4mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jtd.spring4mvc.entity.CauseCodeBean;
import com.jtd.spring4mvc.entity.Engagement;
@Repository("causeCodeDao")
public class CauseCodeDaoImpl implements CauseCodeDao{
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addCauseCode(CauseCodeBean causeCodeBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(causeCodeBean);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CauseCodeBean> getCauseCodes() {
		return (List<CauseCodeBean>) sessionFactory.getCurrentSession().createCriteria(CauseCodeBean.class).list();
	}

	@Override
	public void updateCauseCode(CauseCodeBean causeCodeBean) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(causeCodeBean);
		
	}

	@Override
	public CauseCodeBean getCauseCode(int causeCodeId) {
		return (CauseCodeBean) sessionFactory.getCurrentSession().get(CauseCodeBean.class, causeCodeId);
	}

	@Override
	public void deleteCauseCode(int causeCodeId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CauseCodeBean WHERE causeCodeId = "+causeCodeId).executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engagement> getEngagements() {
		return (List<Engagement>) sessionFactory.getCurrentSession().createCriteria(Engagement.class).list();
	}

}
