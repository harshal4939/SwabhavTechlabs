package com.aurionpro.test;

import com.aurionpro.model.*;

public class DisplayTest {
	public static void main(String[] args) {
		Advertisement obj = new Advertisement();
		IDisplayable monitor = new Monitor();
		obj.setDisplay(monitor);
		obj.showAd();
		
		IDisplayable television = new Television();
		obj.setDisplay(television);
		obj.showAd();
	}
}
