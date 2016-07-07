package com.jtd.spring4mvc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "RecFailure")
public class ImportFile {
	
	private int id;
	private String calRef;
    private String category;
    private String customer;
    private Date openDate;
    private String Priority;
    private String Status;
    private String AssignedTo;
    private Date closedAt;
    private String closedBy;
    private String fixedBy;
    private String causeCode;
    private String problemSummary;
    
    
    
    @Id
    @Column(name="id")
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "calRef")
	public String getCalRef() {
		return calRef;
	}
	public void setCalRef(String calRef) {
		this.calRef = calRef;
	}
	
	 @Column(name = "category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	 @Column(name = "customer")
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	 @Column(name = "openDate")
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	 @Column(name = "Priority")
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	
	 @Column(name = "Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	@Column(name = "AssignedTo")
	
	 public String getAssignedTo() {
		return AssignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		AssignedTo = assignedTo;
	}
	
	
	@Column(name = "closedAt")
	public Date getClosedAt() {
		return closedAt;
	}
	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}
	
	 @Column(name = "closedBy")
	public String getClosedBy() {
		return closedBy;
	}
	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}
	
	
	 @Column(name = "fixedBy")
	public String getFixedBy() {
		return fixedBy;
	}
	public void setFixedBy(String fixedBy) {
		this.fixedBy = fixedBy;
	}
	
	 @Column(name = "causeCode")
	public String getCauseCode() {
		return causeCode;
	}
	public void setCauseCode(String causeCode) {
		this.causeCode = causeCode;
	}
	
	 @Column(name = "problemSummary")
	public String getProblemSummary() {
		return problemSummary;
	}
	public void setProblemSummary(String problemSummary) {
		this.problemSummary = problemSummary;
	}
	
	
 
}   	
