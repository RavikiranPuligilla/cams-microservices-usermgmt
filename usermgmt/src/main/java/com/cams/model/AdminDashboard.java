package com.cams.model;

import java.util.ArrayList;
import java.util.List;

import com.cams.model.po.PurchaseOrder;
import com.cams.model.vendors.Vendors;

public class AdminDashboard {


private List<Customer> customers=new ArrayList<Customer>();
private List<Vendors> vendors=new ArrayList<Vendors>();
private List<PurchaseOrder> purchaseOrders=new ArrayList<PurchaseOrder>();
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public List<Vendors> getVendors() {
	return vendors;
}
public void setVendors(List<Vendors> vendors) {
	this.vendors = vendors;
}
public List<PurchaseOrder> getPurchaseOrders() {
	return purchaseOrders;
}
public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
	this.purchaseOrders = purchaseOrders;
}





}
