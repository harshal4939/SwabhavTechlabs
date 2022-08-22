package com.aurionpro.test;

public class Printer {
	DelegatePrinter dp = new DelegatePrinter();
	void print(){
		dp.print();
	}
}
