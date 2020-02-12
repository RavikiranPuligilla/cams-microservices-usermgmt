package com.cams.model.mylease;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CAMS_LEASE_VEHICLEINFO")
public class LeaseRelatedVehicleInfo {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vehicleinfoleasecol_seq")
	@SequenceGenerator(
			name="vehicleinfoleasecol_seq",
			sequenceName="vehicleinfoleasecol_sequence",
			allocationSize=1
		)
	
	@Column(name="ID")
	private int id;
		
	@Column(name="STATE")
	private String state;
	
	@Column(name="EXPIRATION_DATE")
	private Date licenseExpiryDate;
	
	@Column(name="LICENSE_NUMBER")
	private String licenseNum;
	
	@Column(name="COMMENTS")
	private String coments;
	
	@Column(name="EMAILID")
	private String emailID;
	
	@Column(name="LEASENUMBER")
	private String leaseNum;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_TIME")
	private Date modifiedTime;
	
	@Transient
	private String licenseExpiryDateStr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getComents() {
		return coments;
	}

	public void setComents(String coments) {
		this.coments = coments;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getLeaseNum() {
		return leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getLicenseExpiryDateStr() {
		return licenseExpiryDateStr;
	}

	public void setLicenseExpiryDateStr(String licenseExpiryDateStr) {
		this.licenseExpiryDateStr = licenseExpiryDateStr;
	}

	
	

}
