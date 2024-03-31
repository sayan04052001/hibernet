package org.jsp.One_to_many_bi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(nullable = false)
private String name,brand;
	@Column(nullable = false)
private double cost;
	@ManyToOne
	@JoinColumn(name = "marchant_id")
	private Merchant marchant;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Merchant getMarchant() {
		return marchant;
	}
	public void setMarchant(Merchant marchant) {
		this.marchant = marchant;
	}
	
	
}
