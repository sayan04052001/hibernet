package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dao.Product;

public class FindProductBYIdUsingJPQL {

	public static void main(String[] args) {
		Scanner s=  new Scanner(System.in);		
		System.out.println("Enter the product id to display details");
		int pid=s.nextInt();
		String jpql="select p from product p where p.id=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q= manager.createQuery(jpql);
		q.setParameter(1, pid);
		try{
			Product p=(Product) q.getSingleResult();
			System.out.println("product id:"+ p.getId());
			System.out.println("product name:" +p.getName());
			System.out.println("brand: "+p.getBreand());
			System.out.println("category:" +p.getCategory());
			System.out.println("cost:" +p.getCost());
		} catch(NoResultException e) {
			System.err.println("invalid product id");
		}
		
		}

}
