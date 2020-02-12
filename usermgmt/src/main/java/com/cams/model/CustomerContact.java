package com.cams.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CUSTOMER_CONTACT")

public class CustomerContact {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customercontact_seq")
	@SequenceGenerator(
			name="customercontact_seq",
			sequenceName="customercontact_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="TYPE")
	private String type;
	
	@Column(name="MAINCONTACT_NOTIFICATION")
	private String mainContactNotification;
	
	
	@Column(name="CUSTOMER_ID")
	private int customerId;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getMainContactNotification() {
		return mainContactNotification;
	}

	public void setMainContactNotification(String mainContactNotification) {
		this.mainContactNotification = mainContactNotification;
	}
	
	
	
}
