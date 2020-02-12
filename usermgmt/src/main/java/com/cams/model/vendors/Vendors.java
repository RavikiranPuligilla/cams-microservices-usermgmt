package com.cams.model.vendors;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CAMS_VENDOR_DETAILS")
public class Vendors {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vendor_seq")
	@SequenceGenerator(
			name="vendor_seq",
			sequenceName="vendor_seq",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="VENDOR_NUMBER")
	private int vendorNum;
	
	@Column(name="VENDOR_NAME")
	private String vendorName;
	
	@Column(name="PRIMARY_CONTACT")
	private String primaryContact;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNum;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	
	@Column(name="MAILING_ADDRESS")
	private String mailingAddress;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="UPLOADED_PATH")
	private String uploadedPath;
	
	
	
	@Column(name="ZIPCODE")
	private long zipCode;
	
	@Column(name="VENDOR_TYPE")
	private String vendorType;
	
	
	@Column(name="CREATION_DATE")
	private java.util.Date creationDate;
	
	@Column(name="UPDATED_DATE")
	private java.util.Date updatedDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="EMAIL_STATUS")
	private String emailStatus;
	
	@Column(name="VENDOR_STATUS")
	private String vendorStatus;
	
	@Transient
	private String addMethod;

	@Transient
	private boolean vendorExist;
	

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorNum() {
		return vendorNum;
	}

	public void setVendorNum(int vendorNum) {
		this.vendorNum = vendorNum;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
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

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	

	public String getUploadedPath() {
		return uploadedPath;
	}

	public void setUploadedPath(String uploadedPath) {
		this.uploadedPath = uploadedPath;
	}

	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	public String getVendorStatus() {
		return vendorStatus;
	}

	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}

	public String getAddMethod() {
		return addMethod;
	}

	public void setAddMethod(String addMethod) {
		this.addMethod = addMethod;
	}

	public boolean isVendorExist() {
		return vendorExist;
	}

	public void setVendorExist(boolean vendorExist) {
		this.vendorExist = vendorExist;
	}
	
	

}
