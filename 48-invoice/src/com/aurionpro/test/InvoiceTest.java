package com.aurionpro.test;

import com.aurionpro.model.*;

public class InvoiceTest {
	public static void main(String[] args) {
		Product[] products = { 
				new Product("101", "Keyboard", 3000, 10, 5), 
				new Product("102", "Mouse", 2000, 10, 5),
				new Product("103", "Headphones", 7500, 15, 10), 
				new Product("104", "Giftcard", 500, 0, 0)};

		for (Product product : products) {
			product.printInvoice();
		}
		System.out.println("TOTAL BILL : " + Invoice.getTotalBill());
	}
}