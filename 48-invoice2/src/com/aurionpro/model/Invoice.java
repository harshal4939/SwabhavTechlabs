package com.aurionpro.model;

public class Invoice {

	private String id;
	private String description;
	private double amount;
	private double discountPercent;
	private float tax;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}
	public double calculateTax() {
		return (amount * tax) / 100;
	}	
	
	public double calculateDiscount() {
		return (amount * discountPercent) / 100;

	}

	public double calculateTotal() {
		return amount + calculateTax() - calculateDiscount();
	}


	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", discountPercent="
				+ discountPercent + ", tax=" + tax + "]";
	}

	
}