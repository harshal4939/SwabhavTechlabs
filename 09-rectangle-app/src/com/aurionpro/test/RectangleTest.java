package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.setHeight(5);
		smallRectangle.setWidth(20);
		printRectangleA(smallRectangle);
		
		System.out.println("----------");
		
		Rectangle bigRectangle = new Rectangle();
		bigRectangle.setHeight(5);
		bigRectangle.setWidth(20);
		printRectangleA(bigRectangle);
		System.out.println(smallRectangle.equals(bigRectangle));
		System.out.println(smallRectangle==bigRectangle);
		
		System.out.println(smallRectangle.isEqual(bigRectangle));
		
		
	}

	private static void printRectangleA(Rectangle rectangle) {
		double calculateArea = rectangle.calculateArea();
		System.out.println("rectangle height is :"+rectangle.getHeight());
		System.out.println("rectangle width is :"+rectangle.getWidth());
		System.out.println("Area of rectangle is :"+calculateArea);
	}

}
