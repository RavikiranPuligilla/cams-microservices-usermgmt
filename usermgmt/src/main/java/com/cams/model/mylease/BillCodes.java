package com.cams.model.mylease;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_LEASE_DETAIL")
public class BillCodes {

	
	@Id 
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="CATEGORY_CODE")
	private String categoryCode;
	
	@Column(name="ADDRESS_NUMBER")
	private int addressNum;

	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public int getAddressNum() {
		return addressNum;
	}

	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}
	
	
	
}
