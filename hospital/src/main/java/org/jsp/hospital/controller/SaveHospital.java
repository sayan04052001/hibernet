package org.jsp.hospital.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.hospital.dto.Admin;
import org.jsp.hospital.dto.Hospital;

public class SaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setFounder("Debajyoti Ghosh");
		hospital.setGst("asdfgh1231465");
		Admin a1 = new Admin();
		a1.setName("Apollo-A");
		a1.setPhone(1234567890);
		a1.setEmail("debajyotighosh200017@gmail.com");
		a1.setPassword("ssjf");
		
		Admin a2 = new Admin();
		a2.setName("Apollo-B");
		a2.setPhone(1232233550);
		a2.setEmail("debajyotighosh200018@gmail.com");
		a2.setPassword("1bh");
		
		Admin a3 = new Admin();
		a3.setName("Apollo-C");
		a3.setPhone(1238899550);
		a3.setEmail("debajyotighosh200019@gmail.com");
		a3.setPassword("hcvh1");
		
		List<Admin> admins = new ArrayList<Admin>(Arrays.asList(a1,a2,a3));
		hospital.setAdmin(admins);
		manager.persist(hospital);
		manager.persist(a1);
		manager.persist(a2);
		manager.persist(a3);
		transaction.begin();
		transaction.commit();
		}
		}

