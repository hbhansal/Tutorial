package com.jtd.spring4mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jtd.spring4mvc.entity.BussinessUnit;
import com.jtd.spring4mvc.entity.Engagement;
@Repository("bussinessUnitDao")
public class BussinessUnitDaoImpl implements BussinessUnitDao{
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void addBussinessUnit(BussinessUnit bussinessunit) {
		System.out.println("The Bussiness Unit object contains at DAOIMPL:"+bussinessunit);
		sessionFactory.getCurrentSession().saveOrUpdate(bussinessunit);
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BussinessUnit> getBussinessUnits() {
		return (List<BussinessUnit>) sessionFactory.getCurrentSession().createCriteria(BussinessUnit.class).list();
	}

	@Override
	public void updateBussinessUnit(BussinessUnit bussinessunit) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(bussinessunit);
		
	}

	@Override
	public BussinessUnit getBussinessUnit(int bussinessUnitId) {
		return (BussinessUnit) sessionFactory.getCurrentSession().get(BussinessUnit.class, bussinessUnitId);
	}

	@Override
	public void deleteBussinessUnit(int bussinessUnitId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM BussinessUnit WHERE busUnitID = "+bussinessUnitId).executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engagement> getEngagements() {
		return (List<Engagement>) sessionFactory.getCurrentSession().createCriteria(Engagement.class).list();
		
	}

}
