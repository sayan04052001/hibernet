package org.jsp.category.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.category.dto.Category ;

public class Result {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	String min = "Select min(c.value),c FROM  Category c";
    String max = "Select max(c.value),c FROM Category c";
    Query q = manager.createQuery(min);
    Query q1 = manager.createQuery(max);
	List<Category> es = q.getResultList();
	List<Category> es1 = q1.getResultList();
  for(Category c: es) {
	  System.out.println("most expencive:"+c.getCategory()+" value "+c.getValue());
  }
  for(Category c1: es1) {
	  System.out.println("most expencive:"+c1.getCategory()+" value "+c1.getValue());
  }
}
}
