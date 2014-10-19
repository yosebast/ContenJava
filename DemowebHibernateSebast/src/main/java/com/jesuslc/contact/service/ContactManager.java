package com.jesuslc.contact.service;

import java.util.List;

import com.jesuslc.contact.form.Contact;

public interface ContactManager {

	
	public List<Contact> getContactsList(Contact contact);
	public void add(Contact contact);
	
	
}
