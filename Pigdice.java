package com.aurionpro.test;
import java.util.*;
import java.lang.Math;

public class Pigdice
{
	static int getrandom()
	{
		int a = (int) (Math.random() * 5) + 1;
		return a;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play PIG!");
		System.out.println("See how many turns it takes you to get to 20 points");
		System.out.println("Turn ends when you hold or roll a 1.");
		System.out.println("If you roll a 1, you lose all the points for the turn.");
		System.out.println("If you hold, you save all your points from your turn.");
		char choice;
		System.out.println("Roll or hold? (r/h)");
		int turn = 1;
		int score = 0;
		int points = 0;
		choice = sc.next().charAt(0);
		int n =0;
		while(n==0)
		{	
			if(choice == 'h')
			{
				System.out.println("Score for turn :" + score);
				System.out.println("Total score :" + points);
				score = 0;
				turn = turn +1;
				System.out.println("Turn :" + turn);
				System.out.println("Roll or hold? (r/h)");
				choice = sc.next().charAt(0);
				
			}
			
			else if(choice == 'r')
			{	
				System.out.println("Turn :" + turn);
				int die = getrandom();
				System.out.println("Die :" + die);
				if(die==1)
				{
					System.out.println("Turn over. No score.");
					score = 0;
					points = 0;
					turn = turn +1;
					System.out.println("Press r to roll again");
					choice = sc.next().charAt(0);
				}
				else
				{
					score = score + die;
					points = points + die;
					System.out.println("Roll or hold? (r/h)");
					choice = sc.next().charAt(0);
				}
				if(points>19)
				{
					System.out.println("Total score :" + points);
					System.out.println("You finished in" + turn + "turns");
					System.out.println("Game over");
					n++;
				}
			}
			
			else
			{
				System.out.println("enter a valid input");
				System.out.println("Roll or hold(r/h)");
				choice = sc.next().charAt(0);
			}
		}
	}
}