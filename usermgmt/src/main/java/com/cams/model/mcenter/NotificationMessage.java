package com.cams.model.mcenter;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="CAMS_NOTIFICATION_MESSAGE")
public class NotificationMessage {
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="notificationmessage_seq")
	@SequenceGenerator(
			name="notificationmessage_seq",
			sequenceName="notificationmessage_sequence",
			allocationSize=1
		)
	@Column(name="ID")
	private int id;
	
	@Column(name="MESSAGE_ICON_CLASS")
	private String messageIconClass;
	
	@Column(name="MESSAGE_CONTENT")
	private String messageContent;
	
	
	@Column(name="MESSAGE_TITLE")
	private String messageTitle;

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessageIconClass() {
		return messageIconClass;
	}

	public void setMessageIconClass(String messageIconClass) {
		this.messageIconClass = messageIconClass;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	

	
	
	
}
