package com.cams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_CUSTOMER_CARE_CONCERNS")
public class CustomerCare {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customercare_seq")
	@SequenceGenerator(
			name="customercare_seq",
			sequenceName="customercare_seq",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String firstName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="CONCERN_CATEGORY")
	private String concernCategory;
	
	@Column(name="QUESTION_ASKED")
	private String questionAsked;
	
	@Column(name="CREATED_DATE")
	private java.sql.Date createdDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConcernCategory() {
		return concernCategory;
	}

	public void setConcernCategory(String concernCategory) {
		this.concernCategory = concernCategory;
	}

	public String getQuestionAsked() {
		return questionAsked;
	}

	public void setQuestionAsked(String questionAsked) {
		this.questionAsked = questionAsked;
	}

	public java.sql.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}

	
}
