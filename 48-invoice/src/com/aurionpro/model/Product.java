package com.aurionpro.model;

public class Product {
	String id;
	String name;
	double cost;
	float tax;
	double discountPercent;
	
	public Product(String id, String name, double cost, float tax, double discountPercent) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}
	
	public String getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	public double getcost() {
		return cost;
	}
	public float getTax() {
		return tax;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	
	public void printInvoice() {
		Invoice obj = new Invoice(this);
		obj.printInvoiceDetails();
	}
	
}