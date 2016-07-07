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
@Table(name="CauseCode")
public class CauseCodeBean 

{
	@Id
	@GeneratedValue
	@Column(name="CauseCodeID")
	private int causeCodeID;
	
	@Column(name="EngagementID")
	private int engCauseCodeID;
	
	@Column(name="CauseCode")
	private String causeCode;
	
	@Column(name="KeyWord1")
	private String keyWord1;
	
	@Column(name="KeyWord2")
	private String	keyWord2;
	
	@Column(name="KeyWord3")
	private String	keyWord3;
	
	@ManyToOne 
	@NotFound(action=NotFoundAction.IGNORE)
    @JoinColumn(name="EngagementID",updatable=false,insertable=false)
	private Engagement engagement;

	public int getCauseCodeID() {
		return causeCodeID;
	}

	public void setCauseCodeID(int causeCodeID) {
		this.causeCodeID = causeCodeID;
	}

	public int getEngCauseCodeID() {
		return engCauseCodeID;
	}

	public void setEngCauseCodeID(int engCauseCodeID) {
		this.engCauseCodeID = engCauseCodeID;
	}

	public String getCauseCode() {
		return causeCode;
	}

	public void setCauseCode(String causeCode) {
		this.causeCode = causeCode;
	}

	public String getKeyWord1() {
		return keyWord1;
	}

	public void setKeyWord1(String keyWord1) {
		this.keyWord1 = keyWord1;
	}

	public String getKeyWord2() {
		return keyWord2;
	}

	public void setKeyWord2(String keyWord2) {
		this.keyWord2 = keyWord2;
	}

	public String getKeyWord3() {
		return keyWord3;
	}

	public void setKeyWord3(String keyWord3) {
		this.keyWord3 = keyWord3;
	}

	public Engagement getEngagement() {
		return engagement;
	}

	public void setEngagement(Engagement engagement) {
		this.engagement = engagement;
	}

	@Override
	public String toString() {
		return "CauseCodeBean [causeCodeID=" + causeCodeID
				+ ", engCauseCodeID=" + engCauseCodeID + ", causeCode="
				+ causeCode + ", keyWord1=" + keyWord1 + ", keyWord2="
				+ keyWord2 + ", keyWord3=" + keyWord3 + ", engagement="
				+ engagement + "]";
	}

	

	


	
	

	
	


}
