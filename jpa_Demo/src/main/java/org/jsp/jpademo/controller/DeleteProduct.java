package org.jsp.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dao.Product;

public class DeleteProduct {
public static void main(String[] args) {
	EntityManager m=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=m.getTransaction();
	Product p=m.find(Product.class,1);
	if(p!=null) {
		m.remove(p);
		t.begin();
		t.commit();
	}else {
		System.err.println("invalid id5..........+ ");
	}
}
}
