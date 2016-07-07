package com.jtd.spring4mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jtd.spring4mvc.entity.Engagement;
import com.jtd.spring4mvc.entity.Sectors;





@Repository("engagementDao")
public class EngagementDaoImpl implements EngagementDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEngagement(Engagement engagement) {
		sessionFactory.getCurrentSession().saveOrUpdate(engagement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engagement> getEngagements() {
		return (List<Engagement>) sessionFactory.getCurrentSession().createCriteria(Engagement.class).list();
	}
	


	@Override
	public Engagement getEngagement(int engagementId)
	{
		return (Engagement) sessionFactory.getCurrentSession().get(Engagement.class, engagementId);
		
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Sectors> getSectors() {
		// TODO Auto-generated method stub
		return (List<Sectors>) sessionFactory.getCurrentSession().createCriteria(Sectors.class).list();
	}

	@Override
	public void deleteEngagement(int engagementId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Engagement WHERE engagementID = "+engagementId).executeUpdate();
		
	}

	@Override
	public void updateEngagement(Engagement engagement) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(engagement);
		
	}
		
	}

	

	

