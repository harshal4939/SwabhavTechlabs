package com.aurionpro.model;

public class Invoice {
	Product product;

	static double totalCost;

	public Invoice(Product product) {
		this.product = product;
		Invoice.totalCost = calculateTotalBill();
	}

	public static double getTotalBill() {
		return totalCost;
	}

	public double calculateTax() {
		return (product.cost * product.tax) / 100;
	}

	public double calculateDiscount() {
		return (product.cost * product.discountPercent) / 100;
	}

	public double calculateItemPrice() {
		return product.cost + calculateTax() - calculateDiscount();
	}

	public void printInvoiceDetails() {
		System.out.println(toString());
		System.out.println("Tax amount : " + calculateTax());
		System.out.println("Discount amount : " + calculateDiscount());
		System.out.println("Item price: " + calculateItemPrice());
		System.out.println("-------------------------------------------------------");

	}

	public double calculateTotalBill() {
		totalCost = totalCost + calculateItemPrice();
		return totalCost;
	}

	@Override
	public String toString() {
		return "Product [id=" + product.id + ", name=" + product.name + ", cost=" + product.cost + ", tax%="
				+ product.tax + ", discountPercent%=" + product.discountPercent + "]";
	}

}