package com.aurionpro.case2;

public class A {
	int too;
	
	public int getToo() {
		return too;
	}

	public A(int too) {
		this.too = too;
		
	}
	
	public A() {
		this.too = 5;
		System.out.println(too);
	}
}
