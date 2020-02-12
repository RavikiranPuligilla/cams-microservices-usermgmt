package com.cams.model.po;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.Customer;
import com.cams.model.CustomerContact;
import com.cams.model.chromadata.KeyPair;
import com.cams.model.mylease.MyLease;
import com.cams.model.voyager.VoyagerFileTransactionData;

@Entity
@Table(name="CAMS_PO")
public class PurchaseOrder {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="po_seq")
	@SequenceGenerator(
			name="po_seq",
			sequenceName="po_sequence",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;

	@Column(name="ADDRESS_NUMBER")
	private int addressNum;
	
	@Column(name="LEASE_NUMBER")
	private String leaseNum;
	
	@Column(name="POSDATE")
	private String poStartDate;
	
	@Column(name="POEDATE")
	private String poEndDate;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="VENDOR_NAME")
	private String vendorName;
	
	@Column(name="LIMIT")
	private String limit;
	
	@Column(name="POAMT")
	private String poAmount;
	
	@Column(name="VIN")
	private String vinNum;
	
	@Column(name="LICENSE_PLAT")
	private String licensePlate;
	
	@Column(name="YEAR")
	private String year;
	
	@Column(name="MAKE")
	private String make;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	
	@Column(name="DRIVER")
	private String driverName;
	//
	@Column(name="VENDOR_ID")
	private String vendorId;
	
	@Column(name="VCONTACT_NAME")
	private String vContactName;
	
	@Column(name="VPHONE_NUMBER")
	private String vPhoneNumber;
	
	@Column(name="MILEAGE")
	private long mileage;
	
	@Column(name="VENDOR_TYPE")
	private String vendorType;
	
	@Column(name="TOTAL_MAINT_AMT")
	private double  totalMaintAmt;
	
	@Column(name="MAINT_DESC")
	private String maintDesc;
	
	@Column(name="CREATION_DATE")
	private java.util.Date creationDate;
	
	@Column(name="UPDATED_DATE")
	private java.util.Date updatedDate;
	
	@Column(name="PO_VERIFIED")
	private String poVerified;
	
	@Column(name="WP_NOTES")
	private String wpNotes;
	
	
	@Transient
	private Set<CustomerContact> customerContactRecords;
	
	@Transient
	private String poApprovalLimit;
	@Transient
	private String poApprovalNotes;
	
	
	
	public Set<CustomerContact> getCustomerContactRecords() {
		return customerContactRecords;
	}

	public void setCustomerContactRecords(Set<CustomerContact> customerContactRecords) {
		this.customerContactRecords = customerContactRecords;
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

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PO_ID")
	private Set<PurchaseOrderWP> wpRecords = new HashSet<PurchaseOrderWP>(
			0);
	
	public PurchaseOrder(int id, int addressNum,String leaseNum) {
		this.id=id;
		this.addressNum = addressNum;
		this.leaseNum = leaseNum;
	
	}
	
	public PurchaseOrder() {
		
	
	}
	
	public PurchaseOrder(int id, int addressNum,String leaseNum,
			Set<PurchaseOrderWP> wpRecords) {
		this.id=id;
		this.addressNum = addressNum;
		this.leaseNum = leaseNum;
		this.wpRecords = wpRecords;
	}
	
	public Set<PurchaseOrderWP> getWpRecords() {
		return wpRecords;
	}

	public void setWpRecords(Set<PurchaseOrderWP> wpRecords) {
		this.wpRecords = wpRecords;
	}

	@Transient
	private String postaretDateString="";
	
	@Transient
	private MyLease myleaseData;

	public MyLease getMyleaseData() {
		return myleaseData;
	}

	public void setMyleaseData(MyLease myleaseData) {
		this.myleaseData = myleaseData;
	}

	public String getPostaretDateString() {
		return postaretDateString;
	}

	public void setPostaretDateString(String postaretDateString) {
		this.postaretDateString = postaretDateString;
	}

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

	public String getPoStartDate() {
		return poStartDate;
	}

	public void setPoStartDate(String poStartDate) {
		this.poStartDate = poStartDate;
	}

	public String getPoEndDate() {
		return poEndDate;
	}

	public void setPoEndDate(String poEndDate) {
		this.poEndDate = poEndDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(String poAmount) {
		this.poAmount = poAmount;
	}

	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getvContactName() {
		return vContactName;
	}

	public void setvContactName(String vContactName) {
		this.vContactName = vContactName;
	}

	public String getvPhoneNumber() {
		return vPhoneNumber;
	}

	public void setvPhoneNumber(String vPhoneNumber) {
		this.vPhoneNumber = vPhoneNumber;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public double getTotalMaintAmt() {
		return totalMaintAmt;
	}

	public void setTotalMaintAmt(double totalMaintAmt) {
		this.totalMaintAmt = totalMaintAmt;
	}

	public String getMaintDesc() {
		return maintDesc;
	}

	public void setMaintDesc(String maintDesc) {
		this.maintDesc = maintDesc;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getPoVerified() {
		return poVerified;
	}

	public void setPoVerified(String poVerified) {
		this.poVerified = poVerified;
	}

	public String getWpNotes() {
		return wpNotes;
	}

	public void setWpNotes(String wpNotes) {
		this.wpNotes = wpNotes;
	}

	
	
	
	
	}
