package com.aurionpro.model;

public class InvoicePrint {
	
	public static void main(String[] args) {
		
	}
	public void printInvoice(Invoice inv) {
		
		System.out.println("Tax = " + inv.calculateTax());
		System.out.println("Discount = " + inv.calculateDiscount());
		System.out.println("Total = " + inv.calculateTotal());

	}
}
