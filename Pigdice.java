package com.aurionpro.test;

import java.util.Scanner;

public class Pigdice {

	static int getrandom() {
		int a = (int) (Math.random() * 6) + 1;
		return a;
	}

	public static void main(String[] args) {
		int turnscore = 0;
		int turn = 1;
		int score = 0;
		int points = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play PIG!");
		System.out.println("See how many turns it takes you to get to 20 points");
		System.out.println("Turn ends when you hold or roll a 1.");
		System.out.println("If you roll a 1, you lose all the points for the turn.");
		System.out.println("If you hold, you save all your points from your turn.");

		char choice;
		while (points < 20) {
			System.out.println("Roll or hold? (r/h)");
			choice = sc.next().charAt(0);

			if (choice == 'h') {
				points = points + turnscore;
				System.out.println("Score for turn :" + turnscore);
				System.out.println("Total score :" + points);
				turnscore = 0;
				turn = turn + 1;
			}

			else if (choice == 'r') {
				System.out.println("Turn :" + turn);
				int die = getrandom();
				System.out.println("Die :" + die);
				if (die == 1) {
					System.out.println("Turn over. No score.");
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

		System.out.println("Total score :" + points);
		System.out.println("You finished in" + turn + "turns");
		System.out.println("Game over");

	}
}