package org.jsp.hibernate_demo;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindAllEemployee {
	
		public static void main(String[] args) {
			String hql="select emp from Employee emp";
			Session s= new Configuration().configure().buildSessionFactory().openSession();
			Query<Employee> q = s.createQuery(hql);
			List<Employee> emps=q.getResultList();
					for(Employee e: emps) {
			System.out.println("Employee Id:" +e.getId());
			System.out.println("Employee name:" +e.getName());
			System.out.println("Phone Number:" +e.getPhone());
			System.out.println("Designation:" +e.getDegs());
			System.out.println("salary:" +e.getSalary());
			System.out.println();
		}
	}
	}


