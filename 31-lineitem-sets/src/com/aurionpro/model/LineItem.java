package com.aurionpro.model;

public class LineItem {
	
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	private double totalPrice;
	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = calculateTotalPrice();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double calculateTotalPrice() {
		return this.quantity*this.unitPrice;
	}
	
	
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
}
