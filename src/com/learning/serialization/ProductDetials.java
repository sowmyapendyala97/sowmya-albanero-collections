package com.learning.serialization;

public class ProductDetials extends Product {
	
	private int Quantity;
	private double pricePerUnit;
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(long pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public ProductDetials(int id, String prodName, int quantity, double pricePerUnit) {
		super(id, prodName);
		Quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	
	

}
