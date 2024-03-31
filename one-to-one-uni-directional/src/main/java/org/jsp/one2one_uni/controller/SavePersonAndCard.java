package org.jsp.one2one_uni.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.one2one_uni.dto.PanCard;
import org.jsp.one2one_uni.dto.Person;

public class SavePersonAndCard {
public static void main(String[] args) {
	Person p= new Person();
	p.setName("sayan");
	p.setPhone(8368348484l);
	p.setEmail("djajfkhrfk@23");
	PanCard card= new PanCard();
	card.setNumber("7644e37");
	card.setPincode(1245);
	card.setDob(LocalDate.parse("2001-05-04"));
	p.setCard(card);
	EntityManager m=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=m.getTransaction();
	m.persist(p);
	m.persist(card);
	t.begin();
	t.commit();
	
	
	
}}
