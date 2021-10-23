package com.esprit.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId ;
	
	private Integer products[] ;

	public Commande() {
		super();
	}

	public Commande(Integer userId, Integer[] products) {
		super();
		this.userId = userId;
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer[] getProducts() {
		return products;
	}

	public void setProducts(Integer[] products) {
		this.products = products;
	}

}
