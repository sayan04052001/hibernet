package org.jsp.hospital.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.hospital.dto.Admin;
@SuppressWarnings("all")
public class FetchHospital {
public static void main(String[] args) {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
EntityManager manager = factory.createEntityManager();
String qry = "select h from Hospital h";
Query q = manager.createQuery(qry);
List<Admin> bs = q.getResultList();
for (Admin b : bs) {
System.out.println("EmailID- " + b.getEmail());
System.out.println("Name- " + b.getName());
System.out.println("Phone- " + b.getPhone());
System.out.println("-----------------------------------");
}
}
}