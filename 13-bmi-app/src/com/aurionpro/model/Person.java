package com.aurionpro.model;

public class Person {
	private String name;
	private double height;
	private double weight;
	private genderType gender;
	
	
	public Person(String name, double height, double weight, genderType gender) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public genderType getGender() {
		return gender;
	}
	public void setGender(genderType gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender + "]";
	}
	
	
}
