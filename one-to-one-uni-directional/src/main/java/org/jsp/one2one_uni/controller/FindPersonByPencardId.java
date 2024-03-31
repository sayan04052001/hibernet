package org.jsp.one2one_uni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.one2one_uni.dto.Person;

public class FindPersonByPencardId {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Pencatd id to display person details");
	int card_id=s.nextInt();
	String jpql="select p from Person p where p.card.id=?1";
	EntityManager m=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=m.createQuery(jpql);
	q.setParameter(1, card_id);
	try {
		Person p =(Person)q.getSingleResult();
		System.out.println("person id:"+p.getId());
		System.out.println("NAME"+p.getName());
		System.out.println("Phone number:"+p.getPhone());
		System.out.println("Emil id:"+p.getEmail());
	} catch (NoResultException e) {
		// TODO: handle exception
		System.err.println("you have enter an invalid pancard id");
	}
}
}
