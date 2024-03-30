package org.jsp.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee2 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(4);
		e.setName("bahubali");
		e.setPhone(3821934552l);
		e.setDegs("king");
		e.setSalary(150);
		e.setPassword("devasena");
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		s.saveOrUpdate(e);
		Transaction t=s.beginTransaction();
		t.commit();
		

	}

}
