package org.jsp.jpademo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "product")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable=false)
private String name,breand,category;
@Column(nullable=false) 
private double cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreand() {
	return breand;
}
public void setBreand(String breand) {
	this.breand = breand;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}



}
