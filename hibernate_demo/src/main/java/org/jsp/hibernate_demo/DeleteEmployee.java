package org.jsp.hibernate_demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Employee id to delete");
	int eid= sc.nextInt();
	Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
	Employee  e=s.get(Employee.class, eid);
	if(e!=null) {
		s.delete(e);
		Transaction t=s.getTransaction();
		t.begin();
		t.commit();
		System.out.println("employee delete");
		
	}
	else {
		System.err.println("invaid id");
	}
	
}
}
