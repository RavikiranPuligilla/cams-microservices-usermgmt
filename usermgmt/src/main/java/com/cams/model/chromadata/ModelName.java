package com.cams.model.chromadata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_MODEL_NAME")

public class ModelName {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="modelName_seq")
	@SequenceGenerator(
			name="modelName_seq",
			sequenceName="modelName_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DIVISION_ID")
	private int divisionId;
	
	@Column(name="YEAR")
	private int year;
	

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

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionRefId) {
		this.divisionId = divisionRefId;
	}
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
