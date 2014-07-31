package com.jesuslc.contact.dao;

import java.util.List;

import com.jesuslc.contact.form.Contact;


public interface ContactDao {

	public List<Contact> getContactList(Contact contact);
	
	public void addContact(Contact contact);
	
}
