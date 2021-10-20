package com.esprit.microservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String productName;
	
	private Integer productQuantity;
	
	private String productCategory;

	public Product() {
		super();
	}

	public Product(String productName, Integer productQuantity, String productCategory) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productCategory = productCategory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
}
