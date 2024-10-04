package com.santanu.entity;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_DTLS")
public class ContactEntity implements Serializable{
	
	@Id
	@Column(name="CONTACT_ID")
	@SequenceGenerator(
			name="cid_seq_gen",
			sequenceName = "CONTACT_ID_SEQ",
			allocationSize = 1 
			)
	@GeneratedValue(
			generator = "cid_seq_gen",
			strategy =GenerationType.SEQUENCE
			)
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CONTACT_DATE" , updatable=false)
	private Date createdDate;
	 
	//@CreationTimestamp
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE", insertable = false)
	private Date updatedDate;

	public Object getContactId() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public Object getContactId() { // TODO Auto-generated method stub return
	 * null; }
	 */

}
