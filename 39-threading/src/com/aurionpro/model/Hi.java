package com.aurionpro.model;

public class Hi extends Thread{
	public void run(){
		for (int i =0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
