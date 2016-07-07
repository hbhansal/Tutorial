package com.jtd.spring4mvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jtd.spring4mvc.entity.ImportFile;



@Controller("ImportController")
@Repository
public class FileImportDAOImpl implements FileImportDAO {
   @Autowired
    private SessionFactory sessionFactory;
     
    public FileImportDAOImpl() {
    }
 
    public FileImportDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional
    public void save(ImportFile importFile) {
    	try{
        sessionFactory.getCurrentSession().saveOrUpdate(importFile);
    	}
		catch(RuntimeException e)
		{
				e.printStackTrace();					
		}
    }
}
