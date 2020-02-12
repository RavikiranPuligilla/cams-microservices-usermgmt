package com.cams.model.mylease;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Transient;

import com.cams.model.chromadata.KeyPair;
import com.cams.model.mcenter.NotificationBean;


public class Dashboard {

private int numberOfVehicle;
private String avgMonthInService;
private float deliveryPrice;
private String agreedValue;
private String bookBalace;
private String monthlyRental;
private int notificationCount;
private boolean gmMaintenance;
private boolean isVoyagerCustomer;
private boolean isGpsCustomer;
private boolean voyagerMaintApplicable;
private String gpsURL="";
private List<MyLease> leases;
private LinkedHashMap<String, String> breakdownByYear = new LinkedHashMap<String, String>();
private LinkedHashMap<String, String> breakdownByManufacture = new LinkedHashMap<String, String>();

private List<NotificationBean> notificationList=new LinkedList<NotificationBean>();

public int getNumberOfVehicle() {
	return numberOfVehicle;
}
public void setNumberOfVehicle(int numberOfVehicle) {
	this.numberOfVehicle = numberOfVehicle;
}
public String getAvgMonthInService() {
	return avgMonthInService;
}
public void setAvgMonthInService(String avgMonthInService) {
	this.avgMonthInService = avgMonthInService;
}
public float getDeliveryPrice() {
	return deliveryPrice;
}
public void setDeliveryPrice(float deliveryPrice) {
	this.deliveryPrice = deliveryPrice;
}
public String getBookBalace() {
	return bookBalace;
}
public void setBookBalace(String bookBalace) {
	this.bookBalace = bookBalace;
}
public String getMonthlyRental() {
	return monthlyRental;
}
public void setMonthlyRental(String monthlyRental) {
	this.monthlyRental = monthlyRental;
}
public int getNotificationCount() {
	return notificationCount;
}
public void setNotificationCount(int notificationCount) {
	this.notificationCount = notificationCount;
}
public boolean isVoyagerCustomer() {
	return isVoyagerCustomer;
}
public void setVoyagerCustomer(boolean isVoyagerCustomer) {
	this.isVoyagerCustomer = isVoyagerCustomer;
}
public boolean isGpsCustomer() {
	return isGpsCustomer;
}
public void setGpsCustomer(boolean isGpsCustomer) {
	this.isGpsCustomer = isGpsCustomer;
}
public List<MyLease> getLeases() {
	return leases;
}
public void setLeases(List<MyLease> leases) {
	this.leases = leases;
}
public String getAgreedValue() {
	return agreedValue;
}
public void setAgreedValue(String agreedValue) {
	this.agreedValue = agreedValue;
}
public LinkedHashMap<String, String> getBreakdownByYear() {
	return breakdownByYear;
}
public void setBreakdownByYear(LinkedHashMap<String, String> breakdownByYear) {
	this.breakdownByYear = breakdownByYear;
}
public LinkedHashMap<String, String> getBreakdownByManufacture() {
	return breakdownByManufacture;
}
public void setBreakdownByManufacture(LinkedHashMap<String, String> breakdownByManufacture) {
	this.breakdownByManufacture = breakdownByManufacture;
}
public List<NotificationBean> getNotificationList() {
	return notificationList;
}
public void setNotificationList(List<NotificationBean> notificationList) {
	this.notificationList = notificationList;
}
public boolean isGmMaintenance() {
	return gmMaintenance;
}
public void setGmMaintenance(boolean gmMaintenance) {
	this.gmMaintenance = gmMaintenance;
}
public boolean isVoyagerMaintApplicable() {
	return voyagerMaintApplicable;
}
public void setVoyagerMaintApplicable(boolean voyagerMaintApplicable) {
	this.voyagerMaintApplicable = voyagerMaintApplicable;
}
public String getGpsURL() {
	return gpsURL;
}
public void setGpsURL(String gpsURL) {
	this.gpsURL = gpsURL;
}


}
