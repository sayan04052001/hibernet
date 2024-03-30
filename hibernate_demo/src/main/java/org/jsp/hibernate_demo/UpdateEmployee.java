package org.jsp.hibernate_demo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the employee to update details");
		int eid=sc.nextInt();
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		Employee e=s.get(Employee.class, eid);
		if(e!=null) {
			System.out.println("Enter the name,phone,disignation,salary and password to");
			e.setName(sc.next());
			e.setPhone(sc.nextLong());
			e.setDegs(sc.next());
			e.setSalary(sc.nextDouble());
			e.setPassword(sc.next());
			Transaction t= s.beginTransaction();
			t.commit();
			
		}
		else {
			System.err.println("Cannot update as the entered id is invalid");
		}
		

	}

}
