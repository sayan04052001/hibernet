package org.jsp.Embeddablle.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class User {
	@Embedded
	private UserId userId;
	
public UserId getUserId() {
		return userId;
	}
	public void setUserId(UserId userId) {
		this.userId = userId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private int age;
private String name;
}
