package com.cams.model.mcenter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cams.model.maintplan.MaintPlanServDue;
@Entity
@Table(name="CAMS_NOTIFICATION")
public class Notification {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="notification_seq")
	@SequenceGenerator(
			name="notification_seq",
			sequenceName="notification_sequence",
			allocationSize=1
		)
	@Column(name="id")
	private int id;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="ADDRESS_NUMBER")
	private int addressNum;
	
	@Column(name="NOTIFICATION_MESSAGE")
	private int  notificationMsg;
	
	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="ISREAD")
	private int isRead;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="VIN_NUMBER")
	private String vinNum;
	
	@Column(name="LEASE_NUMBER")
	private String leaseNum;
	
	@Column(name="LEASE_EXPIRY_DATE")
	private Date leaseExpireDate;
	
	
	@Column(name="EXPIRE_DATE")
	private Date notificationExpiryDate;
	
	
	@Column(name="ACTIVE_DATE")
	private Date notificationActiveDate;
	

	@Column(name="DT870_ODOMETER")
	private long dt870_odometer;
	
    @Column(name="DT870_TRANS_PURCH_DATE")
	private String dt870_trans_purch_date;

	@Column(name="DT870_TRANS_PURCH_TIME")
	private int dt870_trans_purch_time;
	
	@Column(name="SERVICE_INTERVAL")
	private float serviceInterval;
	
	@Column(name="RENEWAL_INTERVAL")
	private int renewalInterval;
	
	@Column(name="MAINT_PLAN_ID")
	private int maintPlanId;
	
	@Column(name="EMAIL_SENT")
	private String emailSent;
	
	@Column(name="EMAIL_SENT_DATE")
	private Date emailSentDate;
	
	@Column(name="RECALL_ID")
	private int recallId;
	

	public Notification() {
		
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="NOTIFICATION_ID")
	private Set<NotificationVinMapping> vinMappingRecords = new HashSet<NotificationVinMapping>(
			0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAddressNum() {
		return addressNum;
	}

	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}

	public int getNotificationMsg() {
		return notificationMsg;
	}

	public void setNotificationMsg(int notificationMsg) {
		this.notificationMsg = notificationMsg;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public int getIsRead() {
		return isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
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

	public Date getLeaseExpireDate() {
		return leaseExpireDate;
	}

	public void setLeaseExpireDate(Date leaseExpireDate) {
		this.leaseExpireDate = leaseExpireDate;
	}

	public String getLeaseNum() {
		return leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	public Date getNotificationExpiryDate() {
		return notificationExpiryDate;
	}

	public void setNotificationExpiryDate(Date notificationExpiryDate) {
		this.notificationExpiryDate = notificationExpiryDate;
	}

	public Date getNotificationActiveDate() {
		return notificationActiveDate;
	}

	public void setNotificationActiveDate(Date notificationActiveDate) {
		this.notificationActiveDate = notificationActiveDate;
	}

	public long getDt870_odometer() {
		return dt870_odometer;
	}

	public void setDt870_odometer(long dt870_odometer) {
		this.dt870_odometer = dt870_odometer;
	}

	public String getDt870_trans_purch_date() {
		return dt870_trans_purch_date;
	}

	public void setDt870_trans_purch_date(String dt870_trans_purch_date) {
		this.dt870_trans_purch_date = dt870_trans_purch_date;
	}

	public int getDt870_trans_purch_time() {
		return dt870_trans_purch_time;
	}

	public void setDt870_trans_purch_time(int dt870_trans_purch_time) {
		this.dt870_trans_purch_time = dt870_trans_purch_time;
	}

	public float getServiceInterval() {
		return serviceInterval;
	}

	public void setServiceInterval(float serviceInterval) {
		this.serviceInterval = serviceInterval;
	}

	public int getMaintPlanId() {
		return maintPlanId;
	}

	public void setMaintPlanId(int maintPlanId) {
		this.maintPlanId = maintPlanId;
	}

	public int getRenewalInterval() {
		return renewalInterval;
	}

	public void setRenewalInterval(int renewalInterval) {
		this.renewalInterval = renewalInterval;
	}

	public Set<NotificationVinMapping> getVinMappingRecords() {
		return vinMappingRecords;
	}

	public void setVinMappingRecords(Set<NotificationVinMapping> vinMappingRecords) {
		this.vinMappingRecords = vinMappingRecords;
	}

	public String getEmailSent() {
		return emailSent;
	}

	public void setEmailSent(String emailSent) {
		this.emailSent = emailSent;
	}

	public Date getEmailSentDate() {
		return emailSentDate;
	}

	public void setEmailSentDate(Date emailSentDate) {
		this.emailSentDate = emailSentDate;
	}
	public int getRecallId() {
		return recallId;
	}

	public void setRecallId(int recallId) {
		this.recallId = recallId;
	}
	
}
