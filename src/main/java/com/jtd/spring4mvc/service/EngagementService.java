package com.jtd.spring4mvc.service;

import java.util.List;





import com.jtd.spring4mvc.entity.Engagement;
import com.jtd.spring4mvc.entity.Sectors;

public interface  EngagementService {
	
	 public void addEngagement(Engagement engagement);
	 
	 public List<Engagement> getEngagements();
	 
	 
	 public void updateEngagement(Engagement engagement);
	 
	 public Engagement getEngagement(int engagementId);
	 
	 public void deleteEngagement(int engagementId);
	 
	 public List<Sectors> getSectors();

	

}
