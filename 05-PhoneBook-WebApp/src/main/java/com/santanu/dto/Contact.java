package com.santanu.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;


@Data
public class Contact implements Serializable {
	
	
	private static final long serialVersionUID=1l;
	
	
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Date createdDate;
	private Date updatedDate;
	/*
	 * public Object getContactId() { // TODO Auto-generated method stub return
	 * null; }
	 */

}
