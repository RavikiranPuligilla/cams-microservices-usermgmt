package com.cams.model.maintenancedata;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_MAINTENANCE_DETAIL")
public class MaintenanceDetail {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maintenance_seq")
	@SequenceGenerator(
			name="maintenance_seq",
			sequenceName="maintenance_sequence",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="ADDRESS_NUMBER")
	private int addressNum;
	
	@Column(name="LEASE_NUMBER")
	private String leaseNum;
	
	@Column(name="ADDRESSLINE1")
	private String addressLine1;
	
	@Column(name="ADDRESSLINE2")
	private String addressLine2;
	
	@Column(name="ADDRESSLINE3")
	private String addressLine3;
	
	@Column(name="ADDRESSLINE4")
	private String addressLine4;
	
	@Column(name="ADDRESSLINE5")
	private String addressLine5;
	
	@Column(name="DESCRIPTION")
	private String description1;
	
	@Column(name="DESCRIPTION2")
	private String description2;
	
	@Column(name="DESCRIPTION3")
	private String description3;
	
	@Column(name="REMARK")
	private String remark;
	
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="SERVICE_DATE")
	private Date serviceDate;
	
	@Column(name="SERVICE_DESCRIPTION")
	private String serviceDescription;
	
	@Column(name="SERVICE_TYPE")
	private String serviceType;
	
	@Column(name="MILEAGE")
	private int mileage;
	
	@Column(name="GROSS_AMOUNT")
	private int grossAmount;
	
	@Column(name="AMOUNT")
	private int amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressNum() {
		return addressNum;
	}

	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}

	public String getLeaseNum() {
		return leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getAddressLine5() {
		return addressLine5;
	}

	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(int grossAmount) {
		this.grossAmount = grossAmount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	

}
