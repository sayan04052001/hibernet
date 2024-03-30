package org.jsp.hibernate_demo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindEmployeeById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name id to display details");
		int eid=sc.nextInt();
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		Employee e=s.get(Employee.class, eid);
		if(e!=null) {
	System.out.println("employee id:"+e.getId());
	System.out.println("employee name:"+e.getName());
	System.out.println("employee phone:"+e.getPhone());
	System.out.println("employee digs:"+e.getDegs());
	System.out.println("employee salary:"+e.getSalary());
	
	}
		else {
			System.err.println("invalide");
		}
	
	}

}
