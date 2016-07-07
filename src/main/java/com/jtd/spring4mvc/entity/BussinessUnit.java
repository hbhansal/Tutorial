package com.jtd.spring4mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Table(name="bussinessunit")
public class BussinessUnit {
	@Id
	@GeneratedValue
	@Column(name="BusUnitID")
	private int busUnitID;
	
	@Column(name="EngagementID")
	private int engagementID;
	
	@Column(name="BusUnitName")
	private String busUnitName;
	
	@Column(name="Description")
	private String description;
	
	@ManyToOne 
	@NotFound(action=NotFoundAction.IGNORE)
    @JoinColumn(name="EngagementID",updatable=false,insertable=false)
	private Engagement engagement;
	
	public Engagement getEngagement() {
		return engagement;
	}

	public void setEngagement(Engagement engagement) {
		this.engagement = engagement;
	}

	
	@Override
	public String toString() {
		return "BussinessUnit [busUnitID=" + busUnitID + ", engagementID="
				+ engagementID + ", busUnitName=" + busUnitName
				+ ", description=" + description + ", engagement=" + engagement
				+ ", getEngagement()=" + getEngagement()
				+ ", getDescription()=" + getDescription()
				+ ", getBusUnitID()=" + getBusUnitID() + ", getEngagementID()="
				+ getEngagementID() + ", getBusUnitName()=" + getBusUnitName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public int getBusUnitID() {
		return busUnitID;
	}

	public void setBusUnitID(int busUnitID) {
		this.busUnitID = busUnitID;
	}

	public int getEngagementID() {
		return engagementID;
	}

	public void setEngagementID(int engagementID) {
		this.engagementID = engagementID;
	}

	public String getBusUnitName() {
		return busUnitName;
	}

	public void setBusUnitName(String busUnitName) {
		this.busUnitName = busUnitName;
	}
	
	


}
