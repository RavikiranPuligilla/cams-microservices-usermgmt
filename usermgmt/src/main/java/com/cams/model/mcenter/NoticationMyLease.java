package com.cams.model.mcenter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.Customer;
import com.cams.model.chromadata.KeyPair;
import com.cams.model.maintplan.MaintPlanServDue;
import com.cams.model.po.PurchaseOrder;
import com.cams.model.voyager.VoyagerFileTransactionData;


@Entity
@Table(name="CAMS_LEASE_DETAIL")

public class NoticationMyLease {
	
	public NoticationMyLease() {
		
	}
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="ADDRESS_NUMBER")
	private int addressNum;
	@Column(name="LEASE_NUMBER")
	private String leaseNum;
	
	@Column(name="CATEGORY_CODE")
	private String categoryCode;
	
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
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="LICENSE_STATE")
	private String lienseState;
	
	@Column(name="LICENSE_EXPIRATION")
	private Date licenseExpirationDate;
	
	 
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="LEASE_REG_DATE")
	private Date leaseRegistrationDate;
	
	@Column(name="LEASE_TERM")
	private int leaseTerm;
	
	@Column(name="AGREED_VALUE")
	private float agreedValue;
	

	
	@Column(name="RESERVE_AMOUNT")
	private float reserveAmount;
	
	@Column(name="RENTAL_AMOUNT")
	private float rentalAmount;
	
	@Column(name="LICENSE_PLAT")
	private String licensePlate;
	
	@Column(name="REPORT_DATE")
	private Date reportDate;
	
	@Column(name="MANUFACTURE_CODE")
	private String manufacturerCode;
	
	@Column(name="MODEL_YEAR")
	private String modelYear;
	
	@Column(name="TAX")
	private float tax;
	
	@Column(name="UNIT_TYPE")
	private int unitType;
	
	@Column(name="CURRENT_RESERVE")
	private float currentReserve;
	
	@Column(name="BILLS_CODE")
	private String billCodes;
	
	@Transient
	private ArrayList<Customer> usersRecords = new ArrayList<Customer>(
			0);
	
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLienseState() {
		return lienseState;
	}
	public void setLienseState(String lienseState) {
		this.lienseState = lienseState;
	}
	public Date getLicenseExpirationDate() {
		return licenseExpirationDate;
	}
	public void setLicenseExpirationDate(Date licenseExpirationDate) {
		this.licenseExpirationDate = licenseExpirationDate;
	}
	public String getVinNum() {
		return vinNum;
	}
	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}
	public Date getLeaseRegistrationDate() {
		return leaseRegistrationDate;
	}
	public void setLeaseRegistrationDate(Date leaseRegistrationDate) {
		this.leaseRegistrationDate = leaseRegistrationDate;
	}
	public int getLeaseTerm() {
		return leaseTerm;
	}
	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}
	public float getAgreedValue() {
		return agreedValue;
	}
	public void setAgreedValue(float agreedValue) {
		this.agreedValue = agreedValue;
	}
	
	public float getReserveAmount() {
		return reserveAmount;
	}
	public void setReserveAmount(float reserveAmount) {
		this.reserveAmount = reserveAmount;
	}
	public float getRentalAmount() {
		return rentalAmount;
	}
	public void setRentalAmount(float rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getManufacturerCode() {
		return manufacturerCode;
	}
	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public int getUnitType() {
		return unitType;
	}
	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}
	public float getCurrentReserve() {
		return currentReserve;
	}
	public void setCurrentReserve(float currentReserve) {
		this.currentReserve = currentReserve;
	}
	public String getBillCodes() {
		return billCodes;
	}
	public void setBillCodes(String billCodes) {
		this.billCodes = billCodes;
	}
	public ArrayList<Customer> getUsersRecords() {
		return usersRecords;
	}
	public void setUsersRecords(ArrayList<Customer> usersRecords) {
		this.usersRecords = usersRecords;
	}

	
}
