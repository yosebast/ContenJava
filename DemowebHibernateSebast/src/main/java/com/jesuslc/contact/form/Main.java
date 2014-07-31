package com.jesuslc.contact.form;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String[] ruta = {"C:\\eclipseJ2EE\\eclipse\\workspace\\DemowebHibernateSebast\\src\\main\\webapp\\WEB-INF\\spring\\root-context.xml"};
		
		ApplicationContext cont = new FileSystemXmlApplicationContext(ruta);
		
		
		Contact  contacto = (Contact) cont.getBean("contact");
		 System.out.println("nombr es "+contacto.getFirstname());
	}
	
}
