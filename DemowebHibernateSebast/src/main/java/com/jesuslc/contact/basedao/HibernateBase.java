package com.jesuslc.contact.basedao;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;


import org.hibernate.SessionFactory;



@SuppressWarnings("deprecation")
public class HibernateBase {

	public static final Logger logger = Logger.getLogger(HibernateBase.class.getName());

	static Session session;

	public static Session createSession(Session session) {
		try {
			SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
			
			session = factory.getCurrentSession();
			
			if(!session.isOpen())
			{
				//logger.warn("Abro session");
				session = factory.openSession();
				session.beginTransaction();
				
			}
			else
			{
				//logger.warn("No abro session");
				session.beginTransaction();
			}
			
			
			
		} catch (HibernateException e) {
			logger.error("Error al abrir la session: " + e);
		}
		return session;
	}

	public static void commitSession(Session session) {
		try {
			session.getTransaction().commit();
		} catch (HibernateException ex) {
			logger.error("Error al cerrar la session: " + ex);
		}
	}
	
	public static void rollBackSession(Session session) {
		try {
			session.getTransaction().rollback();
		} catch (HibernateException ex) {
			logger.error("Error al cerrar la session: " + ex);
		}
	}
	
	public static void closeSession(Session session) {
		try {
			//logger.warn("Cierro solo en el caso de session abierta");
			if(session.isOpen())
				session.close();
		
		} catch (HibernateException ex) {
			logger.error("Error al cerrar la session: " + ex);
		}
	}

}
