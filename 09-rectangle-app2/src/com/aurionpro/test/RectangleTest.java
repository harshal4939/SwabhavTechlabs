package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(-10, 20,ColorType.BLUE);
		printRectangleA(smallRectangle);

		System.out.println("--------------------------------------------");

		Rectangle bigRectangle = new Rectangle(50, 800,ColorType.RED);
		printRectangleA(bigRectangle);

	}

	private static void printRectangleA(Rectangle rectangle) {
		double calculateArea = rectangle.calculateArea();
		System.out.println("rectangle height is :" + rectangle.getHeight());
		System.out.println("rectangle width is :" + rectangle.getWidth());
		System.out.println("Area of rectangle is :" + calculateArea);
		System.out.println("Colour of the rectangle is :"+ rectangle.getColor());
	}
	
	
}
