package com.cams.model.voyager;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VOYAGER_FILE_PROCESS_STATUS")
public class VoyagerFileProcessStatus {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="v_file_process_status_seq")
	@SequenceGenerator(
			name="v_file_process_status_seq",
			sequenceName="v_file_process_status_sequence",
			allocationSize=20
		)
	
	@Column(name="ID")
	private int id;
	
	@Column(name="HD870_RECORD_TYPE")
	private String hd870_record_type;
	
	@Column(name="HD870_FILLER1")
	private int hd870_filler1;

	@Column(name="HD870_FILLER2")
	private int hd870_filler2;

	@Column(name="HD870_FILE_NAME")
	private String hd870_file_name;

	@Column(name="HD870_SENDER_NAME")
	private String hd870_sender_name;

	@Column(name="HD870_CUST_NAME")
	private String hd870_cust_name;

	@Column(name="HD870_FILE_DATE")
	private String hd870_file_date;

	@Column(name="HD870_FILE_TYPE")
	private String hd870_file_type;

	@Column(name="HD870_FILLER3")
	private String hd870_filler3;

	@Column(name="HD870_BULK_IND")
	private String hd870_bulk_ind;

	public String toString() {
		
		return "hd870_record_type@@@@"+hd870_record_type+"$$$$"+"hd870_filler1@@@@"+hd870_filler1+"$$$$"+"hd870_filler2@@@@"+hd870_filler2+"$$$$"+"hd870_file_name@@@@"+hd870_file_name+"$$$$"+"hd870_sender_name@@@@"+hd870_sender_name+"$$$$"+"hd870_cust_name@@@@"+hd870_cust_name+"$$$$"+"hd870_file_date@@@@"+hd870_file_date+"$$$$"+"hd870_file_type@@@@"+hd870_file_type+"$$$$"+"hd870_filler3@@@@"+hd870_filler3+"$$$$"+"hd870_bulk_ind@@@@"+hd870_bulk_ind;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHd870_record_type() {
		return hd870_record_type;
	}

	public void setHd870_record_type(String hd870_record_type) {
		this.hd870_record_type = hd870_record_type;
	}

	public int getHd870_filler1() {
		return hd870_filler1;
	}

	public void setHd870_filler1(int hd870_filler1) {
		this.hd870_filler1 = hd870_filler1;
	}

	public int getHd870_filler2() {
		return hd870_filler2;
	}

	public void setHd870_filler2(int hd870_filler2) {
		this.hd870_filler2 = hd870_filler2;
	}

	public String getHd870_file_name() {
		return hd870_file_name;
	}

	public void setHd870_file_name(String hd870_file_name) {
		this.hd870_file_name = hd870_file_name;
	}

	public String getHd870_sender_name() {
		return hd870_sender_name;
	}

	public void setHd870_sender_name(String hd870_sender_name) {
		this.hd870_sender_name = hd870_sender_name;
	}

	public String getHd870_cust_name() {
		return hd870_cust_name;
	}

	public void setHd870_cust_name(String hd870_cust_name) {
		this.hd870_cust_name = hd870_cust_name;
	}

	public String getHd870_file_date() {
		return hd870_file_date;
	}

	public void setHd870_file_date(String hd870_file_date) {
		this.hd870_file_date = hd870_file_date;
	}

	public String getHd870_file_type() {
		return hd870_file_type;
	}

	public void setHd870_file_type(String hd870_file_type) {
		this.hd870_file_type = hd870_file_type;
	}

	public String getHd870_filler3() {
		return hd870_filler3;
	}

	public void setHd870_filler3(String hd870_filler3) {
		this.hd870_filler3 = hd870_filler3;
	}

	public String getHd870_bulk_ind() {
		return hd870_bulk_ind;
	}

	public void setHd870_bulk_ind(String hd870_bulk_ind) {
		this.hd870_bulk_ind = hd870_bulk_ind;
	}
	
}
