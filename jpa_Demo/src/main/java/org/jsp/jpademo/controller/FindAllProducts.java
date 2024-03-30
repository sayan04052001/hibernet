package org.jsp.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


import org.jsp.jpademo.dao.Product;


public class FindAllProducts {
public static void main(String[] args) {
	String jpql="select p from Product p";
	EntityManager m=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=m.createQuery(jpql);
	List<Product> products=q.getResultList();
	for(Product p:products) {
		System.out.println("product id:"+p.getId());
		System.out.println("produce name:"+p.getName());
		System.out.println("brand"+p.getBreand());
		System.out.println("category"+p.getCategory());
		System.out.println("cost"+p.getCost());
		System.out.println("=================================================");
	}
	
}
}
