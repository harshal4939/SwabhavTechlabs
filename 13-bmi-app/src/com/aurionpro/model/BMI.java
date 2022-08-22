package com.aurionpro.model;

import com.aurionpro.model.Person;

public class BMI {
	Person person;
	private double bmi;

	public BMI(Person person) {
		this.person = person;
		this.bmi = calculateBMI();
	}

	private double calculateBMI() {
		double ht = 0.01 * person.getHeight();
		double wt = person.getWeight();
		bmi = wt / (ht * ht);
		System.out.println("The BMI of the person is : ");
		return bmi;

	}

	public String getBodyType() {
		if (bmi < 18.5)
			return "Bodytype is underweight.";
		if (bmi > 18.5 && bmi < 25)
			return "Bodytype is normal.";
		return "Bodytype is obese.";

	}

	public double getBmi() {
		return bmi;
	}

}