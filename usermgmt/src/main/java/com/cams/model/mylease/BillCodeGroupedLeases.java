package com.cams.model.mylease;

import java.util.List;

public class BillCodeGroupedLeases {
	
	private List<MyLease> billcodeGropuedLeases;
	private String categoryCode;
	private int billCodeLeasesCount;
	private String deliveryPriceTotal;
	private String bookBalanceTotal;
	private String monthlyRentalTotal;
	private String salesTaxTotal;
	private String monthlyTotal;
	private String currentReserveTotal;
	private int totalRecordsRetruned;
	
	
	public List<MyLease> getBillcodeGropuedLeases() {
		return billcodeGropuedLeases;
	}
	public void setBillcodeGropuedLeases(List<MyLease> billcodeGropuedLeases) {
		this.billcodeGropuedLeases = billcodeGropuedLeases;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public int getBillCodeLeasesCount() {
		return billCodeLeasesCount;
	}
	public void setBillCodeLeasesCount(int billCodeLeasesCount) {
		this.billCodeLeasesCount = billCodeLeasesCount;
	}
	public String getDeliveryPriceTotal() {
		return deliveryPriceTotal;
	}
	public void setDeliveryPriceTotal(String deliveryPriceTotal) {
		this.deliveryPriceTotal = deliveryPriceTotal;
	}
	public String getBookBalanceTotal() {
		return bookBalanceTotal;
	}
	public void setBookBalanceTotal(String bookBalanceTotal) {
		this.bookBalanceTotal = bookBalanceTotal;
	}
	public String getMonthlyRentalTotal() {
		return monthlyRentalTotal;
	}
	public void setMonthlyRentalTotal(String monthlyRentalTotal) {
		this.monthlyRentalTotal = monthlyRentalTotal;
	}
	public String getSalesTaxTotal() {
		return salesTaxTotal;
	}
	public void setSalesTaxTotal(String salesTaxTotal) {
		this.salesTaxTotal = salesTaxTotal;
	}
	public String getMonthlyTotal() {
		return monthlyTotal;
	}
	public void setMonthlyTotal(String monthlyRentTotal) {
		this.monthlyTotal = monthlyRentTotal;
	}
	public String getCurrentReserveTotal() {
		return currentReserveTotal;
	}
	public void setCurrentReserveTotal(String currentReserveTotal) {
		this.currentReserveTotal = currentReserveTotal;
	}
	public int getTotalRecordsRetruned() {
		return totalRecordsRetruned;
	}
	public void setTotalRecordsRetruned(int totalRecordsRetruned) {
		this.totalRecordsRetruned = totalRecordsRetruned;
	}
	
		

}
