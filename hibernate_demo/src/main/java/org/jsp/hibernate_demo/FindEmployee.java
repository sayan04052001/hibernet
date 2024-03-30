package org.jsp.hibernate_demo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the employee id to display details");
		int eid=sc.nextInt();
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		Employee e=s.load(Employee.class, eid);
		try {
		System.out.println("employee id:"+e.getId());
		System.out.println("employee name:"+e.getName());
		System.out.println("employee phone:"+e.getPhone());
		System.out.println("employee digs:"+e.getDegs());
		System.out.println("employee salary:"+e.getSalary());
		}
		catch(ObjectNotFoundException exception) {
		System.err.println("id is invalid");
		}
		}
	}


