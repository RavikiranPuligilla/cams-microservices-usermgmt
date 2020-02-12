package com.cams.model.po;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.chromadata.KeyPair;
import com.cams.model.mylease.MyLease;
import com.cams.model.voyager.VoyagerFileTransactionData;

@Entity
@Table(name="CAMS_PO_WP")
public class PurchaseOrderWP {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="powp_seq")
	@SequenceGenerator(
			name="powp_seq",
			sequenceName="powp_sequence",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;

	@Column(name="WP")
	private String wp;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="PO_ID")
	private int poId;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWp() {
		return wp;
	}

	public void setWp(String wp) {
		this.wp = wp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}
	
	
	
	
	}
