package org.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class FindEmployeeByPhone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee phone number to deiails");
		long phone =sc.nextLong();
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		Query<Employee> q =s.createQuery("select e from Employee e where e.phone=:ph ");
		q.setParameter("ph", phone);
		try {
			Employee e=q.getSingleResult();
			System.out.println("Employee Id:" +e.getId());
			System.out.println("Employee name:" +e.getName());
			System.out.println("Phone Number:" +e.getPhone());
			System.out.println("Designation:" +e.getDegs());
			System.out.println("salary:" +e.getSalary());
		}
		catch(NoResultException e) {
			System.err.println("no phone number in employee"+phone);
		}
		
	}

}
