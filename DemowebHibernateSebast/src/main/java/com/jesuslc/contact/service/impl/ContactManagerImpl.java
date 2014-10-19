package com.jesuslc.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jesuslc.contact.dao.ContactDao;
import com.jesuslc.contact.form.Contact;
import com.jesuslc.contact.service.ContactManager;

@Service
public class ContactManagerImpl implements ContactManager {
	
	@Autowired
	private ContactDao contactDao;
	
	@Transactional
	public List<Contact> getContactsList(Contact contact) {
		
		return contactDao.getContactList(contact);		
		
	}
	
	@Transactional
	public void add(Contact contact){	
		
		contactDao.addContact(contact);
		
	}

	
	
	
	
}
