package com.cams.model.mcenter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="CAMS_NOTIFICATION_VINMAPPING")
public class NotificationVinMapping {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="notificationvinmap_seq")
	@SequenceGenerator(
			name="notificationvinmap_seq",
			sequenceName="notificationvinmap_sequence",
			allocationSize=1
		)
	@Column(name="id")
	private int id;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="NOTIFICATION_ID")
	private int notificationId;
	
	@Column(name="LEASE_NUMBER")
	private String leaseNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getVinNum() {
		return vinNum;
	}

	public void setVinNum(String vinNum) {
		this.vinNum = vinNum;
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getLeaseNum() {
		return leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	
	
	
}
