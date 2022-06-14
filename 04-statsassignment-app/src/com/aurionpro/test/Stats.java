package com.aurionpro.test;

public class Stats 
{
	public static void main (String[] args)
	{	
		int visited=-1;
		int n = args.length;
		int sum = 0;
		double average, median = 0;
		String temp;
		for(int i=0;i<n;i++)
		{ 	
			sum = sum + Integer.valueOf(args[i]);
			for(int j=i+1;j<n;j++)
			{
				if(Integer.valueOf(args[i])>Integer.valueOf(args[j]))
				{
					temp = args[i];
					(args[i])= (args[j]);
					args[j] = temp; 
				}
			}
		}
		average = sum/n; 
		if(n%2==0)
		{
			median=(Integer.valueOf(args[n/2]) + Integer.valueOf(args[n/2 -1]))/2;
		}
		else
		{
			median=Integer.valueOf(args[n/2]);
		}	
		System.out.println("the sum of all the elements in the array is "+ sum);
		System.out.println("the average of all the elements in the array is "+ average);
		System.out.println("the minimum value from all the elements in the array is"+ Integer.valueOf(args[0]));
		System.out.println("the maximum value from all the elements in the array is"+ Integer.valueOf(args[n-1]));
		System.out.println("the median value of all the elements is "+ median);	
		int[] fre = new int [n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(args[i]==args[j])
				{
					count=count+1;
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited)
			{
				fre[i]=count;
			}
		}
		System.out.println("element   |   frequency");
		for(int i=0;i<fre.length;i++)
		{
			if(fre[i]!=visited)
			{
				System.out.println(args[i]+"   |   "+fre[i]);
			}
		}
	}
}