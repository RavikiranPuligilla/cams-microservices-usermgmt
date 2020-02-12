package com.cams.model.maintplan;

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
@Table(name="CAMS_MAINTENANCE_PLAN_SERV_DUE")
public class MaintPlanServDue {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maintplanservdue_seq")
	@SequenceGenerator(
			name="maintplanservdue_seq",
			sequenceName="maintplanservdue_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;

	@Column(name="NAME")
	private String name;
	
	
	@Column(name="MAINT_PLAN_ID")
	private int maintPlanId;
	
	@Column(name="SERVICE_INTERVAL")
	private float servInterval;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaintPlanId() {
		return maintPlanId;
	}


	public void setMaintPlanId(int maintPlanId) {
		this.maintPlanId = maintPlanId;
	}


	public float getServInterval() {
		return servInterval;
	}


	public void setServInterval(float servInterval) {
		this.servInterval = servInterval;
	}
	

	
	}
