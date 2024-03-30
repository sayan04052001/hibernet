package org.jsp.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dao.Product;

public class NativeQueryDemo {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
  Query q= manager.createNativeQuery("select * from Product where name=?",Product.class);
  q.setParameter(1, "samartphone");
  List<Product> Products=q.getResultList();
  for(Product p: Products) {
	  System.out.println("product id:"+p.getId());
		System.out.println("produce name:"+p.getName());
		System.out.println("brand"+p.getBreand());
		System.out.println("category"+p.getCategory());
		System.out.println("cost"+p.getCost());
		System.out.println("=================================================");
  }
}
}
