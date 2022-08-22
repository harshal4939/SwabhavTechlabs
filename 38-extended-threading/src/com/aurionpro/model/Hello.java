package com.aurionpro.model;

public class Hello implements Runnable {
	public void run(){
		int count =0;
		for (int i =0;i<1000;i++) {
			count++;
			
		}
		System.out.println(count);
	}
}
