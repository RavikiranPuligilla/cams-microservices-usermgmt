package com.cams.model.mylease;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_USERS_MYLEASECOLUMNS")
public class UserMyLeaseColumns {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usermyleasecol_seq")
	@SequenceGenerator(
			name="usermyleasecol_seq",
			sequenceName="usermyleasecol_sequence",
			allocationSize=20
		)
	
	@Column(name="ID")
	private int id;
	@Column(name="USERID")
	private String userID;
	
	@Column(name="AVAILABLE_COLUMNS")
	private String availColumns;
	
	@Column(name="PREFERRED_COLUMNS")
	private String prefColumns;
	
	@Column(name="SERVICE_MAPPING_NAME")
	private String mappingName;
	
	@Column(name="DISPLAY_ORDER")
	private int displayOrder;
	
	@Column(name="AVAILABLE_FOR")
	private String availableFor;
	
	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getAvailColumns() {
		return availColumns;
	}

	public void setAvailColumns(String availColumns) {
		this.availColumns = availColumns;
	}

	public String getPrefColumns() {
		return prefColumns;
	}

	public void setPrefColumns(String prefColumns) {
		this.prefColumns = prefColumns;
	}

	public String getAvailableFor() {
		return availableFor;
	}

	public void setAvailableFor(String availableFor) {
		this.availableFor = availableFor;
	}
	
	
	
	

}
