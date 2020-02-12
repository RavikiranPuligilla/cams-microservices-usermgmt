package com.cams.model.recall;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAMS_RECALL_MAPPING")

public class RecallNotificationMapping {
		
		@Id 
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="recallmap_seq")
		@SequenceGenerator(
				name="recallmap_seq",
				sequenceName="recallmap_sequence",
				allocationSize=1
			)
		
		@Column(name="ID")
		private int id;
		
		@Column(name="VIN_NUMBER")
		private String vinNums;
		
		@Column(name="RECALL_ID")
		private int recallID;
		
		@Column(name="EMAIL_SENT")
		private String emailSent;
		
		@Column(name="DOCUMENT_URL")
		private String documentURL;
		
		@Column(name="EMAIL_ADRESS")
		private String emailAddress;
		
		@Column(name="CREATION_DATE")
		private java.util.Date creationDate;

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

		public int getRecallID() {
			return recallID;
		}

		public void setRecallID(int recallID) {
			this.recallID = recallID;
		}

		public String getEmailSent() {
			return emailSent;
		}

		public void setEmailSent(String emailSent) {
			this.emailSent = emailSent;
		}

		public String getDocumentURL() {
			return documentURL;
		}

		public void setDocumentURL(String documentURL) {
			this.documentURL = documentURL;
		}

		public java.util.Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(java.util.Date creationDate) {
			this.creationDate = creationDate;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		
		
	
}
