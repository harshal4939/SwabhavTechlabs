package com.aurionpro.model;

public class Hi implements Runnable{
	public void run(){
		int count =0;
		for (int i =0;i<1000;i++) {
			count = count+1;	
		}
		System.out.println(count);
	}
}
