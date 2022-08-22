package com.aurionpro.model;

public interface IPresentation {
	
	void show();
	
	default void present() {
		System.out.println("present in interface");
	}
}
