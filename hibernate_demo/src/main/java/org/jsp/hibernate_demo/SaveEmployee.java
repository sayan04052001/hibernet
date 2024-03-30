package org.jsp.hibernate_demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("sayan");
		e1.setDegs("developer");
		e1.setPhone(9395966534l);
		e1.setSalary(5000);
		e1.setPassword("abc123");
		Configuration cfg = new Configuration().configure("hib.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s=factory.openSession();
		int id = (int) s.save(e1);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("user save with id:"+id);
	}

}
