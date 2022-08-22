package com.aurionpro.model;

public class PigDice {
	static int turnscore; 
	static int turn;
	static int points;
	static String playername;
	public static int getTurnscore() {
		return turnscore;
	}
	public static int getTurn() {
		return turn;
	}
	public static int getPoints() {
		return points;
	}
	public static String getPlayername() {
		return playername;
	}
	
	static int getrandom() {
		int randomnumber = (int) (Math.random() * 6) + 1;
		return randomnumber;
	}
}
