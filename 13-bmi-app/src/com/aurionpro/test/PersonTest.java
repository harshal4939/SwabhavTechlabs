package com.aurionpro.test;
import com.aurionpro.model.*	;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person("Harshal",180,60,genderType.MALE);
		Person p2 = new Person("xyz",165,105,genderType.FEMALE);
		System.out.println(p1);
		System.out.println("----------------------------------------------------");
		System.out.println(p2);
		System.out.println("----------------------------------------------------");
		BMI bmi = new BMI(p1);
		printBody(bmi);
		bmi = new BMI(p2);
		printBody(bmi);
	}

	private static void printBody(BMI bmi) {
		String bodyType = bmi.getBodyType();
		System.out.println(bmi.getBmi());
		System.out.println(bodyType);
		System.out.println("----------------------------------------------------");
	}
	
}
