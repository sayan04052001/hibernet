package org.jsp.many2manyuni.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many2manyuni.dto.Batch;



public class SaveBatchAndStudent {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Batch b1 = new Batch();
	b1.setSubject("HIBERNATE");
	b1.setTrainer("sathish");
	b1.setBatch_code("qwe_110");
	
	Batch b2 = new Batch();
	b2.setSubject("css");
	b2.setTrainer("projwl");
	b2.setBatch_code("qwe_2110");
	
	Batch b = new Batch();
	b1.setSubject("HIBERNATE");
	b1.setTrainer("sathish");
	b1.setBatch_code("qfswe_110");
}
}
