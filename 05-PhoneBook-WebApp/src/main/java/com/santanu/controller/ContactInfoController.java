package com.santanu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.santanu.dto.Contact;
import com.santanu.service.ContactService;

@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping(value= {"/", "/addContact" })
	public String loadForm(Model model) {
		
		Contact c = new Contact();
		
		model.addAttribute("Contact", c);
		return "contactInfo";
	}
	
	@PostMapping(value ="/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact")Contact c, Model model) {
		
		boolean isSaved=contactService.saveContact(c);
		if(isSaved) {
			model.addAttribute("succMsg", "Contact saved");
		}else {
			model.addAttribute("errMsg", "failed to contact save");
			
		}
		
		return "contactInfo";
	}
	
	@GetMapping("/viewContacts")
	public String handleViewContactsLink(Model model) {
		
		List<Contact> contactsList=contactService.getAllContacts();
		model.addAttribute("contacts", contactsList);
		
		return "viewContacts";
	}

}
