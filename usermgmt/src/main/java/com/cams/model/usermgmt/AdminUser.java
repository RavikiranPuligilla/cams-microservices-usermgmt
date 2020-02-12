package com.cams.model.usermgmt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_ADMIN_USER")

public class AdminUser {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="adminuser_seq")
	@SequenceGenerator(
			name="adminuser_seq",
			sequenceName="adminuser_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="USER_ID")
	private String  userId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	
	@Column(name="FNAME")
	private String fname;

	@Column(name="LNAME")
	private String lname;
	
	@Column(name="PHONE")
	private long phoneNum;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	
}

