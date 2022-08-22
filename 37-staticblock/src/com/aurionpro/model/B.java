package com.aurionpro.model;

public class B extends A{
	
	public  B() {
		System.out.println("In B constructor");
	}
	static {
		System.out.println("In B(child) class static block");
	}
}
