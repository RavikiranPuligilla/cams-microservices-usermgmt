package com.cams.model.chromadata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_MODELYEARS")

public class ModelYears {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="modelyears_seq")
	@SequenceGenerator(
			name="modelyears_seq",
			sequenceName="modelyears_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Column(name="YEAR")
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
