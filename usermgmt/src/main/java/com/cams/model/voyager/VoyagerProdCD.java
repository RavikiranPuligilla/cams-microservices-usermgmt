package com.cams.model.voyager;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

//import com.cams.model.voyager.VoyagerFileTransactionData;


@Entity
@Table(name="VOYAGER_PROD_CD")

public class VoyagerProdCD {
	
	
	@Id 
	@Column(name="PROD_CODE")
	private String prodCode;
	
	@Column(name="PROD_DESC")
	private String prodDesc;
	
	@Column(name="PROD_ABBR")
	private String prodAbbr;
	
	
	@OneToMany(mappedBy="voyager")
	private List<VoyagerFileTransactionData> voyagerTransData;
	
	public List<VoyagerFileTransactionData>  getVoyagerTransData() {
		return voyagerTransData;
	}


	public void setVoyagerTransData(List<VoyagerFileTransactionData>  voyagerTransData) {
		this.voyagerTransData = voyagerTransData;
	}


	public String getProdCode() {
		return prodCode;
	}


	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}


	public String getProdDesc() {
		return prodDesc;
	}


	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}


	public String getProdAbbr() {
		return prodAbbr;
	}


	public void setProdAbbr(String prodAbbr) {
		this.prodAbbr = prodAbbr;
	}


	
	
	
	
	
	
	
}
