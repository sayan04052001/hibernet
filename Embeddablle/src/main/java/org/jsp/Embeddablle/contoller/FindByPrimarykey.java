package org.jsp.Embeddablle.contoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.Embeddablle.dto.User;
import org.jsp.Embeddablle.dto.UserId;

public class FindByPrimarykey {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	UserId userId= new UserId();
	userId.setEmail("abc@gmail.com");
	userId.setPhone(987654321l);
	User u= manager.find(User.class, userId);
	if(u !=null) {
		System.out.println("User name:"+u.getName());
		System.out.println("AGE:"+u.getAge());
		System.out.println("phone no.:"+u.getUserId().getPhone());
		System.out.println("email:"+u.getUserId().getEmail());
	}
	else {
		System.err.println("invalid userid");
	}
}}
