package com.cams.model.mylease;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.CustomerContact;
import com.cams.model.chromadata.KeyPair;
import com.cams.model.po.PurchaseOrder;
import com.cams.model.voyager.VoyagerFileTransactionData;
import com.cams.model.voyager.VoyagerFileTransactionDataBean;


@Entity
@Table(name="CAMS_LEASE_DETAIL")

public class MyLease {
	
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
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mylease_seq")
	@SequenceGenerator(
			name="mylease_seq",
			sequenceName="mylease_sequence",
			allocationSize=20
		)
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="LEASE_REG_DATE")
	private Date leaseRegistrationDate;
	
	@Column(name="LEASE_TERM")
	private int leaseTerm;
	
	@Column(name="AGREED_VALUE")
	private double agreedValue;
	
	@Column(name="SKIP_TO_PERIOD")
	private int skipToPeriod;
	
	@Column(name="RESERVE_AMOUNT")
	private double reserveAmount;
	
	@Column(name="RENTAL_AMOUNT")
	private double rentalAmount;
	
	@Column(name="LICENSE_PLAT")
	private String licensePlate;
	
	@Column(name="REPORT_DATE")
	private Date reportDate;
	
	@Column(name="MANUFACTURE_CODE")
	private String manufacturerCode;
	
	@Column(name="MODEL_YEAR")
	private String modelYear;
	
	@Column(name="TAX")
	private double tax;
	
	@Column(name="UNIT_TYPE")
	private int unitType;
	
	@Column(name="CURRENT_RESERVE")
	private double currentReserve;
	
	@Column(name="BILLS_CODE")
	private String billCodes;
	
	@Column(name="COUNTY")
	private String county;
	
	
	@Transient
	private String unitNumber;
	
	
	@Transient
	private int monthsInService;
	@Transient
	private String licenseExpDate;
	@Transient
	private String deliveryDate;
	
	@Transient
	private double totalMonthlyRental;
	
	@Transient
	private int totalRecordsReturned;
	
	@Transient
	private String driverName;
	
	@Transient
	private String leaseExpiryDate;
	
	@Transient
	private String custPhoneNum;
	@Transient
	private String custContact;
	
	@Transient
	private String custPhoneEmailId;
	


	
	
	@Transient
	private String year;
	
	@Transient
	private String make;
	
	@Transient
	private String model;
	
	@Transient
	private double overallTotal;
	
	@Transient
	private double avgMilesPerGallon;
	
	@Transient
	private double avgCostPerMile;
	
	@Transient
	private double avgCostPerGallon;
	
	@Transient
	private String cardNo;
	
	
	@Transient
	private double overallFuelTotal;
	
	@Transient
	private double overallMaintTotal;
	
	@Transient
	private double grandTotal;
	
	@Transient
	private String renewalNotification="";
	@Transient
	private String mileageNotification="";
	
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	@Transient
	private double overallGallons;
	
	@Transient
	private int lastMileage;
	
	@Transient
	private int mileage;
	
	
	
	@Transient
	private List<KeyPair>breakdownByCostperGallon;
	@Transient
	private List<KeyPair>breakdownByFuelSpent;
	@Transient
	private List<KeyPair>breakdownByMaintSpent;
	
	@Transient
	private List<String>totalFuelBreakDownMonthList;
	
	@Transient
	private List<String>totalFuelBreakDownAmtList;
	
	@Transient
	private List<String>totalMaintBreakDownMonthList;
	
	@Transient
	private List<String>totalMaintBreakDownAmtList;
	
	@Transient
	private List<String>totalGallonBreakDownMonthList;
	
	@Transient
	private List<String>totalGallonBreakDownAmtList;
	
	
    @Transient
	private List<String>individualFuelBreakDownMonthList;
	
	@Transient
	private List<String>individualFuelBreakDownAmtList;
	
	@Transient
	private List<String>individualMaintBreakDownMonthList;
	
	@Transient
	private List<String>individualMaintBreakDownAmtList;
	
	@Transient
	private List<String>individualGallonBreakDownMonthList;
	
	@Transient
	private List<String>individualGallonBreakDownAmtList;
	
	
	
	@Transient
	private List<KeyPair>compBreakdownByCostperGallon;
	@Transient
	private List<KeyPair>compBreakdownByFuelSpent;
	
	@Transient
	private List<KeyPair>compBreakdownByMaintSpent;
	
	@Transient
	private LeaseRelatedDriverInfo driverInfo;
	
	@Transient
	private LeaseRelatedVehicleInfo vehicleRegisInfo;
	
	@Transient
	private String agreedValueVal;
	
	@Transient
	private String monthlyRentalVal;
	
	@Transient
	private String taxVal;
	
	@Transient
	private String monthlyTotalVal;
	
	@Transient
	private String reserveAmountVal;
	
	@Transient
	private String shorterVin;
	
	@Transient
	private String leaseDocURL="";
	

	@Transient
	private List<VoyagerFileTransactionData> maintList;
	
	@OneToMany(mappedBy="mylease")
	@OrderBy("TO_DATE(dt870_trans_purch_date,'YYYYMMDD') DESC")
	private List<VoyagerFileTransactionData> fuelList;
	
	@Transient
	private List<VoyagerFileTransactionDataBean> fuelBeanList;
	
	@Transient
	private Set<CustomerContact> customerContactRecords;
	
	@Transient
	private String poApprovalLimit;
	@Transient
	private String poApprovalNotes;
	
	public List<VoyagerFileTransactionDataBean> getFuelBeanList() {
		return fuelBeanList;
	}
	public void setFuelBeanList(List<VoyagerFileTransactionDataBean> fuelBeanList) {
		this.fuelBeanList = fuelBeanList;
	}
	public String getLeaseExpiryDate() {
		return leaseExpiryDate;
	}
	public void setLeaseExpiryDate(String string) {
		this.leaseExpiryDate = string;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getTotalRecordsReturned() {
		return totalRecordsReturned;
	}
	public void setTotalRecordsReturned(int totalRecordsReturned) {
		this.totalRecordsReturned = totalRecordsReturned;
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
	public double getAgreedValue() {
		return agreedValue;
	}
	public void setAgreedValue(double agreedValue) {
		this.agreedValue = agreedValue;
	}
	public int getSkipToPeriod() {
		return skipToPeriod;
	}
	public void setSkipToPeriod(int skipToPeriod) {
		this.skipToPeriod = skipToPeriod;
	}
	public double getReserveAmount() {
		return reserveAmount;
	}
	public void setReserveAmount(double reserveAmount) {
		this.reserveAmount = reserveAmount;
	}
	public double getRentalAmount() {
		return rentalAmount;
	}
	public void setRentalAmount(double rentalAmount) {
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
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getUnitType() {
		return unitType;
	}
	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}
	public double getCurrentReserve() {
		return currentReserve;
	}
	public void setCurrentReserve(double currentReserve) {
		this.currentReserve = currentReserve;
	}
	public int getMonthsInService() {
		return monthsInService;
	}
	public void setMonthsInService(int monthsInService) {
		this.monthsInService = monthsInService;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public double getTotalMonthlyRental() {
		return totalMonthlyRental;
	}
	public void setTotalMonthlyRental(double totalMonthlyRental) {
		this.totalMonthlyRental = totalMonthlyRental;
	}
	public String getBillCodes() {
		return billCodes;
	}
	public void setBillCodes(String billCodes) {
		this.billCodes = billCodes;
	}
	public List<VoyagerFileTransactionData> getFuelList() {
		return fuelList;
	}
	public void setFuelList(List<VoyagerFileTransactionData> fuelList) {
		this.fuelList = fuelList;
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
	public double getOverallTotal() {
		return overallTotal;
	}
	public void setOverallTotal(double overallTotal) {
		this.overallTotal = overallTotal;
	}
	public double getOverallGallons() {
		return overallGallons;
	}
	public void setOverallGallons(double overallGallons) {
		this.overallGallons = overallGallons;
	}
	public int getLastMileage() {
		return lastMileage;
	}
	public void setLastMileage(int lastMileage) {
		this.lastMileage = lastMileage;
	}
	public List<KeyPair> getBreakdownByCostperGallon() {
		return breakdownByCostperGallon;
	}
	public void setBreakdownByCostperGallon(List<KeyPair> breakdownByCostperGallon) {
		this.breakdownByCostperGallon = breakdownByCostperGallon;
	}
	public List<KeyPair> getBreakdownByFuelSpent() {
		return breakdownByFuelSpent;
	}
	public void setBreakdownByFuelSpent(List<KeyPair> breakdownByFuelSpent) {
		this.breakdownByFuelSpent = breakdownByFuelSpent;
	}
	public List<KeyPair> getBreakdownByMaintSpent() {
		return breakdownByMaintSpent;
	}
	public void setBreakdownByMaintSpent(List<KeyPair> breakdownByMaintSpent) {
		this.breakdownByMaintSpent = breakdownByMaintSpent;
	}
	public List<KeyPair> getCompBreakdownByCostperGallon() {
		return compBreakdownByCostperGallon;
	}
	public void setCompBreakdownByCostperGallon(List<KeyPair> compBreakdownByCostperGallon) {
		this.compBreakdownByCostperGallon = compBreakdownByCostperGallon;
	}
	public List<KeyPair> getCompBreakdownByFuelSpent() {
		return compBreakdownByFuelSpent;
	}
	public void setCompBreakdownByFuelSpent(List<KeyPair> compBreakdownByFuelSpent) {
		this.compBreakdownByFuelSpent = compBreakdownByFuelSpent;
	}
	public List<KeyPair> getCompBreakdownByMaintSpent() {
		return compBreakdownByMaintSpent;
	}
	public void setCompBreakdownByMaintSpent(List<KeyPair> compBreakdownByMaintSpent) {
		this.compBreakdownByMaintSpent = compBreakdownByMaintSpent;
	}
	public String getLicenseExpDate() {
		return licenseExpDate;
	}
	public void setLicenseExpDate(String licenseExpDate) {
		this.licenseExpDate = licenseExpDate;
	}
	public List<VoyagerFileTransactionData> getMaintList() {
		return maintList;
	}
	public void setMaintList(List<VoyagerFileTransactionData> maintList) {
		this.maintList = maintList;
	}
	public double getOverallFuelTotal() {
		return overallFuelTotal;
	}
	public void setOverallFuelTotal(double overallFuelTotal) {
		this.overallFuelTotal = overallFuelTotal;
	}
	public double getOverallMaintTotal() {
		return overallMaintTotal;
	}
	public void setOverallMaintTotal(double overallMaintTotal) {
		this.overallMaintTotal = overallMaintTotal;
	}
	public String getAgreedValueVal() {
		return agreedValueVal;
	}
	public void setAgreedValueVal(String agreedValueVal) {
		this.agreedValueVal = agreedValueVal;
	}
	public String getMonthlyRentalVal() {
		return monthlyRentalVal;
	}
	public void setMonthlyRentalVal(String monthlyRentalVal) {
		this.monthlyRentalVal = monthlyRentalVal;
	}
	public String getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(String taxVal) {
		this.taxVal = taxVal;
	}
	public String getMonthlyTotalVal() {
		return monthlyTotalVal;
	}
	public void setMonthlyTotalVal(String monthlyTotalVal) {
		this.monthlyTotalVal = monthlyTotalVal;
	}
	public String getReserveAmountVal() {
		return reserveAmountVal;
	}
	public void setReserveAmountVal(String reserveAmountVal) {
		this.reserveAmountVal = reserveAmountVal;
	}
	
	public String getShorterVin() {
		return shorterVin;
	}
	public void setShorterVin(String shorterVin) {
		this.shorterVin = shorterVin;
	}
	
		public LeaseRelatedDriverInfo getDriverInfo() {
		return driverInfo;
	}
	public void setDriverInfo(LeaseRelatedDriverInfo driverInfo) {
		this.driverInfo = driverInfo;
	}
	public LeaseRelatedVehicleInfo getVehicleRegisInfo() {
		return vehicleRegisInfo;
	}
	public void setVehicleRegisInfo(LeaseRelatedVehicleInfo vehicleRegisInfo) {
		this.vehicleRegisInfo = vehicleRegisInfo;
	}
	public List<String> getTotalFuelBreakDownMonthList() {
		return totalFuelBreakDownMonthList;
	}
	public void setTotalFuelBreakDownMonthList(List<String> totalFuelBreakDownMonthList) {
		this.totalFuelBreakDownMonthList = totalFuelBreakDownMonthList;
	}
	public List<String> getTotalFuelBreakDownAmtList() {
		return totalFuelBreakDownAmtList;
	}
	public void setTotalFuelBreakDownAmtList(List<String> totalFuelBreakDownAmtList) {
		this.totalFuelBreakDownAmtList = totalFuelBreakDownAmtList;
	}
	public List<String> getTotalMaintBreakDownMonthList() {
		return totalMaintBreakDownMonthList;
	}
	public void setTotalMaintBreakDownMonthList(List<String> totalMaintBreakDownMonthList) {
		this.totalMaintBreakDownMonthList = totalMaintBreakDownMonthList;
	}
	public List<String> getTotalMaintBreakDownAmtList() {
		return totalMaintBreakDownAmtList;
	}
	public void setTotalMaintBreakDownAmtList(List<String> totalMaintBreakDownAmtList) {
		this.totalMaintBreakDownAmtList = totalMaintBreakDownAmtList;
	}
	public List<String> getTotalGallonBreakDownMonthList() {
		return totalGallonBreakDownMonthList;
	}
	public void setTotalGallonBreakDownMonthList(List<String> totalGallonBreakDownMonthList) {
		this.totalGallonBreakDownMonthList = totalGallonBreakDownMonthList;
	}
	public List<String> getTotalGallonBreakDownAmtList() {
		return totalGallonBreakDownAmtList;
	}
	public void setTotalGallonBreakDownAmtList(List<String> totalGallonBreakDownAmtList) {
		this.totalGallonBreakDownAmtList = totalGallonBreakDownAmtList;
	}
	public List<String> getIndividualFuelBreakDownMonthList() {
		return individualFuelBreakDownMonthList;
	}
	public void setIndividualFuelBreakDownMonthList(List<String> individualFuelBreakDownMonthList) {
		this.individualFuelBreakDownMonthList = individualFuelBreakDownMonthList;
	}
	public List<String> getIndividualFuelBreakDownAmtList() {
		return individualFuelBreakDownAmtList;
	}
	public void setIndividualFuelBreakDownAmtList(List<String> individualFuelBreakDownAmtList) {
		this.individualFuelBreakDownAmtList = individualFuelBreakDownAmtList;
	}
	public List<String> getIndividualMaintBreakDownMonthList() {
		return individualMaintBreakDownMonthList;
	}
	public void setIndividualMaintBreakDownMonthList(List<String> individualMaintBreakDownMonthList) {
		this.individualMaintBreakDownMonthList = individualMaintBreakDownMonthList;
	}
	public List<String> getIndividualMaintBreakDownAmtList() {
		return individualMaintBreakDownAmtList;
	}
	public void setIndividualMaintBreakDownAmtList(List<String> individualMaintBreakDownAmtList) {
		this.individualMaintBreakDownAmtList = individualMaintBreakDownAmtList;
	}
	public List<String> getIndividualGallonBreakDownMonthList() {
		return individualGallonBreakDownMonthList;
	}
	public void setIndividualGallonBreakDownMonthList(List<String> individualGallonBreakDownMonthList) {
		this.individualGallonBreakDownMonthList = individualGallonBreakDownMonthList;
	}
	public List<String> getIndividualGallonBreakDownAmtList() {
		return individualGallonBreakDownAmtList;
	}
	public void setIndividualGallonBreakDownAmtList(List<String> individualGallonBreakDownAmtList) {
		this.individualGallonBreakDownAmtList = individualGallonBreakDownAmtList;
	}
	

	public String getCustPhoneNum() {
		return custPhoneNum;
	}
	public void setCustPhoneNum(String custPhoneNum) {
		this.custPhoneNum = custPhoneNum;
	}
	public String getCustPhoneEmailId() {
		return custPhoneEmailId;
	}
	public void setCustPhoneEmailId(String custPhoneEmailId) {
		this.custPhoneEmailId = custPhoneEmailId;
	}
	public String getCustContact() {
		return custContact;
	}
	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}
	public String isRenewalNotification() {
		return renewalNotification;
	}
	public void setRenewalNotification(String renewalNotification) {
		this.renewalNotification = renewalNotification;
	}
	public String getMileageNotification() {
		return mileageNotification;
	}
	public void setMileageNotification(String mileageNotification) {
		this.mileageNotification = mileageNotification;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
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
	
	
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getRenewalNotification() {
		return renewalNotification;
	}
	public double getAvgMilesPerGallon() {
		return avgMilesPerGallon;
	}
	public void setAvgMilesPerGallon(double avgMilesPerGallon) {
		this.avgMilesPerGallon = avgMilesPerGallon;
	}
	public double getAvgCostPerMile() {
		return avgCostPerMile;
	}
	public void setAvgCostPerMile(double avgCostPerMile) {
		this.avgCostPerMile = avgCostPerMile;
	}
	public double getAvgCostPerGallon() {
		return avgCostPerGallon;
	}
	public void setAvgCostPerGallon(double avgCostPerGallon) {
		this.avgCostPerGallon = avgCostPerGallon;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getLeaseDocURL() {
		return leaseDocURL;
	}
	public void setLeaseDocURL(String leaseDocURL) {
		this.leaseDocURL = leaseDocURL;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	
}
