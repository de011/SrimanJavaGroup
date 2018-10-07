package com.direct.oto.helper;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionManager {
	private static Session session;

	public static Session getSession() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryFactory.getSessionFactory();
			session = sessionFactory.openSession();
		} catch (HibernateException hbe) {
			System.out.println("session error started by santu");
			System.out.println(hbe.getMessage());
		}

		return session;
	}

	public static void closeSession() {
		if (session != null) {
			session.close();
		}
	}
}
