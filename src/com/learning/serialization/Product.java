package com.learning.serialization;

import java.io.Serializable;

public class Product implements Serializable{

	
	private  int id;
	
	private String prodName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Product(int id, String prodName) {
		super();
		this.id = id;
		this.prodName = prodName;
	}
	
	
}
