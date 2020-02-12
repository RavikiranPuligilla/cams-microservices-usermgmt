package com.cams.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.maintplan.MaintPlanServDue;

@Entity
@Table(name="CUSTOMER")

public class Customer {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="course_seq")
	@SequenceGenerator(
			name="course_seq",
			sequenceName="course_sequence",
			allocationSize=20
		)
	@Column(name="customer_id")
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="ADDRESS_NUMBER")
	private int addressNumber;
	@Column(name="PASSWORD")
	private String password;
	
	@Transient
	private String passwordStr;
	
	@Transient
	private boolean userExist=false;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNo;
	@Column(name="BILLCODE_APPLICABLE")
	private String billCodeApplicable;
	@Column(name="VOYAGER_APPLICABLE")
	private String voyagerApplicable;
	@Column(name="GMMAINTENANCE_APPLICABLE")
	private String gmMaintenanceApplicable;
	
	@Column(name="PRIMARYCONTACT_NAME")
	private String primaryContactName;
	
	@Column(name="PRIMARYCONTACT_EMAIL")
	private String pimaryContactEmail;
	
	@Column(name="PRIMARYCONTACT_PHNO")
	private String primaryContactPhNo;
	
	@Column(name="PRIMARYCONTACT_NOTIFICATION")
	private String primaryContactNotification;
	
	
	@Column(name="REGISTRATION_NAME")
	private String regisContactName;
	
	@Column(name="REGISTRATION_EMAIL")
	private String regisContactEmail;
	
	@Column(name="REGISTRATION_PHNO")
	private String regisContactPhNo;
	
	@Column(name="REGISTRATION_NOTIFICATION")
	private String regisContactNotification;
	
	
	
	
	@Column(name="RECALL_NAME")
	private String recallContactName;
	
	@Column(name="RECALL_EMAIL")
	private String recallContactEmail;
	
	@Column(name="RECALL_PHNO")
	private String recallContactPhNo;
	
	@Column(name="RECALL_NOTIFICATION")
	private String recallContactNotification;
	
	
	
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name="RECALLS")
	private String recallApplicable;
	@Column(name="MILEAGE_NOTIFICATION")
	private String mileageNotification;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="REGISTRATION")
	private String isRegistered;
	
	@Column(name="CUSTOMER_LOGIN_NO")
	private String customerLoginNo;
	
	@Column(name="VOYAGER_MAINTENANCE_APPLICABLE")
	private String voyagerMaintenanceApplicable;
	
	@Column(name="OAC_APPLICABLE")
	private String OACApplicable;
	
	@Column(name="UPDATED_DATE")
	private java.util.Date updatedDate;
	
	@Column(name="CREATION_DATE")
	private java.util.Date creationDate;
	
	@Column(name="GPS_APPLICABLE")
	private String gpsApplicable;
	
	@Column(name="VOYAGER_ACCOUNT_NUM")
	private String voyagerAccountNum;
	
	@Column(name="GPS_ACCOUNT_NUM")
	private String gpsAccountNum;
	
	@Column(name="PO_APPROVAL_LIMIT")
	private String poApprovalLimit;
	
	@Column(name="PO_APPROVAL_NOTES")
	private String poApprovalNotes;
	
	@Column(name="MAINT_PLAN_ID")
	private long maintPlanId;
	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID")
	private Set<CustomerContact> customerContactRecords = new HashSet<CustomerContact>(
			0);
	
	public Customer() {
		
	}
	
	



	
	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBillCodeApplicable() {
		return billCodeApplicable;
	}
	public void setBillCodeApplicable(String billCodeApplicable) {
		this.billCodeApplicable = billCodeApplicable;
	}
	public String getVoyagerApplicable() {
		return voyagerApplicable;
	}
	public void setVoyagerApplicable(String voyagerApplicable) {
		this.voyagerApplicable = voyagerApplicable;
	}
	public String getGmMaintenanceApplicable() {
		return gmMaintenanceApplicable;
	}
	public void setGmMaintenanceApplicable(String gmMaintenanceApplicable) {
		this.gmMaintenanceApplicable = gmMaintenanceApplicable;
	}
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	public String getPimaryContactEmail() {
		return pimaryContactEmail;
	}
	public void setPimaryContactEmail(String pimaryContactEmail) {
		this.pimaryContactEmail = pimaryContactEmail;
	}
	public String getPrimaryContactPhNo() {
		return primaryContactPhNo;
	}
	public void setPrimaryContactPhNo(String primaryContactPhNo) {
		this.primaryContactPhNo = primaryContactPhNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPrimaryContactNotification() {
		return primaryContactNotification;
	}
	public void setPrimaryContactNotification(String primaryContactNotification) {
		this.primaryContactNotification = primaryContactNotification;
	}
	public String getRecallApplicable() {
		return recallApplicable;
	}
	public void setRecallApplicable(String recallApplicable) {
		this.recallApplicable = recallApplicable;
	}
	public String getMileageNotification() {
		return mileageNotification;
	}
	public void setMileageNotification(String mileageNotification) {
		this.mileageNotification = mileageNotification;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getIsRegistered() {
		return isRegistered;
	}
	public void setIsRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}
	public String getCustomerLoginNo() {
		return customerLoginNo;
	}
	public void setCustomerLoginNo(String customerLoginNo) {
		this.customerLoginNo = customerLoginNo;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getRegisContactName() {
		return regisContactName;
	}
	public void setRegisContactName(String regisContactName) {
		this.regisContactName = regisContactName;
	}
	public String getRegisContactEmail() {
		return regisContactEmail;
	}
	public void setRegisContactEmail(String regisContactEmail) {
		this.regisContactEmail = regisContactEmail;
	}
	public String getRegisContactPhNo() {
		return regisContactPhNo;
	}
	public void setRegisContactPhNo(String regisContactPhNo) {
		this.regisContactPhNo = regisContactPhNo;
	}
	public String getRegisContactNotification() {
		return regisContactNotification;
	}
	public void setRegisContactNotification(String regisContactNotification) {
		this.regisContactNotification = regisContactNotification;
	}
	public String getRecallContactName() {
		return recallContactName;
	}
	public void setRecallContactName(String recallContactName) {
		this.recallContactName = recallContactName;
	}
	public String getRecallContactEmail() {
		return recallContactEmail;
	}
	public void setRecallContactEmail(String recallContactEmail) {
		this.recallContactEmail = recallContactEmail;
	}
	public String getRecallContactPhNo() {
		return recallContactPhNo;
	}
	public void setRecallContactPhNo(String recallContactPhNo) {
		this.recallContactPhNo = recallContactPhNo;
	}
	public String getRecallContactNotification() {
		return recallContactNotification;
	}
	public void setRecallContactNotification(String recallContactNotification) {
		this.recallContactNotification = recallContactNotification;
	}
	public String getPasswordStr() {
		return passwordStr;
	}
	public void setPasswordStr(String passwordStr) {
		this.passwordStr = passwordStr;
	}
	public boolean isUserExist() {
		return userExist;
	}
	public void setUserExist(boolean userExist) {
		this.userExist = userExist;
	}
	public String getVoyagerMaintenanceApplicable() {
		return voyagerMaintenanceApplicable;
	}
	public void setVoyagerMaintenanceApplicable(String voyagerMaintenanceApplicable) {
		this.voyagerMaintenanceApplicable = voyagerMaintenanceApplicable;
	}
	public String getGpsApplicable() {
		return gpsApplicable;
	}
	public void setGpsApplicable(String gpsApplicable) {
		this.gpsApplicable = gpsApplicable;
	}


	public String getVoyagerAccountNum() {
		return voyagerAccountNum;
	}


	public void setVoyagerAccountNum(String voyagerAccountNum) {
		this.voyagerAccountNum = voyagerAccountNum;
	}


	public String getGpsAccountNum() {
		return gpsAccountNum;
	}


	public void setGpsAccountNum(String gpsAccountNum) {
		this.gpsAccountNum = gpsAccountNum;
	}


	public String getPoApprovalLimit() {
		return poApprovalLimit;
	}


	public void setPoApprovalLimit(String poApprovalLimit) {
		this.poApprovalLimit = poApprovalLimit;
	}


	public String getPoApprovalNotes() {
		return poApprovalNotes;
	}


	public void setPoApprovalNotes(String poApprovalNotes) {
		this.poApprovalNotes = poApprovalNotes;
	}

	public Set<CustomerContact> getCustomerContactRecords() {
		return customerContactRecords;
	}

	public void setCustomerContactRecords(Set<CustomerContact> customerContactRecords) {
		this.customerContactRecords = customerContactRecords;
	}


	public long getMaintPlanId() {
		return maintPlanId;
	}


	public void setMaintPlanId(long maintPlanId) {
		this.maintPlanId = maintPlanId;
	}


	public String getOACApplicable() {
		return OACApplicable;
	}


	public void setOACApplicable(String oACApplicable) {
		OACApplicable = oACApplicable;
	}
	
}
