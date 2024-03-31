package org.jsp.One_to_many_bi.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.One_to_many_bi.dto.Merchant;
import org.jsp.One_to_many_bi.dto.Product;

public class SaveMerchantAndProduct {
public static void main(String[] args) {
	Merchant m= new Merchant();
	m.setName("Bala");
	m.setPhone(9233747894l);
	m.setPassword("abc123");
	
	Product p1=new Product();
	p1.setBrand("Nokia");
	p1.setName("smartphone");
	p1.setCost(12000);
	p1.setMarchant(m);
	
	Product p2=new Product();
	p2.setBrand("viao");
	p2.setName("Lap3top");
	p2.setCost(121000);
	p2.setMarchant(m);
	
	Product p3=new Product();
	p3.setBrand("backberry");
	p3.setName("smartphone");
	p3.setCost(120000);
	p3.setMarchant(m);
	
	List<Product> products=new ArrayList<Product>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	m.setProducts(products);
	
	EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(m);
	transaction.begin();
	transaction.commit();
	
}
}
