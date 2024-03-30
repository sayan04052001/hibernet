package org.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyEmployeeByphoneAndPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee phone Number and Password to verify employee");
		long phone =sc.nextLong();
		String password = sc.next();
		Session s=new Configuration().configure("hib.cfg.xml").buildSessionFactory().openSession();
		Query<Employee> q= s.createQuery("select e from Employee e where e.phone=?1 and e.password=?2");
		q.setParameter(1,phone);
		q.setParameter(2, password);
		try {
			Employee e=q.getSingleResult();
			System.out.println("verification succesful");
			System.out.println("Employee Id:" +e.getId());
			System.out.println("Employee name:" +e.getName());
			System.out.println("Phone Number:" +e.getPhone());
			System.out.println("Designation:" +e.getDegs());
			System.out.println("salary:" +e.getSalary());
		}catch(NoResultException e ){
			System.err.println("Invalid phone number and password");
		}

	}

}
