package com.aurionpro.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ticTacToe {

	static String[] gameBoard;
	static String alphabet;
	static int counter;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gameBoard = new String[9];
		alphabet = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) {
			gameBoard[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to 3x3 Tic Tac Toe.");
		printBoard();

		System.out.println("X will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int placement;
			try {
				placement = sc.nextInt();
				if (!(placement > 0 && placement <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}

			if (gameBoard[placement - 1].equals(String.valueOf(placement))) {
				gameBoard[placement - 1] = alphabet;

				if (counter%2==0) {
					alphabet = "O";
				} else {
					alphabet = "X";
				}
				counter++;
				printBoard();
				winner = checkWinner();
			} else {
				System.out.println("Slot already taken; re-enter slot number:");
			}
		}
	}	

	static void printBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " |");
		System.out.println("|---|---|---|");
	}

	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = gameBoard[0] + gameBoard[1] + gameBoard[2];
				break;
			case 1:
				line = gameBoard[3] + gameBoard[4] + gameBoard[5];
				break;
			case 2:
				line = gameBoard[6] + gameBoard[7] + gameBoard[8];
				break;
			case 3:
				line = gameBoard[0] + gameBoard[3] + gameBoard[6];
				break;
			case 4:
				line = gameBoard[1] + gameBoard[4] + gameBoard[7];
				break;
			case 5:
				line = gameBoard[2] + gameBoard[5] + gameBoard[8];
				break;
			case 6:
				line = gameBoard[0] + gameBoard[4] + gameBoard[8];
				break;
			case 7:
				line = gameBoard[2] + gameBoard[4] + gameBoard[6];
				break;
			}
		
			if (line.equals("XXX")) {
				System.out.println("Congratulations!!! X wins!!!");
				return "X";
			}
			else if (line.equals("OOO")) {
				System.out.println("Congratulations!!! O wins!!!");
				return "O";
			}
		}
		if(counter==9) {
			return "draw";
		}
		
		System.out.println(alphabet + "'s turn; enter a slot number to place " + alphabet + " in:");
		return null;
	}

	

}