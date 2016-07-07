package com.jtd.spring4mvc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Sectors")
	public class Sectors {
	
	
	@Id
	@Column(name="SectorId")
	private Integer sectorID;
	@Column(name ="SectorName")
	private String sectorName;
	@Column(name ="Description")
	private String description;
	public Integer getSectorID() {
		return sectorID;
	}
	public void setSectorID(Integer sectorID) {
		sectorID = sectorID;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
	
	
	
	
}
