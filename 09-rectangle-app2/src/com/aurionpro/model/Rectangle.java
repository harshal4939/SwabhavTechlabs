package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private ColorType color;

	public Rectangle(double x, double y, ColorType ch) {
		this.height = validate(x);
		this.width = validate(y);
		this.color = ch;
	}
	
	public ColorType getColor() {
		return color;
	}

/*	public void setColor(ColorType color) {
		this.color = color;
	}*/

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double calculateArea() {
		double area = height * width;
		return area;
	}
/*
	private String validatecolor(String ch) {
		if (ch.toLowerCase().equals("green")) {
			return "green";
		}
		if (ch.toLowerCase().equals("blue")) {
			return "blue";
		}
		return "red";
	}*/

	private double validate(double z) {
		if (z < 0)
			return 1;
		if (z > 100)
			return 100;
		return z;
	}
}