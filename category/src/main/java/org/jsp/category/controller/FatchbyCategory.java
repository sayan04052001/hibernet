package org.jsp.category.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.category.dto.Category;

public class FatchbyCategory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select c from Category c where c.category=?1";
		Query q = manager.createQuery(qry);
		System.out.println("enter the category");
		q.setParameter(1,sc.next());
		List<Category> es = q.getResultList();
		for( Category c : es) {
			System.out.println("id :"+c.getId());
			System.out.println("Category :"+c.getCategory());
			System.out.println("value :"+c.getValue());
			
			
		}
	
	}

}
