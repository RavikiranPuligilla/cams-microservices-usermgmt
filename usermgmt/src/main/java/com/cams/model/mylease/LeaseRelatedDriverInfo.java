package com.cams.model.mylease;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_LEASE_DRIVERINFO")
public class LeaseRelatedDriverInfo {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="driverinfoleasecol_seq")
	@SequenceGenerator(
			name="driverinfoleasecol_seq",
			sequenceName="driverinfoleasecol_sequence",
			allocationSize=1
		)
	
	@Column(name="ID")
	private int id;
	@Column(name="DRIVERNAME")
	private String driverName;
	
	@Column(name="UNITID")
	private String unitID;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="ZIPCODE")
	private String zipcode;
	
	@Column(name="COUNTY")
	private String country;
	
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

	public String getLeaseNum() {
		return leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUnitID() {
		return unitID;
	}

	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	

}
