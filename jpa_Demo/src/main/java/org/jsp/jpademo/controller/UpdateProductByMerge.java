package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dao.Product;


public class UpdateProductByMerge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id name catagory brand cost");
		Product p= new Product();
		p.setId(sc.nextInt());
		p.setName(sc.next());
		p.setCategory(sc.next());
		p.setBreand(sc.next());
		p.setCost(sc.nextDouble());
		EntityManager m=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t=m.getTransaction();
		m.merge(p);
		t.begin();
		t.commit();
	}

}
