package com.aurionpro.test;

import com.aurionpro.model.IEmotions;

public class AnonymousTest {
	public static void main(String[] args) {
		IEmotions obj = new IEmotions() {

			@Override
			public void laugh() {
				// TODO Auto-generated method stub
				System.out.println("object is laughing");
			}

			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("object is crying");
			}
		};

		obj.cry();
		obj.laugh();
	}
}