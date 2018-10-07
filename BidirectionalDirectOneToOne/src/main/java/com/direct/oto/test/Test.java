package com.direct.oto.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.direct.oto.entity.Addmission;
import com.direct.oto.entity.ScholarShip;
import com.direct.oto.helper.SessionFactoryFactory;
import com.direct.oto.helper.SessionManager;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Addmission addmission = null;
		ScholarShip scholarShip = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryFactory.getSessionFactory();
			session = SessionManager.getSession();
			tx = session.beginTransaction();

			/*
			 * addmission = new Addmission(); addmission.setCandidateName("tiwari ji ");
			 * addmission.setCollege("karim city college jamsedpur ");
			 * addmission.setDateOfAddmission(new Date());
			 * addmission.setDegree("Master in scripting");
			 * 
			 * scholarShip = new ScholarShip(); scholarShip.setBankaccNum("icici54321");
			 * scholarShip.setCategory("ST"); scholarShip.setAmount("45000");
			 * 
			 * scholarShip.setAddmission(addmission);
			 * addmission.setScholarShip(scholarShip);
			 * 
			 * session.save(scholarShip);
			 */
			/*
			 * scholarShip = new ScholarShip(); scholarShip.setBankaccNum("icici12345555");
			 * scholarShip.setCategory("obc2"); scholarShip.setAmount("21000");
			 * 
			 * addmission = new Addmission(); addmission.setCandidateName("pkp ji ");
			 * addmission.setCollege("rospa tower ranchi ");
			 * addmission.setDateOfAddmission(new Date()); addmission.setDegree("btech");
			 * 
			 * addmission.setScholarShip(scholarShip);
			 * scholarShip.setAddmission(addmission);
			 * 
			 * session.save(scholarShip); session.save(addmission);
			 */

			addmission = (Addmission) session.get(Addmission.class, 11);
			scholarShip = (ScholarShip) session.get(ScholarShip.class, 11);
			
			addmission.setCandidateName("l222lllkkkk");
			scholarShip.setCategory("obcz");
			session.update(addmission);

			// session.delete(addmission);

			/*
			 * scholarShip = (ScholarShip) session.get(ScholarShip.class,7);
			 * session.delete(scholarShip);
			 */

			/*
			 * addmission = (Addmission) session.get(Addmission.class, 1);
			 * System.out.println(addmission);
			 */

			/*
			 * scholarShip = (ScholarShip) session.get(ScholarShip.class, 3);
			 * System.out.println(scholarShip);
			 */

			flag = true;
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {

			if (flag) {
				if (tx != null) {
					tx.commit();

				} else {
					tx.rollback();
				}
				SessionManager.closeSession();
				SessionFactoryFactory.closeSessionFactory();
			}
		}
	}
}
