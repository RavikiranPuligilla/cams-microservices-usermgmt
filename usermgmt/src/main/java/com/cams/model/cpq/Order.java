package com.cams.model.cpq;

import javax.persistence.Transient;

public class Order {
	
	
	
	

	private long id;
	private String leaseNum="";
	private String proposalSigned="";
	private String description="";
	private String vinNum="";
	private String principallyGaraged="";
	private String status="";
	private String deliveryDate="";
	private String vehicleOrderType="";
	private int totalRecordsReturned;
	private int addressNum;
	private String shorterVin;
   public String toString() {		
		 
	 return "id:"+id+",leaseNum:"+leaseNum+",proposalSigned:"+proposalSigned+",description:"+description+",vinNum:"+vinNum+",principallyGaraged:"+principallyGaraged+",status:"+
			 status+",deliveryDate:"+deliveryDate+",vehicleOrderType:"+vehicleOrderType;
	 }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLeaseNum() {
		return leaseNum;
	}
	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}
	public int getAddressNum() {
		return addressNum;
	}
	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}
	public String getProposalSigned() {
		return proposalSigned;
	}
	public void setProposalSigned(String proposalSigned) {
		this.proposalSigned = proposalSigned;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVinNum() {
		return vinNum;
	}
	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}
	public String getPrincipallyGaraged() {
		return principallyGaraged;
	}
	public void setPrincipallyGaraged(String principallyGaraged) {
		this.principallyGaraged = principallyGaraged;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getVehicleOrderType() {
		return vehicleOrderType;
	}
	public void setVehicleOrderType(String vehicleOrderType) {
		this.vehicleOrderType = vehicleOrderType;
	}
	public int getTotalRecordsReturned() {
		return totalRecordsReturned;
	}
	public void setTotalRecordsReturned(int totalRecordsReturned) {
		this.totalRecordsReturned = totalRecordsReturned;
	}
	public String getShorterVin() {
		return shorterVin;
	}
	public void setShorterVin(String shorterVin) {
		this.shorterVin = shorterVin;
	}
		
}
