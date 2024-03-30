package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.jpademo.dao.Product;

public class FindProductById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Id to display");
		int pid = sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Product p = manager.find(Product.class, pid);
		if(p!=null)
		{
			System.out.println("product Id: "+p.getId());
			System.out.println("product Name: "+p.getName());
			System.out.println("Brand: "+p.getBreand());
			System.out.println("Category: "+p.getCategory());
			System.out.println("Cost: "+p.getCost());
		}
		else
		{
			System.err.println("Invalid Product Id");
		}
	}
}
