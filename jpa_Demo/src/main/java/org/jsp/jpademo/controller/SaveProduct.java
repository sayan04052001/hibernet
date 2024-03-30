package org.jsp.jpademo.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import javax.persistence.EntityManager;



import org.jsp.jpademo.dao.Product;

public class SaveProduct {

	public static void main(String[] args) {
		Product p=new Product();
		p.setBreand("samsung");
		p.setName("smartPhone");
		p.setCategory("Electronics");
		p.setCost(13000);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager maneger=factory.createEntityManager();
		maneger.persist(p);
		EntityTransaction t=maneger.getTransaction();
		t.begin();
		t.commit();
		System.out.println("product added with id:"+p.getId());
	}

}
