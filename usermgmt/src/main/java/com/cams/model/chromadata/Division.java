package com.cams.model.chromadata;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_DIVISION")

public class Division {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="division_seq")
	@SequenceGenerator(
			name="division_seq",
			sequenceName="division_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="DIVISIONID")
	private int divisionId;
	
	@Column(name="DIVISION_NAME")
	private String divisionName;
	
	@Column(name="YEAR")
	private int year;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	
	

	
	
	
}
