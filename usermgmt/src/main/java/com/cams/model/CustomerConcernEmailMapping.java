package com.cams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_CONCERN_EMAILMAPPING")
public class CustomerConcernEmailMapping {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customercareemail_seq")
	@SequenceGenerator(
			name="customercareemail_seq",
			sequenceName="customercareemail_seq",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="CATEGORY")
	private String concernCategory;
	
	@Column(name="EMAILIDS")
	private String emailIDs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConcernCategory() {
		return concernCategory;
	}

	public void setConcernCategory(String concernCategory) {
		this.concernCategory = concernCategory;
	}

	public String getEmailIDs() {
		return emailIDs;
	}

	public void setEmailIDs(String emailIDs) {
		this.emailIDs = emailIDs;
	}
	

}
