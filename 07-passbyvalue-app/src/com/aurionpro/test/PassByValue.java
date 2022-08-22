package com.aurionpro.test;

public class PassByValue
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a);
		incrementNumberByOne(a);
		System.out.println(a);
		int marks[] = {50,60,80,70};
		int n = marks.length;
		for(int i = 0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		updateMarksToZero(marks);
		for(int i = 0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		
		
	}
	
	static void incrementNumberByOne(int a)
	{
		a = a +1;
	}
	
	static void updateMarksToZero(int marks[])
	{	
		int m = marks.length;
		for(int i = 0;i<m;i++)
		{
			marks[i]=0;
		}
	}
}
