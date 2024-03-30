package org.jsp.hibernate_demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testcfg {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hib.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
	}

}