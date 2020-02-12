package com.cams.model.maintplan;

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
import com.cams.model.chromadata.KeyPair;
import com.cams.model.mylease.MyLease;
import com.cams.model.voyager.VoyagerFileTransactionData;

@Entity
@Table(name="CAMS_MAINTENANCE_PLAN")
public class MaintPlan {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maintplan_seq")
	@SequenceGenerator(
			name="maintplan_seq",
			sequenceName="maintplan_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="VEHICLE_MAKE")
	private String make;
	
	@Column(name="VEHICLE_MODEL")
	private String model;
	
	@Column(name="SERVICE_INTERVAL")
	private float servInterval;
	
	public boolean isPlanExist() {
		return planExist;
	}
	public void setPlanExist(boolean planExist) {
		this.planExist = planExist;
	}
	@Transient
	private boolean planExist=false;
	
	
	@Transient
	private Set<MaintPlanServDue> servDueRecords = new HashSet<MaintPlanServDue>(
			0);
	
	public MaintPlan() {
		
	}
	public MaintPlan(int id, String planName,String make,String model,int servInterval) {
		this.id=id;
		this.planName = planName;
		this.make = make;
		this.model = model;
		this.servInterval = servInterval;
	
	}
	
	public MaintPlan(int id, String planName,String make,String model,int servInterval,
			Set<MaintPlanServDue> servDueRecords) {
		this.id=id;
		this.planName = planName;
		this.make = make;
		this.model = model;
		this.servInterval = servInterval;
		this.servDueRecords = servDueRecords;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
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
	public float getServInterval() {
		return servInterval;
	}
	public void setServInterval(float servInterval) {
		this.servInterval = servInterval;
	}
	public Set<MaintPlanServDue> getServDueRecords() {
		return servDueRecords;
	}
	public void setServDueRecords(Set<MaintPlanServDue> servDueRecords) {
		this.servDueRecords = servDueRecords;
	}
	

	
	
	}
