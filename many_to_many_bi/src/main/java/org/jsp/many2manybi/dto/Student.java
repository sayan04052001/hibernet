package org.jsp.many2manybi.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false)
private String name;
@ManyToMany(mappedBy = "students")
private List<Batch> batches;

public List<Batch> getBatches() {
	return batches;
}
public void setBatches(List<Batch> batches) {
	this.batches = batches;
}
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
public double getPerc() {
	return perc;
}
public void setPerc(double perc) {
	this.perc = perc;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Column(nullable = false)
private double perc;
@Column(nullable = false,unique = true)
private long phone;

}
