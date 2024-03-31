package org.jsp.many2manybi.controller;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many2manybi.dto.Batch;
import org.jsp.many2manybi.dto.Student;



public class SaveBatchAndStudents {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Batch b1=new Batch();
		b1.setSubject("Hibernate");
		b1.setTrainer("Sathish");
		b1.setBatch_code("HID-E1");
		
		Batch b2=new Batch();
		b2.setSubject("JEE");
		b2.setTrainer("GURU RAJ");
		b2.setBatch_code("ADD-A5");
		
		Batch b3=new Batch();
		b3.setSubject("Reactjs");
		b3.setTrainer("prajwal");
		b3.setBatch_code("RCJ-M2");
		
		Student s1=new Student();
		s1.setName("Messi");
		s1.setPerc(85);
		s1.setPhone(888);
		
		Student s2=new Student();
		s2.setName("Ronaldo");
		s2.setPerc(84);
		s2.setPhone(999);
		
		Student s3=new Student();
		s3.setName("Chettri");
		s3.setPerc(95);
		s3.setPhone(777);
		
		Student s4=new Student();
		s4.setName("Neymer");
		s4.setPerc(80);
		s4.setPhone(666);
		List<Student> forB1=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		List<Student> forB2=new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4));
		List<Student> forB3=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		
		List<Batch> forS1=new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		List<Batch> forS2=new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		List<Batch> forS3=new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		List<Batch> forS4=new ArrayList<Batch>(Arrays.asList(b2));
		
		
		
		
		b1.setStudents(forB1);
		b2.setStudents(forB2);
		b3.setStudents(forB3);
		
		s1.setBatches(forS1);
		s2.setBatches(forS2);
		s3.setBatches(forS3);
		s4.setBatches(forS4);
		
		
		
		
		
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		
		transaction.begin();
		transaction.commit();

	}

}
