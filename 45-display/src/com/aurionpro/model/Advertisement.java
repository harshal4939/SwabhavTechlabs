package com.aurionpro.model;

public class Advertisement {
	IDisplayable disp;
	
	public void setDisplay(IDisplayable disp) {
		this.disp=disp;
	}
	
	public void showAd() {
		disp.display();
	}
}
