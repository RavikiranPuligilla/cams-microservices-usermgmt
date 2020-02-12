package com.cams.model.voyager;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.cams.model.mylease.MyLease;
import java.util.Date;
@Entity
@Table(name="VOYAGER_FILE_TRANSACTION_DATA")
public class VoyagerFileTransactionData {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="v_file_trans_data_seq")
	@SequenceGenerator(
			name="v_file_trans_data_seq",
			sequenceName="v_file_trans_data_sequence",
			allocationSize=20
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="DT870_RECORD_TYPE")
	private int dt870_record_type;

	@Column(name="DT870_ACCT_ID")
	private int dt870_acct_id;

	@Column(name="DT870_ACCT_LVL1_ID")
	private int dt870_acct_lvl1_id;

	@Column(name="DT870_DRIVER_LVL2_ID")
	private int dt870_driver_lvl2_id;

	@Column(name="DT870_DRIVER_LVL3_ID")
	private int dt870_driver_lvl3_id;

	@Column(name="DT870_DRIVER_ID")
	private int dt870_driver_id;

	@Column(name="DT870_DRIVER_LNAME")
	private String dt870_driver_lname;

	@Column(name="DT870_DRIVER_FNAME")
	private String dt870_driver_fname;

	@Column(name="DT870_DRIVER_MINIT")
	private String dt870_driver_minit;

	@Column(name="DT870_VEHICLE_LVL2_ID")
	private int dt870_vehicle_lvl2_id;

	@Column(name="DT870_VEHICLE_LVL3_ID")
	private int dt870_vehicle_lvl3_id;

	@Column(name="DT870_VEHICLE_ID")
	private int dt870_vehicle_id;

	@Column(name="DT870_VEHICLE_VIN_NUM")
	private String dt870_vehicle_vin_num;

	@Column(name="DT870_VEHICLE_DESC")
	private String dt870_vehicle_desc;

	@Column(name="DT870_VEHICLE_LIC_TAG")
	private String dt870_vehicle_lic_tag;

	@Column(name="DT870_VEHICLE_LIC_TAG_ST")
	private String dt870_vehicle_lic_tag_st;

	@Column(name="DT870_CARD_LVL2_ID")
	private int dt870_card_lvl2_id;

	@Column(name="DT870_CARD_LVL3_ID")
	private int dt870_card_lvl3_id;

	@Column(name="DT870_CARD_ID")
	private int dt870_card_id;

	@Column(name="DT870_PARTICIPANT_CD")
	private int dt870_participant_cd;

	@Column(name="DT870_TRANS_PURCH_DATE")
	private String dt870_trans_purch_date;

	@Column(name="DT870_TRANS_PURCH_TIME")
	private int dt870_trans_purch_time;

	@Column(name="DT870_INV_NUM")
	private String dt870_inv_num;

	@Column(name="DT870_MERCH_ACCT_NUM")
	private String dt870_merch_acct_num;

	@Column(name="DT870_MERCH_ADDR")
	private String dt870_merch_addr;

	@Column(name="DT870_MERCH_CITY")
	private String dt870_merch_city;

	@Column(name="DT870_MERCH_ST")
	private String dt870_merch_st;

	@Column(name="DT870_MERCH_ZIP")
	private String dt870_merch_zip;

	@Column(name="DT870_MERCH_ZIP4")
	private String dt870_merch_zip4;

	@Column(name="DT870_PROD_CD")
	private String dt870_prod_cd;

	@Column(name="DT870_PROD_AMT")
	private double dt870_prod_amt;

	@Column(name="DT870_PROD_UNITS")
	private int dt870_prod_units;

	@Column(name="DT870_COST_PER_UNIT")
	private int dt870_cost_per_unit;

	@Column(name="DT870_COST_PER_MILE")
	private int dt870_cost_per_mile;

	@Column(name="DT870_MILES_PER_GAL")
	private int dt870_miles_per_gal;

	@Column(name="DT870_ODOMETER")
	private int dt870_odometer;

	@Column(name="DT870_MSG_ID_POS")
	private String dt870_msg_id_pos;

	@Column(name="DT870_SERVICE_TYPE_IND")
	private String dt870_service_type_ind;

	@Column(name="DT870_MICROFILM_REF_NUM")
	private String dt870_microfilm_ref_num;

	@Column(name="DT870_FLAGS")
	private String dt870_flags;

	@Column(name="DT870_FILLER")
	private String dt870_filler;

	@Column(name="DT870_DRIVER_LVL2_NAME")
	private String dt870_driver_lvl2_name;

	@Column(name="DT870_DRIVER_LVL3_NAME")
	private String dt870_driver_lvl3_name;

	@Column(name="DT870_VEHICLE_LVL2_NAME")
	private String dt870_vehicle_lvl2_name;

	@Column(name="DT870_VEHICLE_LVL3_NAME")
	private String dt870_vehicle_lvl3_name;

	@Column(name="DT870_CARD_LVL2_NAME")
	private String dt870_card_lvl2_name;

	@Column(name="DT870_CARD_LVL3_NAME")
	private String dt870_card_lvl3_name;

	@Column(name="DT870_DRIVER_LVL4_ID")
	private int dt870_driver_lvl4_id;

	@Column(name="DT870_DRIVER_LVL4_NAME")
	private String dt870_driver_lvl4_name;

	@Column(name="DT870_DRIVER_LVL5_ID")
	private int dt870_driver_lvl5_id;

	@Column(name="DT870_DRIVER_LVL5_NAME")
	private String dt870_driver_lvl5_name;

	@Column(name="DT870_DRIVER_LVL6_ID")
	private int dt870_driver_lvl6_id;

	@Column(name="DT870_DRIVER_LVL6_NAME")
	private String dt870_driver_lvl6_name;

	@Column(name="DT870_DRIVER_LVL7_ID")
	private int dt870_driver_lvl7_id;

	@Column(name="DT870_DRIVER_LVL7_NAME")
	private String dt870_driver_lvl7_name;

	@Column(name="DT870_VEHICLE_LVL4_ID")
	private int dt870_vehicle_lvl4_id;

	@Column(name="DT870_VEHICLE_LVL4_NAME")
	private String dt870_vehicle_lvl4_name;

	@Column(name="DT870_VEHICLE_LVL5_ID")
	private int dt870_vehicle_lvl5_id;

	@Column(name="DT870_VEHICLE_LVL5_NAME")
	private String dt870_vehicle_lvl5_name;

	@Column(name="DT870_VEHICLE_LVL6_ID")
	private int dt870_vehicle_lvl6_id;

	@Column(name="DT870_VEHICLE_LVL6_NAME")
	private String dt870_vehicle_lvl6_name;

	@Column(name="DT870_VEHICLE_LVL7_ID")
	private int dt870_vehicle_lvl7_id;

	@Column(name="DT870_VEHICLE_LVL7_NAME")
	private String dt870_vehicle_lvl7_name;

	@Column(name="DT870_CARD_LVL4_ID")
	private int dt870_card_lvl4_id;

	@Column(name="DT870_CARD_LVL4_NAME")
	private String dt870_card_lvl4_name;

	@Column(name="DT870_CARD_LVL5_ID")
	private int dt870_card_lvl5_id;

	@Column(name="DT870_CARD_LVL5_NAME")
	private String dt870_card_lvl5_name;

	@Column(name="DT870_CARD_LVL6_ID")
	private int dt870_card_lvl6_id;

	@Column(name="DT870_CARD_LVL6_NAME")
	private String dt870_card_lvl6_name;

	@Column(name="DT870_CARD_LVL7_ID")
	private int dt870_card_lvl7_id;

	@Column(name="DT870_CARD_LVL7_NAME")
	private String dt870_card_lvl7_name;

	@Column(name="DT870_DRIVER_USER_CODE1")
	private String dt870_driver_user_code1;

	@Column(name="DT870_DRIVER_USER_CODE2")
	private String dt870_driver_user_code2;

	@Column(name="DT870_DRIVER_USER_CODE3")
	private String dt870_driver_user_code3;

	@Column(name="DT870_DRIVER_USER_CODE4")
	private String dt870_driver_user_code4;

	@Column(name="DT870_DRIVER_USER_CODE5")
	private String dt870_driver_user_code5;

	@Column(name="DT870_VEHICLE_USER_CODE1")
	private String dt870_vehicle_user_code1;

	@Column(name="DT870_VEHICLE_USER_CODE2")
	private String dt870_vehicle_user_code2;

	@Column(name="DT870_VEHICLE_USER_CODE3")
	private String dt870_vehicle_user_code3;

	@Column(name="DT870_VEHICLE_USER_CODE4")
	private String dt870_vehicle_user_code4;

	@Column(name="DT870_VEHICLE_USER_CODE5")
	private String dt870_vehicle_user_code5;

	@Column(name="DT870_CARD_USER_CODE1")
	private String dt870_card_user_code1;

	@Column(name="DT870_CARD_USER_CODE2")
	private String dt870_card_user_code2;

	@Column(name="DT870_CARD_USER_CODE3")
	private String dt870_card_user_code3;

	@Column(name="DT870_CARD_USER_CODE4")
	private String dt870_card_user_code4;

	@Column(name="DT870_CARD_USER_CODE5")
	private String dt870_card_user_code5;

	@Column(name="DT870_MERCH_NAME")
	private String dt870_merch_name;

	@Column(name="DT870_FILLER_1")
	private String dt870_filler_1;

	@Column(name="DT870_BULK_IND")
	private String dt870_bulk_ind;

	@Column(name="TR870_RECORD_TYPE")
	private String tr870_record_type;

	@Column(name="TR870_FILLER1")
	private int tr870_filler1;

	@Column(name="TR870_FILLER2")
	private int tr870_filler2;

	@Column(name="TR870_FILLER3")
	private int tr870_filler3;

	@Column(name="TR870_FILLER4")
	private int tr870_filler4;

	@Column(name="TR870_FILLER5")
	private int tr870_filler5;

	@Column(name="TR870_FILLER6")
	private int tr870_filler6;

	@Column(name="TR870_FILLER7")
	private int tr870_filler7;

	@Column(name="TR870_FILLER8")
	private int tr870_filler8;

	@Column(name="TR870_FILLER9")
	private int tr870_filler9;

	@Column(name="TR870_FILLER10")
	private int tr870_filler10;

	@Column(name="TR870_NUM_INVOICES")
	private int tr870_num_invoices;

	@Column(name="TR870_TOT_PROD_UNITS")
	private int tr870_tot_prod_units;

	@Column(name="TR870_TOT_PROD_AMT")
	private int tr870_tot_prod_amt;

	@Column(name="TR870_STMT_DATE")
	private String tr870_stmt_date;

	@Column(name="TR870_FILLER11")
	private String tr870_filler11;

	@Column(name="TR870_FILLER12")
	private String tr870_filler12;

	@Column(name="TR870_BULK_IND")
	private String tr870_bulk_ind;
	
	@Column(name="FILE_NAME")
	private String fileName;
	
	@Column(name="GM_MAINT_TYPE")
	private String gmMaintType;
	
	@Column(name="DATA_SOURCE")
	private String dataSource;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="MAINT_NOTI_JOB_COMPLETED")
	private String maintNotiJobCompleted;
	
	@Transient
	private String fuelPurchaseDate;
	
	@Transient
	private String fuelType;
	
	@Transient
	private double totalFuelAmt;
	
	
	@Transient
	private String maintDate;
	
	@Transient
	private String maintType;
	
	@Transient
	private double totalMaintAmt;
	
	
	@Transient
	private String fuelPurchaseTime;
	
	@Transient
	private int lastMileage;
	
	@Transient
	private double  totalGallons;
	
	@Transient
	private double costPerGallon;
	
	
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name="DT870_VEHICLE_VIN_NUM",insertable = false, updatable = false)
	private MyLease mylease;
	
	
	@ManyToOne
	@JoinColumn(name="DT870_PROD_CD",insertable = false, updatable = false)
	@NotFound(action=NotFoundAction.IGNORE)
	private VoyagerProdCD voyager;
	
	public VoyagerProdCD getVoyager() {
		return voyager;
	}

	
	public VoyagerFileTransactionData(int id,String dt870_vehicle_vin_num, MyLease mylease,VoyagerProdCD voyager){
		this.dt870_vehicle_vin_num=dt870_vehicle_vin_num;
		this.id=id;
		this.mylease=mylease;
		this.voyager=voyager;
	}

	
    public String toString() {		
		return "dt870_record_type@@@@"+dt870_record_type+"$$$$"+"dt870_acct_id@@@@"+dt870_acct_id+"$$$$"+"dt870_acct_lvl1_id@@@@"+dt870_acct_lvl1_id+"$$$$"+"dt870_driver_lvl2_id@@@@"+dt870_driver_lvl2_id+"$$$$"+"dt870_driver_lvl3_id@@@@"+dt870_driver_lvl3_id+"$$$$"+"dt870_driver_id@@@@"+dt870_driver_id+"$$$$"+"dt870_driver_lname@@@@"+dt870_driver_lname+"$$$$"+"dt870_driver_fname@@@@"+dt870_driver_fname+"$$$$"+"dt870_driver_minit@@@@"+dt870_driver_minit+"$$$$"+"dt870_vehicle_lvl2_id@@@@"+dt870_vehicle_lvl2_id+"$$$$"+"dt870_vehicle_lvl3_id@@@@"+dt870_vehicle_lvl3_id+"$$$$"+"dt870_vehicle_id@@@@"+dt870_vehicle_id+"$$$$"+"dt870_vehicle_vin_num@@@@"+dt870_vehicle_vin_num+"$$$$"+"dt870_vehicle_desc@@@@"+dt870_vehicle_desc+"$$$$"+"dt870_vehicle_lic_tag@@@@"+dt870_vehicle_lic_tag+"$$$$"+"dt870_vehicle_lic_tag_st@@@@"+dt870_vehicle_lic_tag_st+"$$$$"+"dt870_card_lvl2_id@@@@"+dt870_card_lvl2_id+"$$$$"+"dt870_card_lvl3_id@@@@"+dt870_card_lvl3_id+"$$$$"+"dt870_card_id@@@@"+dt870_card_id+"$$$$"+"dt870_participant_cd@@@@"+dt870_participant_cd+"$$$$"+"dt870_trans_purch_date@@@@"+dt870_trans_purch_date+"$$$$"+"dt870_trans_purch_time@@@@"+dt870_trans_purch_time+"$$$$"+"dt870_inv_num@@@@"+dt870_inv_num+"$$$$"+"dt870_merch_acct_num@@@@"+dt870_merch_acct_num+"$$$$"+"dt870_merch_addr@@@@"+dt870_merch_addr+"$$$$"+"dt870_merch_city@@@@"+dt870_merch_city+"$$$$"+"dt870_merch_st@@@@"+dt870_merch_st+"$$$$"+"dt870_merch_zip@@@@"+dt870_merch_zip+"$$$$"+"dt870_merch_zip4@@@@"+dt870_merch_zip4+"$$$$"+"dt870_prod_cd@@@@"+dt870_prod_cd+"$$$$"+"dt870_prod_amt@@@@"+dt870_prod_amt+"$$$$"+"dt870_prod_units@@@@"+dt870_prod_units+"$$$$"+"dt870_cost_per_unit@@@@"+dt870_cost_per_unit+"$$$$"+"dt870_cost_per_mile@@@@"+dt870_cost_per_mile+"$$$$"+"dt870_miles_per_gal@@@@"+dt870_miles_per_gal+"$$$$"+"dt870_odometer@@@@"+dt870_odometer+"$$$$"+"dt870_msg_id_pos@@@@"+dt870_msg_id_pos+"$$$$"+"dt870_service_type_ind@@@@"+dt870_service_type_ind+"$$$$"+"dt870_microfilm_ref_num@@@@"+dt870_microfilm_ref_num+"$$$$"+"dt870_flags@@@@"+dt870_flags+"$$$$"+"dt870_filler@@@@"+dt870_filler+"$$$$"+"dt870_driver_lvl2_name@@@@"+dt870_driver_lvl2_name+"$$$$"+"dt870_driver_lvl3_name@@@@"+dt870_driver_lvl3_name+"$$$$"+"dt870_vehicle_lvl2_name@@@@"+dt870_vehicle_lvl2_name+"$$$$"+"dt870_vehicle_lvl3_name@@@@"+dt870_vehicle_lvl3_name+"$$$$"+"dt870_card_lvl2_name@@@@"+dt870_card_lvl2_name+"$$$$"+"dt870_card_lvl3_name@@@@"+dt870_card_lvl3_name+"$$$$"+"dt870_driver_lvl4_id@@@@"+dt870_driver_lvl4_id+"$$$$"+"dt870_driver_lvl4_name@@@@"+dt870_driver_lvl4_name+"$$$$"+"dt870_driver_lvl5_id@@@@"+dt870_driver_lvl5_id+"$$$$"+"dt870_driver_lvl5_name@@@@"+dt870_driver_lvl5_name+"$$$$"+"dt870_driver_lvl6_id@@@@"+dt870_driver_lvl6_id+"$$$$"+"dt870_driver_lvl6_name@@@@"+dt870_driver_lvl6_name+"$$$$"+"dt870_driver_lvl7_id@@@@"+dt870_driver_lvl7_id+"$$$$"+"dt870_driver_lvl7_name@@@@"+dt870_driver_lvl7_name+"$$$$"+"dt870_vehicle_lvl4_id@@@@"+dt870_vehicle_lvl4_id+"$$$$"+"dt870_vehicle_lvl4_name@@@@"+dt870_vehicle_lvl4_name+"$$$$"+"dt870_vehicle_lvl5_id@@@@"+dt870_vehicle_lvl5_id+"$$$$"+"dt870_vehicle_lvl5_name@@@@"+dt870_vehicle_lvl5_name+"$$$$"+"dt870_vehicle_lvl6_id@@@@"+dt870_vehicle_lvl6_id+"$$$$"+"dt870_vehicle_lvl6_name@@@@"+dt870_vehicle_lvl6_name+"$$$$"+"dt870_vehicle_lvl7_id@@@@"+dt870_vehicle_lvl7_id+"$$$$"+"dt870_vehicle_lvl7_name@@@@"+dt870_vehicle_lvl7_name+"$$$$"+"dt870_card_lvl4_id@@@@"+dt870_card_lvl4_id+"$$$$"+"dt870_card_lvl4_name@@@@"+dt870_card_lvl4_name+"$$$$"+"dt870_card_lvl5_id@@@@"+dt870_card_lvl5_id+"$$$$"+"dt870_card_lvl5_name@@@@"+dt870_card_lvl5_name+"$$$$"+"dt870_card_lvl6_id@@@@"+dt870_card_lvl6_id+"$$$$"+"dt870_card_lvl6_name@@@@"+dt870_card_lvl6_name+"$$$$"+"dt870_card_lvl7_id@@@@"+dt870_card_lvl7_id+"$$$$"+"dt870_card_lvl7_name@@@@"+dt870_card_lvl7_name+"$$$$"+"dt870_driver_user_code1@@@@"+dt870_driver_user_code1+"$$$$"+"dt870_driver_user_code2@@@@"+dt870_driver_user_code2+"$$$$"+"dt870_driver_user_code3@@@@"+dt870_driver_user_code3+"$$$$"+"dt870_driver_user_code4@@@@"+dt870_driver_user_code4+"$$$$"+"dt870_driver_user_code5@@@@"+dt870_driver_user_code5+"$$$$"+"dt870_vehicle_user_code1@@@@"+dt870_vehicle_user_code1+"$$$$"+"dt870_vehicle_user_code2@@@@"+dt870_vehicle_user_code2+"$$$$"+"dt870_vehicle_user_code3@@@@"+dt870_vehicle_user_code3+"$$$$"+"dt870_vehicle_user_code4@@@@"+dt870_vehicle_user_code4+"$$$$"+"dt870_vehicle_user_code5@@@@"+dt870_vehicle_user_code5+"$$$$"+"dt870_card_user_code1@@@@"+dt870_card_user_code1+"$$$$"+"dt870_card_user_code2@@@@"+dt870_card_user_code2+"$$$$"+"dt870_card_user_code3@@@@"+dt870_card_user_code3+"$$$$"+"dt870_card_user_code4@@@@"+dt870_card_user_code4+"$$$$"+"dt870_card_user_code5@@@@"+dt870_card_user_code5+"$$$$"+"dt870_merch_name@@@@"+dt870_merch_name+"$$$$"+"dt870_filler@@@@"+dt870_filler+"$$$$"+"dt870_bulk_ind@@@@"+dt870_bulk_ind+"$$$$"+"tr870_record_type@@@@"+tr870_record_type+"$$$$"+"tr870_filler1@@@@"+tr870_filler1+"$$$$"+"tr870_filler2@@@@"+tr870_filler2+"$$$$"+"tr870_filler3@@@@"+tr870_filler3+"$$$$"+"tr870_filler4@@@@"+tr870_filler4+"$$$$"+"tr870_filler5@@@@"+tr870_filler5+"$$$$"+"tr870_filler6@@@@"+tr870_filler6+"$$$$"+"tr870_filler7@@@@"+tr870_filler7+"$$$$"+"tr870_filler8@@@@"+tr870_filler8+"$$$$"+"tr870_filler9@@@@"+tr870_filler9+"$$$$"+"tr870_filler10@@@@"+tr870_filler10+"$$$$"+"tr870_num_invoices@@@@"+tr870_num_invoices+"$$$$"+"tr870_tot_prod_units@@@@"+tr870_tot_prod_units+"$$$$"+"tr870_tot_prod_amt@@@@"+tr870_tot_prod_amt+"$$$$"+"tr870_stmt_date@@@@"+tr870_stmt_date+"$$$$"+"tr870_filler11@@@@"+tr870_filler11+"$$$$"+"tr870_filler12@@@@"+tr870_filler12+"$$$$"+"tr870_bulk_ind@@@@"+tr870_bulk_ind;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public int getDt870_record_type() {
		return dt870_record_type;
	}

	public void setDt870_record_type(int dt870_record_type) {
		this.dt870_record_type = dt870_record_type;
	}

	public int getDt870_acct_id() {
		return dt870_acct_id;
	}

	public void setDt870_acct_id(int dt870_acct_id) {
		this.dt870_acct_id = dt870_acct_id;
	}

	public int getDt870_acct_lvl1_id() {
		return dt870_acct_lvl1_id;
	}

	public void setDt870_acct_lvl1_id(int dt870_acct_lvl1_id) {
		this.dt870_acct_lvl1_id = dt870_acct_lvl1_id;
	}

	public int getDt870_driver_lvl2_id() {
		return dt870_driver_lvl2_id;
	}

	public void setDt870_driver_lvl2_id(int dt870_driver_lvl2_id) {
		this.dt870_driver_lvl2_id = dt870_driver_lvl2_id;
	}

	public int getDt870_driver_lvl3_id() {
		return dt870_driver_lvl3_id;
	}

	public void setDt870_driver_lvl3_id(int dt870_driver_lvl3_id) {
		this.dt870_driver_lvl3_id = dt870_driver_lvl3_id;
	}

	public int getDt870_driver_id() {
		return dt870_driver_id;
	}

	public void setDt870_driver_id(int dt870_driver_id) {
		this.dt870_driver_id = dt870_driver_id;
	}

	public String getDt870_driver_lname() {
		return dt870_driver_lname;
	}

	public void setDt870_driver_lname(String dt870_driver_lname) {
		this.dt870_driver_lname = dt870_driver_lname;
	}

	public String getDt870_driver_fname() {
		return dt870_driver_fname;
	}

	public void setDt870_driver_fname(String dt870_driver_fname) {
		this.dt870_driver_fname = dt870_driver_fname;
	}

	public String getDt870_driver_minit() {
		return dt870_driver_minit;
	}

	public void setDt870_driver_minit(String dt870_driver_minit) {
		this.dt870_driver_minit = dt870_driver_minit;
	}

	public int getDt870_vehicle_lvl2_id() {
		return dt870_vehicle_lvl2_id;
	}

	public void setDt870_vehicle_lvl2_id(int dt870_vehicle_lvl2_id) {
		this.dt870_vehicle_lvl2_id = dt870_vehicle_lvl2_id;
	}

	public int getDt870_vehicle_lvl3_id() {
		return dt870_vehicle_lvl3_id;
	}

	public void setDt870_vehicle_lvl3_id(int dt870_vehicle_lvl3_id) {
		this.dt870_vehicle_lvl3_id = dt870_vehicle_lvl3_id;
	}

	public int getDt870_vehicle_id() {
		return dt870_vehicle_id;
	}

	public void setDt870_vehicle_id(int dt870_vehicle_id) {
		this.dt870_vehicle_id = dt870_vehicle_id;
	}

	public String getDt870_vehicle_vin_num() {
		return dt870_vehicle_vin_num;
	}

	public void setDt870_vehicle_vin_num(String dt870_vehicle_vin_num) {
		this.dt870_vehicle_vin_num = dt870_vehicle_vin_num;
	}

	public String getDt870_vehicle_desc() {
		return dt870_vehicle_desc;
	}

	public void setDt870_vehicle_desc(String dt870_vehicle_desc) {
		this.dt870_vehicle_desc = dt870_vehicle_desc;
	}

	public String getDt870_vehicle_lic_tag() {
		return dt870_vehicle_lic_tag;
	}

	public void setDt870_vehicle_lic_tag(String dt870_vehicle_lic_tag) {
		this.dt870_vehicle_lic_tag = dt870_vehicle_lic_tag;
	}

	public String getDt870_vehicle_lic_tag_st() {
		return dt870_vehicle_lic_tag_st;
	}

	public void setDt870_vehicle_lic_tag_st(String dt870_vehicle_lic_tag_st) {
		this.dt870_vehicle_lic_tag_st = dt870_vehicle_lic_tag_st;
	}

	public int getDt870_card_lvl2_id() {
		return dt870_card_lvl2_id;
	}

	public void setDt870_card_lvl2_id(int dt870_card_lvl2_id) {
		this.dt870_card_lvl2_id = dt870_card_lvl2_id;
	}

	public int getDt870_card_lvl3_id() {
		return dt870_card_lvl3_id;
	}

	public void setDt870_card_lvl3_id(int dt870_card_lvl3_id) {
		this.dt870_card_lvl3_id = dt870_card_lvl3_id;
	}

	public int getDt870_card_id() {
		return dt870_card_id;
	}

	public void setDt870_card_id(int dt870_card_id) {
		this.dt870_card_id = dt870_card_id;
	}

	public int getDt870_participant_cd() {
		return dt870_participant_cd;
	}

	public void setDt870_participant_cd(int dt870_participant_cd) {
		this.dt870_participant_cd = dt870_participant_cd;
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

	public String getDt870_inv_num() {
		return dt870_inv_num;
	}

	public void setDt870_inv_num(String dt870_inv_num) {
		this.dt870_inv_num = dt870_inv_num;
	}

	public String getDt870_merch_acct_num() {
		return dt870_merch_acct_num;
	}

	public void setDt870_merch_acct_num(String dt870_merch_acct_num) {
		this.dt870_merch_acct_num = dt870_merch_acct_num;
	}

	public String getDt870_merch_addr() {
		return dt870_merch_addr;
	}

	public void setDt870_merch_addr(String dt870_merch_addr) {
		this.dt870_merch_addr = dt870_merch_addr;
	}

	public String getDt870_merch_city() {
		return dt870_merch_city;
	}

	public void setDt870_merch_city(String dt870_merch_city) {
		this.dt870_merch_city = dt870_merch_city;
	}

	public String getDt870_merch_st() {
		return dt870_merch_st;
	}

	public void setDt870_merch_st(String dt870_merch_st) {
		this.dt870_merch_st = dt870_merch_st;
	}

	public String getDt870_merch_zip() {
		return dt870_merch_zip;
	}

	public void setDt870_merch_zip(String dt870_merch_zip) {
		this.dt870_merch_zip = dt870_merch_zip;
	}

	public String getDt870_merch_zip4() {
		return dt870_merch_zip4;
	}

	public void setDt870_merch_zip4(String dt870_merch_zip4) {
		this.dt870_merch_zip4 = dt870_merch_zip4;
	}

	public String getDt870_prod_cd() {
		return dt870_prod_cd;
	}

	public void setDt870_prod_cd(String dt870_prod_cd) {
		this.dt870_prod_cd = dt870_prod_cd;
	}

	public double getDt870_prod_amt() {
		return dt870_prod_amt;
	}

	public void setDt870_prod_amt(double dt870_prod_amt) {
		this.dt870_prod_amt = dt870_prod_amt;
	}

	public int getDt870_prod_units() {
		return dt870_prod_units;
	}

	public void setDt870_prod_units(int dt870_prod_units) {
		this.dt870_prod_units = dt870_prod_units;
	}

	public int getDt870_cost_per_unit() {
		return dt870_cost_per_unit;
	}

	public void setDt870_cost_per_unit(int dt870_cost_per_unit) {
		this.dt870_cost_per_unit = dt870_cost_per_unit;
	}

	public int getDt870_cost_per_mile() {
		return dt870_cost_per_mile;
	}

	public void setDt870_cost_per_mile(int dt870_cost_per_mile) {
		this.dt870_cost_per_mile = dt870_cost_per_mile;
	}

	public int getDt870_miles_per_gal() {
		return dt870_miles_per_gal;
	}

	public void setDt870_miles_per_gal(int dt870_miles_per_gal) {
		this.dt870_miles_per_gal = dt870_miles_per_gal;
	}

	public int getDt870_odometer() {
		return dt870_odometer;
	}

	public void setDt870_odometer(int dt870_odometer) {
		this.dt870_odometer = dt870_odometer;
	}

	public String getDt870_msg_id_pos() {
		return dt870_msg_id_pos;
	}

	public void setDt870_msg_id_pos(String dt870_msg_id_pos) {
		this.dt870_msg_id_pos = dt870_msg_id_pos;
	}

	public String getDt870_service_type_ind() {
		return dt870_service_type_ind;
	}

	public void setDt870_service_type_ind(String dt870_service_type_ind) {
		this.dt870_service_type_ind = dt870_service_type_ind;
	}

	public String getDt870_microfilm_ref_num() {
		return dt870_microfilm_ref_num;
	}

	public void setDt870_microfilm_ref_num(String dt870_microfilm_ref_num) {
		this.dt870_microfilm_ref_num = dt870_microfilm_ref_num;
	}

	public String getDt870_flags() {
		return dt870_flags;
	}

	public void setDt870_flags(String dt870_flags) {
		this.dt870_flags = dt870_flags;
	}

	public String getDt870_filler() {
		return dt870_filler;
	}

	public void setDt870_filler(String dt870_filler) {
		this.dt870_filler = dt870_filler;
	}

	public String getDt870_driver_lvl2_name() {
		return dt870_driver_lvl2_name;
	}

	public void setDt870_driver_lvl2_name(String dt870_driver_lvl2_name) {
		this.dt870_driver_lvl2_name = dt870_driver_lvl2_name;
	}

	public String getDt870_driver_lvl3_name() {
		return dt870_driver_lvl3_name;
	}

	public void setDt870_driver_lvl3_name(String dt870_driver_lvl3_name) {
		this.dt870_driver_lvl3_name = dt870_driver_lvl3_name;
	}

	public String getDt870_vehicle_lvl2_name() {
		return dt870_vehicle_lvl2_name;
	}

	public void setDt870_vehicle_lvl2_name(String dt870_vehicle_lvl2_name) {
		this.dt870_vehicle_lvl2_name = dt870_vehicle_lvl2_name;
	}

	public String getDt870_vehicle_lvl3_name() {
		return dt870_vehicle_lvl3_name;
	}

	public void setDt870_vehicle_lvl3_name(String dt870_vehicle_lvl3_name) {
		this.dt870_vehicle_lvl3_name = dt870_vehicle_lvl3_name;
	}

	public String getDt870_card_lvl2_name() {
		return dt870_card_lvl2_name;
	}

	public void setDt870_card_lvl2_name(String dt870_card_lvl2_name) {
		this.dt870_card_lvl2_name = dt870_card_lvl2_name;
	}

	public String getDt870_card_lvl3_name() {
		return dt870_card_lvl3_name;
	}

	public void setDt870_card_lvl3_name(String dt870_card_lvl3_name) {
		this.dt870_card_lvl3_name = dt870_card_lvl3_name;
	}

	public int getDt870_driver_lvl4_id() {
		return dt870_driver_lvl4_id;
	}

	public void setDt870_driver_lvl4_id(int dt870_driver_lvl4_id) {
		this.dt870_driver_lvl4_id = dt870_driver_lvl4_id;
	}

	public String getDt870_driver_lvl4_name() {
		return dt870_driver_lvl4_name;
	}

	public void setDt870_driver_lvl4_name(String dt870_driver_lvl4_name) {
		this.dt870_driver_lvl4_name = dt870_driver_lvl4_name;
	}

	public int getDt870_driver_lvl5_id() {
		return dt870_driver_lvl5_id;
	}

	public void setDt870_driver_lvl5_id(int dt870_driver_lvl5_id) {
		this.dt870_driver_lvl5_id = dt870_driver_lvl5_id;
	}

	public String getDt870_driver_lvl5_name() {
		return dt870_driver_lvl5_name;
	}

	public void setDt870_driver_lvl5_name(String dt870_driver_lvl5_name) {
		this.dt870_driver_lvl5_name = dt870_driver_lvl5_name;
	}

	public int getDt870_driver_lvl6_id() {
		return dt870_driver_lvl6_id;
	}

	public void setDt870_driver_lvl6_id(int dt870_driver_lvl6_id) {
		this.dt870_driver_lvl6_id = dt870_driver_lvl6_id;
	}

	public String getDt870_driver_lvl6_name() {
		return dt870_driver_lvl6_name;
	}

	public void setDt870_driver_lvl6_name(String dt870_driver_lvl6_name) {
		this.dt870_driver_lvl6_name = dt870_driver_lvl6_name;
	}

	public int getDt870_driver_lvl7_id() {
		return dt870_driver_lvl7_id;
	}

	public void setDt870_driver_lvl7_id(int dt870_driver_lvl7_id) {
		this.dt870_driver_lvl7_id = dt870_driver_lvl7_id;
	}

	public String getDt870_driver_lvl7_name() {
		return dt870_driver_lvl7_name;
	}

	public void setDt870_driver_lvl7_name(String dt870_driver_lvl7_name) {
		this.dt870_driver_lvl7_name = dt870_driver_lvl7_name;
	}

	public int getDt870_vehicle_lvl4_id() {
		return dt870_vehicle_lvl4_id;
	}

	public void setDt870_vehicle_lvl4_id(int dt870_vehicle_lvl4_id) {
		this.dt870_vehicle_lvl4_id = dt870_vehicle_lvl4_id;
	}

	public String getDt870_vehicle_lvl4_name() {
		return dt870_vehicle_lvl4_name;
	}

	public void setDt870_vehicle_lvl4_name(String dt870_vehicle_lvl4_name) {
		this.dt870_vehicle_lvl4_name = dt870_vehicle_lvl4_name;
	}

	public int getDt870_vehicle_lvl5_id() {
		return dt870_vehicle_lvl5_id;
	}

	public void setDt870_vehicle_lvl5_id(int dt870_vehicle_lvl5_id) {
		this.dt870_vehicle_lvl5_id = dt870_vehicle_lvl5_id;
	}

	public String getDt870_vehicle_lvl5_name() {
		return dt870_vehicle_lvl5_name;
	}

	public void setDt870_vehicle_lvl5_name(String dt870_vehicle_lvl5_name) {
		this.dt870_vehicle_lvl5_name = dt870_vehicle_lvl5_name;
	}

	public int getDt870_vehicle_lvl6_id() {
		return dt870_vehicle_lvl6_id;
	}

	public void setDt870_vehicle_lvl6_id(int dt870_vehicle_lvl6_id) {
		this.dt870_vehicle_lvl6_id = dt870_vehicle_lvl6_id;
	}

	public String getDt870_vehicle_lvl6_name() {
		return dt870_vehicle_lvl6_name;
	}

	public void setDt870_vehicle_lvl6_name(String dt870_vehicle_lvl6_name) {
		this.dt870_vehicle_lvl6_name = dt870_vehicle_lvl6_name;
	}

	public int getDt870_vehicle_lvl7_id() {
		return dt870_vehicle_lvl7_id;
	}

	public void setDt870_vehicle_lvl7_id(int dt870_vehicle_lvl7_id) {
		this.dt870_vehicle_lvl7_id = dt870_vehicle_lvl7_id;
	}

	public String getDt870_vehicle_lvl7_name() {
		return dt870_vehicle_lvl7_name;
	}

	public void setDt870_vehicle_lvl7_name(String dt870_vehicle_lvl7_name) {
		this.dt870_vehicle_lvl7_name = dt870_vehicle_lvl7_name;
	}

	public int getDt870_card_lvl4_id() {
		return dt870_card_lvl4_id;
	}

	public void setDt870_card_lvl4_id(int dt870_card_lvl4_id) {
		this.dt870_card_lvl4_id = dt870_card_lvl4_id;
	}

	public String getDt870_card_lvl4_name() {
		return dt870_card_lvl4_name;
	}

	public void setDt870_card_lvl4_name(String dt870_card_lvl4_name) {
		this.dt870_card_lvl4_name = dt870_card_lvl4_name;
	}

	public int getDt870_card_lvl5_id() {
		return dt870_card_lvl5_id;
	}

	public void setDt870_card_lvl5_id(int dt870_card_lvl5_id) {
		this.dt870_card_lvl5_id = dt870_card_lvl5_id;
	}

	public String getDt870_card_lvl5_name() {
		return dt870_card_lvl5_name;
	}

	public void setDt870_card_lvl5_name(String dt870_card_lvl5_name) {
		this.dt870_card_lvl5_name = dt870_card_lvl5_name;
	}

	public int getDt870_card_lvl6_id() {
		return dt870_card_lvl6_id;
	}

	public void setDt870_card_lvl6_id(int dt870_card_lvl6_id) {
		this.dt870_card_lvl6_id = dt870_card_lvl6_id;
	}

	public String getDt870_card_lvl6_name() {
		return dt870_card_lvl6_name;
	}

	public void setDt870_card_lvl6_name(String dt870_card_lvl6_name) {
		this.dt870_card_lvl6_name = dt870_card_lvl6_name;
	}

	public int getDt870_card_lvl7_id() {
		return dt870_card_lvl7_id;
	}

	public void setDt870_card_lvl7_id(int dt870_card_lvl7_id) {
		this.dt870_card_lvl7_id = dt870_card_lvl7_id;
	}

	public String getDt870_card_lvl7_name() {
		return dt870_card_lvl7_name;
	}

	public void setDt870_card_lvl7_name(String dt870_card_lvl7_name) {
		this.dt870_card_lvl7_name = dt870_card_lvl7_name;
	}

	public String getDt870_driver_user_code1() {
		return dt870_driver_user_code1;
	}

	public void setDt870_driver_user_code1(String dt870_driver_user_code1) {
		this.dt870_driver_user_code1 = dt870_driver_user_code1;
	}

	public String getDt870_driver_user_code2() {
		return dt870_driver_user_code2;
	}

	public void setDt870_driver_user_code2(String dt870_driver_user_code2) {
		this.dt870_driver_user_code2 = dt870_driver_user_code2;
	}

	public String getDt870_driver_user_code3() {
		return dt870_driver_user_code3;
	}

	public void setDt870_driver_user_code3(String dt870_driver_user_code3) {
		this.dt870_driver_user_code3 = dt870_driver_user_code3;
	}

	public String getDt870_driver_user_code4() {
		return dt870_driver_user_code4;
	}

	public void setDt870_driver_user_code4(String dt870_driver_user_code4) {
		this.dt870_driver_user_code4 = dt870_driver_user_code4;
	}

	public String getDt870_driver_user_code5() {
		return dt870_driver_user_code5;
	}

	public void setDt870_driver_user_code5(String dt870_driver_user_code5) {
		this.dt870_driver_user_code5 = dt870_driver_user_code5;
	}

	public String getDt870_vehicle_user_code1() {
		return dt870_vehicle_user_code1;
	}

	public void setDt870_vehicle_user_code1(String dt870_vehicle_user_code1) {
		this.dt870_vehicle_user_code1 = dt870_vehicle_user_code1;
	}

	public String getDt870_vehicle_user_code2() {
		return dt870_vehicle_user_code2;
	}

	public void setDt870_vehicle_user_code2(String dt870_vehicle_user_code2) {
		this.dt870_vehicle_user_code2 = dt870_vehicle_user_code2;
	}

	public String getDt870_vehicle_user_code3() {
		return dt870_vehicle_user_code3;
	}

	public void setDt870_vehicle_user_code3(String dt870_vehicle_user_code3) {
		this.dt870_vehicle_user_code3 = dt870_vehicle_user_code3;
	}

	public String getDt870_vehicle_user_code4() {
		return dt870_vehicle_user_code4;
	}

	public void setDt870_vehicle_user_code4(String dt870_vehicle_user_code4) {
		this.dt870_vehicle_user_code4 = dt870_vehicle_user_code4;
	}

	public String getDt870_vehicle_user_code5() {
		return dt870_vehicle_user_code5;
	}

	public void setDt870_vehicle_user_code5(String dt870_vehicle_user_code5) {
		this.dt870_vehicle_user_code5 = dt870_vehicle_user_code5;
	}

	public String getDt870_card_user_code1() {
		return dt870_card_user_code1;
	}

	public void setDt870_card_user_code1(String dt870_card_user_code1) {
		this.dt870_card_user_code1 = dt870_card_user_code1;
	}

	public String getDt870_card_user_code2() {
		return dt870_card_user_code2;
	}

	public void setDt870_card_user_code2(String dt870_card_user_code2) {
		this.dt870_card_user_code2 = dt870_card_user_code2;
	}

	public String getDt870_card_user_code3() {
		return dt870_card_user_code3;
	}

	public void setDt870_card_user_code3(String dt870_card_user_code3) {
		this.dt870_card_user_code3 = dt870_card_user_code3;
	}

	public String getDt870_card_user_code4() {
		return dt870_card_user_code4;
	}

	public void setDt870_card_user_code4(String dt870_card_user_code4) {
		this.dt870_card_user_code4 = dt870_card_user_code4;
	}

	public String getDt870_card_user_code5() {
		return dt870_card_user_code5;
	}

	public void setDt870_card_user_code5(String dt870_card_user_code5) {
		this.dt870_card_user_code5 = dt870_card_user_code5;
	}

	public String getDt870_merch_name() {
		return dt870_merch_name;
	}

	public void setDt870_merch_name(String dt870_merch_name) {
		this.dt870_merch_name = dt870_merch_name;
	}

	public String getDt870_filler_1() {
		return dt870_filler_1;
	}

	public void setDt870_filler_1(String dt870_filler_1) {
		this.dt870_filler_1 = dt870_filler_1;
	}

	public String getDt870_bulk_ind() {
		return dt870_bulk_ind;
	}

	public void setDt870_bulk_ind(String dt870_bulk_ind) {
		this.dt870_bulk_ind = dt870_bulk_ind;
	}

	public String getTr870_record_type() {
		return tr870_record_type;
	}

	public void setTr870_record_type(String tr870_record_type) {
		this.tr870_record_type = tr870_record_type;
	}

	public int getTr870_filler1() {
		return tr870_filler1;
	}

	public void setTr870_filler1(int tr870_filler1) {
		this.tr870_filler1 = tr870_filler1;
	}

	public int getTr870_filler2() {
		return tr870_filler2;
	}

	public void setTr870_filler2(int tr870_filler2) {
		this.tr870_filler2 = tr870_filler2;
	}

	public int getTr870_filler3() {
		return tr870_filler3;
	}

	public void setTr870_filler3(int tr870_filler3) {
		this.tr870_filler3 = tr870_filler3;
	}

	public int getTr870_filler4() {
		return tr870_filler4;
	}

	public void setTr870_filler4(int tr870_filler4) {
		this.tr870_filler4 = tr870_filler4;
	}

	public int getTr870_filler5() {
		return tr870_filler5;
	}

	public void setTr870_filler5(int tr870_filler5) {
		this.tr870_filler5 = tr870_filler5;
	}

	public int getTr870_filler6() {
		return tr870_filler6;
	}

	public void setTr870_filler6(int tr870_filler6) {
		this.tr870_filler6 = tr870_filler6;
	}

	public int getTr870_filler7() {
		return tr870_filler7;
	}

	public void setTr870_filler7(int tr870_filler7) {
		this.tr870_filler7 = tr870_filler7;
	}

	public int getTr870_filler8() {
		return tr870_filler8;
	}

	public void setTr870_filler8(int tr870_filler8) {
		this.tr870_filler8 = tr870_filler8;
	}

	public int getTr870_filler9() {
		return tr870_filler9;
	}

	public void setTr870_filler9(int tr870_filler9) {
		this.tr870_filler9 = tr870_filler9;
	}

	public int getTr870_filler10() {
		return tr870_filler10;
	}

	public void setTr870_filler10(int tr870_filler10) {
		this.tr870_filler10 = tr870_filler10;
	}

	public int getTr870_num_invoices() {
		return tr870_num_invoices;
	}

	public void setTr870_num_invoices(int tr870_num_invoices) {
		this.tr870_num_invoices = tr870_num_invoices;
	}

	public int getTr870_tot_prod_units() {
		return tr870_tot_prod_units;
	}

	public void setTr870_tot_prod_units(int tr870_tot_prod_units) {
		this.tr870_tot_prod_units = tr870_tot_prod_units;
	}

	public int getTr870_tot_prod_amt() {
		return tr870_tot_prod_amt;
	}

	public void setTr870_tot_prod_amt(int tr870_tot_prod_amt) {
		this.tr870_tot_prod_amt = tr870_tot_prod_amt;
	}

	public String getTr870_stmt_date() {
		return tr870_stmt_date;
	}

	public void setTr870_stmt_date(String tr870_stmt_date) {
		this.tr870_stmt_date = tr870_stmt_date;
	}

	public String getTr870_filler11() {
		return tr870_filler11;
	}

	public void setTr870_filler11(String tr870_filler11) {
		this.tr870_filler11 = tr870_filler11;
	}

	public String getTr870_filler12() {
		return tr870_filler12;
	}

	public void setTr870_filler12(String tr870_filler12) {
		this.tr870_filler12 = tr870_filler12;
	}

	public String getTr870_bulk_ind() {
		return tr870_bulk_ind;
	}

	public void setTr870_bulk_ind(String tr870_bulk_ind) {
		this.tr870_bulk_ind = tr870_bulk_ind;
	}

	public MyLease getMylease() {
		return mylease;
	}

	public void setMylease(MyLease mylease) {
		this.mylease = mylease;
	}

	public String getFuelPurchaseDate() {
		return fuelPurchaseDate;
	}

	public void setFuelPurchaseDate(String fuelPurchaseDate) {
		this.fuelPurchaseDate = fuelPurchaseDate;
	}

	public void setVoyager(VoyagerProdCD voyager) {
		this.voyager = voyager;
	}

	public VoyagerFileTransactionData(){
		
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public String getFuelPurchaseTime() {
		return fuelPurchaseTime;
	}


	public void setFuelPurchaseTime(String fuelPurchaseTime) {
		this.fuelPurchaseTime = fuelPurchaseTime;
	}


	public int getLastMileage() {
		return lastMileage;
	}


	public void setLastMileage(int lastMileage) {
		this.lastMileage = lastMileage;
	}


	public double getTotalGallons() {
		return totalGallons;
	}


	public void setTotalGallons(double totalGallons) {
		this.totalGallons = totalGallons;
	}


	public double getTotalFuelAmt() {
		return totalFuelAmt;
	}


	public void setTotalFuelAmt(double totalFuelAmt) {
		this.totalFuelAmt = totalFuelAmt;
	}


	public double getCostPerGallon() {
		return costPerGallon;
	}


	public void setCostPerGallon(double costPerGallon) {
		this.costPerGallon = costPerGallon;
	}

	public String getMaintType() {
		return maintType;
	}


	public void setMaintType(String maintType) {
		this.maintType = maintType;
	}


	public double getTotalMaintAmt() {
		return totalMaintAmt;
	}


	public void setTotalMaintAmt(double totalMaintAmt) {
		this.totalMaintAmt = totalMaintAmt;
	}


	public String getMaintDate() {
		return maintDate;
	}


	public void setMaintDate(String maintDate) {
		this.maintDate = maintDate;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getDataSource() {
		return dataSource;
	}


	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getGmMaintType() {
		return gmMaintType;
	}


	public void setGmMaintType(String gmMaintType) {
		this.gmMaintType = gmMaintType;
	}


	public String getMaintNotiJobCompleted() {
		return maintNotiJobCompleted;
	}


	public void setMaintNotiJobCompleted(String maintNotiJobCompleted) {
		this.maintNotiJobCompleted = maintNotiJobCompleted;
	}



	

	
}
