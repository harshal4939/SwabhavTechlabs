package com.aurionpro.test;

import com.aurionpro.model.*;

public class ThreadingTest {

	public static void main(String[] args) {
		Runnable hi = new Hi();
		Runnable hello = new Hello();
		
		Thread t1=new Thread(hi);
		Thread t2=new Thread(hello);
		t1.start();
		t2.start();
		
	}
}
