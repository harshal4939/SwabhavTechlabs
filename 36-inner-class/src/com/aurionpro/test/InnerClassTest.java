package com.aurionpro.test;

import com.aurionpro.model.Outer;

public class InnerClassTest {

	public static void main(String[] args) {
		Outer.Inner obj = new Outer().new Inner();
		obj.print();
	/*	Outer o = new Outer();
		o.print();*/	
	}
}
