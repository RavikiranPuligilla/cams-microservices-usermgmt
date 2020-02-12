package com.cams.model.recall;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_RECALL")

public class Recall {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="recall_seq")
	@SequenceGenerator(
			name="recall_seq",
			sequenceName="recall_sequence",
			allocationSize=1
		)
	
	@Column(name="ID")
	private int id;
	
	@Column(name="VIN_NUMBERS")
	private String vinNums;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="DOCUMENT_URL")
	private String documentURL;
	
	@Column(name="DOC_UPLOAD_RESPONSE")
	private String documentuploadResponse;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVinNums() {
		return vinNums;
	}

	public void setVinNums(String vinNums) {
		this.vinNums = vinNums;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDocumentURL() {
		return documentURL;
	}

	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}

	public String getDocumentuploadResponse() {
		return documentuploadResponse;
	}

	public void setDocumentuploadResponse(String documentuploadResponse) {
		this.documentuploadResponse = documentuploadResponse;
	}
	
	
	

}
