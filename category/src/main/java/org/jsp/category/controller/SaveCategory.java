package org.jsp.category.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.category.dto.Category;

public class SaveCategory {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the category and value");
	Category category=new Category();
	category.setCategory(sc.next());
	category.setValue(sc.nextInt());
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	manager.persist(category);
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	transaction.commit();
	System.out.println("category save by id:"+category.getId());
}
}
