package com.jtd.spring4mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="Engagement")
public class Engagement implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	@Column(name = "EngagementID")
	private Integer engagementID;
	
	@Column(name="EngagementName")
	private String engagementName;
	
	
	@Column(name="SectorID")
	private int sector;

	@Column(name="description")
	private String description;
	
	public Sectors getSectors() {
		return sectors;
	}



	public void setSectors(Sectors sectors) {
		this.sectors = sectors;
	}



	@ManyToOne 
    @JoinColumn(name="SectorID",updatable=false,insertable=false)
	private Sectors sectors;

	public int getSector() {
		return sector;
	}



	public void setSector(int sector) {
		this.sector = sector;
	}



	public Integer getEngagementID() {
		return engagementID;
	}



	public void setEngagementID(Integer engagementID) {
		this.engagementID = engagementID;
	}



	public String getEngagementName() {
		return engagementName;
	}



	public void setEngagementName(String engagementName) {
		this.engagementName = engagementName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Engagement [engagementID=" + engagementID + ", engagementName="
				+ engagementName  + ", sector=" + sector
				+ ", description=" + description + "]";
	}

	
}
