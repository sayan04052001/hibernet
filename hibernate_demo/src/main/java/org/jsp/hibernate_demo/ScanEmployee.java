package org.jsp.hibernate_demo;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ScanEmployee {

	public static void main(String[] args) {
		System.out.println("Enter the name ,phone,deisgnation,salary and password");
		Scanner sc= new Scanner(System.in);
		Employee e1=new Employee();
//		System.out.println("enter name");
		e1.setName(sc.next());
//		System.out.println("enter phone number");
		e1.setPhone(sc.nextLong());
		e1.setDegs(sc.next());
		e1.setSalary(sc.nextDouble());
		e1.setPassword(sc.next());
		Configuration cfg = new Configuration().configure("hib.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s=factory.openSession();
		int id = (int) s.save(e1);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("user save with id:"+id);

	}

}
