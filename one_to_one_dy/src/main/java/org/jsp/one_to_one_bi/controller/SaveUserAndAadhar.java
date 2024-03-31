package org.jsp.one_to_one_bi.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.one_to_one_bi.dto.AadharCard;
import org.jsp.one_to_one_bi.dto.User;

public class SaveUserAndAadhar {
	public static void main(String[] args) {
		User user =new User();
		user.setPhone(9390521120L);
		user.setName("ABC");
		
		AadharCard card =new AadharCard();
		card.setNumber(123412341234L);
		card.setDob(LocalDate.parse("1999-01-01"));
		card.setAddress("Andra pradesh");
		
		user.setCard(card);	// assigning aadharcard for user
		card.setUser(user); // assigning user for aadharcard
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		
	}
	}
