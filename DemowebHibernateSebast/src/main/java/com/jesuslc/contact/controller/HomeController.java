package com.jesuslc.contact.controller;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jesuslc.contact.form.Contact;
import com.jesuslc.contact.service.ContactManager;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ContactManager contactManager;
	
	
	@RequestMapping("/contact.htm")
	public void contacto() {
		
	}
	
	@RequestMapping("/contactList.htm")
	public void productList(Model model,
			@ModelAttribute("contact") Contact contact) {

		List<Contact> contacts = contactManager.getContactsList(contact);
		model.addAttribute("contacts", contacts);
		model.addAttribute("contact", contact);
		
	}
	
	@RequestMapping(value="/add.htm", method=RequestMethod.POST)
	public String add(@ModelAttribute("contact") Contact contact, BindingResult result)
	{
		
		contactManager.add(contact);
		
		return "redirect:/contactList.htm";
	}
	
	
	@RequestMapping(value = "/productView.htm", method = RequestMethod.GET)
	public @ModelAttribute("contact") Contact productView
			(@RequestParam(value = "id", required = false) Integer id) {

		//contactManager.upDateContact(Integer id);
		
		return new Contact();
	}
	
	
	
	
}
