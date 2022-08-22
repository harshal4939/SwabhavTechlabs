package com.aurionpro.test;

public class immutable 
{
	public static void main (String args[])
	{
		String name = "harshal";
		System.out.println(name + name.hashCode());
		name = "nitesh";
		System.out.println(name + name.hashCode());
		String name1 = new String("nitesh").intern();
		if(name==name1)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
