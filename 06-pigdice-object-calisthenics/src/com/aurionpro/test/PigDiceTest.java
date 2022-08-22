package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PigDice;

public class PigDiceTest {
	static String name;
	PigDice pg = new PigDice();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play PIG!");
		System.out.println("See how many turns it takes you to get to 20 points");
		System.out.println("Turn ends when you hold or roll a 1.");
		System.out.println("If you roll a 1, you lose all the points for the turn.");
		System.out.println("If you hold, you save all your points from your turn.");
		System.out.print("Enter Player  Name : ");
		name = sc.next();
		System.out.println("Lets Play PIG!");
		game();
		System.out.println("Congratulations!!! You won.");
		printScore();
	}

	private static void game() {
		Scanner sc = new Scanner(System.in);
		char choice;
		while (pg.getPoints() < 20) {
			System.out.println("Roll or hold? (r/h)");
			choice = sc.next().charAt(0);
			if (choice == 'h')
				choiceh();
			if (choice == 'r')
				choicer();
		}
	}

	private static void choiceh() {
		System.out.println("you chose to hold");
		points = points + turnscore;
		System.out.println("Score for turn : " + turnscore);
		System.out.println("Total score : " + points);
		System.out.println("----------------------------");
		turnscore = 0;
		turn = turn + 1;
	}

	static void choicer() {
		System.out.println("you chose to roll");
		int b = turn + 1;
		System.out.println("Turn : " + b);
		int dievalue = getrandom();
		System.out.println("Die : " + dievalue);
		if (dievalue == 1) {
			System.out.println("Turn over. No score.");
			System.out.println("----------------------------");
			turnscore = 0;
			turn = turn + 1;
			game();
		}
		turnscore = turnscore + dievalue;
	}
	
	static void printScore() {
		System.out.println("Player name :"+playername);
		System.out.println("Total score : " + points);
		System.out.println("You finished in " + turn + " turns");
		System.out.println("****************************************************");
	}
	
}
