package com.jesuslc.contact.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Repository;


import com.jesuslc.contact.dao.ContactDao;
import com.jesuslc.contact.form.Contact;


@Repository
public class ContactDaoImpl implements ContactDao {

	private static final Logger logger = Logger.getLogger(ContactDaoImpl.class
			.getName());
	
	
	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
			
	@Autowired
	public ContactDaoImpl(SessionFactory sessionFactory){		
			this.hibernateTemplate = new HibernateTemplate(sessionFactory);
			this.jdbcTemplate = new JdbcTemplate(SessionFactoryUtils.getDataSource(sessionFactory));
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> getContactList(Contact contact) {
		StringBuffer query = new StringBuffer(" from Contact ");
		List<Contact> list = (List<Contact>)
				  hibernateTemplate.find(query.toString());
		return list;
	}
	
	public void addContact(Contact contact){
		
		hibernateTemplate.save(contact);
		
		
	}

}
