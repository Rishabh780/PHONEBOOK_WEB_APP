package com.santanu.service;

import java.util.List;

import com.santanu.dto.Contact;
import com.santanu.entity.ContactEntity;

public interface ContactService {
	
	boolean saveContact(ContactEntity c);
	
	List<Contact> getAllContacts();
	
	Contact getContactById(Integer cid);
	
	boolean updateContact(Contact c);
	
	boolean deleteContact(Integer cid);

	boolean saveContact(Contact c);

}
