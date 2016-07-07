package com.jtd.spring4mvc.dao;

import java.util.List;


import com.jtd.spring4mvc.entity.Engagement;
import com.jtd.spring4mvc.entity.Sectors;

public interface  EngagementDao {
	
	 public void addEngagement(Engagement engagement);
	 
	 public List<Engagement> getEngagements();
	 
	 public Engagement getEngagement(int engagementId);
	 
	 //public void deleteEngagement(Engagement engagement);
	 
	 public List<Sectors> getSectors();

	void deleteEngagement(int engagementId);

	public void updateEngagement(Engagement engagement);

}
