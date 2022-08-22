package com.aurionpro.model;

public class Rectangle 
{
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double calculateArea() 
	{	double area = getHeight()*getWidth();
		return area;
	}
	
	public boolean isEqual(Rectangle rectangle) {
		if(this.height==rectangle.height) {
			if(this.width==rectangle.width)
				return true;
		}
		return false;
	}
}	