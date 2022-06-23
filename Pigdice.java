package com.aurionpro.test;

import java.util.Scanner;

public class Pigdice {

	static int getrandom() {
		int a = (int) (Math.random() * 6) + 1;
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play PIG!");
		System.out.println("See how many turns it takes you to get to 20 points");
		System.out.println("Turn ends when you hold or roll a 1.");
		System.out.println("If you roll a 1, you lose all the points for the turn.");
		System.out.println("If you hold, you save all your points from your turn.");
		String p1;
		String p2;
		System.out.print("Enter Player 1 Name : ");
		p1 = sc.next();
		System.out.print("Enter Player 2 Name : ");
		p2 = sc.next();
		int p1turns, p2turns;
		System.out.println(p1 + " will play first.");
		System.out.println("Lets Play PIG!");
		p1turns = game();
		System.out.println("Now " + p2 + " will play the game.");
		System.out.println("Lets Play PIG!");
		p2turns = game();
		System.out.println(p1 + " finishes the game in " + p1turns + " turns and " + p2 + " finishes the game in "
				+ p2turns + " turns.");
		if (p1turns < p2turns) {
			System.out.println(p1 + " wins the game!!!");
		} else if (p1turns > p2turns) {
			System.out.println(p2 + " wins the game!!!");
		} else {
			System.out.println(p1 + " and" + p2 + " finished the game in equal turns.");
			System.out.println("So the game is tied.");
		}
	}

	public static int game() {
		Scanner sc = new Scanner(System.in);
		int turnscore = 0;
		int turn = 0;
		int points = 0;
		char choice;
		while (points < 20) {
			System.out.println("Roll or hold? (r/h)");
			choice = sc.next().charAt(0);

			if (choice == 'h') {
				points = points + turnscore;
				System.out.println("Score for turn : " + turnscore);
				System.out.println("Total score : " + points);
				System.out.println("----------------------------");
				turnscore = 0;
				turn = turn + 1;
			}

			else if (choice == 'r') {
				int b=turn+1;
				System.out.println("Turn : " + b);
				int die = getrandom();
				System.out.println("Die : " + die);
				if (die == 1) {
					System.out.println("Turn over. No score.");
					System.out.println("----------------------------");
					turnscore = 0;
					turn = turn + 1;
				} else {
					turnscore = turnscore + die;
				}
			}

			else {
				System.out.println("enter a valid input");
			}
		}
	
		System.out.println("Total score : " + points);
		System.out.println("You finished in " + turn + " turns");
		System.out.println("****************************************************");
		return turn;

	}

}
