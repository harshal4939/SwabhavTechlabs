package com.aurionpro.test;

import java.util.Scanner;

public class NumberGuesser {

	static int turns = 0;
	static int attempts[] = new int[6];
	static int randomnumber;
	static String player1name, player2name;
	static boolean flag = false;
	static int successflag = 0;
	static int player1turns,player2turns,successflag1,successflag2;

	private static int randomNumberGenerator() {
		int min = 1;
		int max = 100;
		randomnumber = (int) (Math.random() * (max - min + 1) + min);
		return randomnumber;
	}

	private static boolean checkNumber(int randomnumber, int usernumber) {
		if (randomnumber == usernumber) {
			System.out.println("Congratulations you guessed the number correctly");
			displayAttempts();
			successflag = 1;
			return true;
		}
		checkProximity(randomnumber, usernumber);
		return false;
	}

	private static void displayAttempts() {
		System.out.println("The random number generated was : " + randomnumber);
		System.out.println("You took " + turns + " turns");
		System.out.println("Here are all the numbers you guessed.");
		for (int i = 0; i < turns; i++) {
			System.out.println(attempts[i]);
		}
	}

	private static void checkProximity(int randomnumber, int usernumber) {
		System.out.println("Turn number : ");
		if (randomnumber > usernumber) {
			System.out.println("Sorry the guessed number is too low than the random number");
		} else {
			System.out.println("Sorry the guessed number is too high than the random number");
		}
		if(Math.abs(randomnumber-usernumber)<11) {
			System.out.println("But your guess is close. (In range of 10)");
		}
		System.out.println("------------------------------------------------------------------------");
	}

	private static int game() {
		Scanner sc = new Scanner(System.in);
		int maxtries = 6;
		randomnumber = randomNumberGenerator();
		//System.out.println(randomnumber);
		while (flag == false) {
			if (turns >= maxtries) {
				System.out.println("Sorry your 6 guesses have finished. Better luck next time loser.");
				displayAttempts();
				flag = true;
			} else {
				System.out.println("Enter your guess between 1-100");
				int usernumber = sc.nextInt();
				attempts[turns] = usernumber;
				turns = turns + 1;
				flag = checkNumber(randomnumber, usernumber);
			}
		}
		return turns;
	}
	private static void resetGame() {
		flag = false;
		turns = 0;
		successflag=0;
	}

	private static void determineWinner() {
		if (player1turns < player2turns) {
			System.out.println(player1name + " used " + player1turns + " turns and " + player2name + " used "
					+ player2turns + " turns");
			System.out.println("Congratulations " + player1name + " ! You won");
		}
		if (player1turns > player2turns) {
			System.out.println(player1name + " used " + player1turns + " turns and " + player2name + " used "
					+ player2turns + " turns");
			System.out.println("Congratulations " + player2name + " ! You won");
		} else if (player1turns == player2turns) {
			if (successflag1 == successflag2) {
				System.out.println(player1name + " and " + player2name + " both finished in equal turns("
						+ player1turns + "). So its a draw.");
			} else if (successflag1 > successflag2) {
				System.out.println(player1name + " used " + player1turns + " turns and " + player2name + " used "
						+ player2turns + " turns");
				System.out.println(player1name + " guesses the number correctly");
				System.out.println("Congratulations " + player1name + " ! You won");
			} else {
				System.out.println(player1name + " used " + player1turns + " turns and " + player2name + " used "
						+ player2turns + " turns");
				System.out.println(player2name + " guesses the number correctly");
				System.out.println("Congratulations " + player1name + " ! You won");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Number Guesser.");
		System.out.println("Press 1 to start the game. Press any other key to exit the game.");
		int choice = sc.nextInt();
		while (choice == 1) {
			System.out.println("Please enter your name Player 1 :");
			player1name = sc.next();
			System.out.println("Please enter your name Player 2 :");
			player2name = sc.next();
			System.out.println("Now " + player1name + " will play");
			player1turns = game();
			successflag1 = successflag;
			resetGame();
			System.out.println("=====================================================================");
			System.out.println("Now " + player2name + " will play");
			player2turns = game();
			successflag2 = successflag;
			resetGame();
			System.out.println("=====================================================================");
			determineWinner();
			System.out.println("=====================================================================");
			System.out.println("Press 1 to play again. Press any other key to exit the game.");
			choice = sc.nextInt();
		}
	}
}