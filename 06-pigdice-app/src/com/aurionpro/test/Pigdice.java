package com.aurionpro.test;

import java.util.Scanner;

public class Pigdice {

	static int getrandom() {
		int randomnumber = (int) (Math.random() * 6) + 1;
		return randomnumber;
	}

	public static void main(String[] args) {
		int player1turns, player2turns;
		String player1name;
		String player2name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play PIG!");
		System.out.println("See how many turns it takes you to get to 20 points");
		System.out.println("Turn ends when you hold or roll a 1.");
		System.out.println("If you roll a 1, you lose all the points for the turn.");
		System.out.println("If you hold, you save all your points from your turn.");
		System.out.print("Enter Player 1 Name : ");
		player1name = sc.next();
		System.out.print("Enter Player 2 Name : ");
		player2name = sc.next();
		System.out.println(player1name + " will play first.");
		System.out.println("Lets Play PIG!");
		player1turns = game();
		System.out.println("Now " + player2name + " will play the game.");
		System.out.println("Lets Play PIG!");
		player2turns = game();
		System.out.println(player1name + " finishes the game in " + player1turns + " turns and " + player2name
				+ " finishes the game in " + player2turns + " turns.");
		if (player1turns < player2turns) {
			System.out.println(player1name + " wins the game!!!");
		} if (player1turns > player2turns) {
			System.out.println(player2name + " wins the game!!!");
		} else {
			System.out.println(player1name + " and" + player2name + " finished the game in equal turns.");
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
				int b = turn + 1;
				System.out.println("Turn : " + b);
				int dievalue = getrandom();
				System.out.println("Die : " + dievalue);
				if (dievalue == 1) {
					System.out.println("Turn over. No score.");
					System.out.println("----------------------------");
					turnscore = 0;
					turn = turn + 1;
				} else {
					turnscore = turnscore + dievalue;
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