package com.direct.oto.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryFactory {
	private static SessionFactory sessionFactory;

	private SessionFactoryFactory() {

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
			Configuration config = new Configuration().configure();
			sessionFactory = config.buildSessionFactory();
			}
			catch(HibernateException hbe) {
				System.out.println("sessionfactory error started"); 
				System.out.println(hbe.getMessage());
			}
		}
		
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
