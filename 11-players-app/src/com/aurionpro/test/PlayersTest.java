package com.aurionpro.test;

import com.aurionpro.model.Players;

public class PlayersTest {

	static String olderplayer;

	public static void main(String[] args) {
		Players Sachin = new Players("Sachin", 40);
		Players Dhoni = new Players("Dhoni");
		Players Gambhir = new Players("Gambhir");
		Players Kohli = new Players("Kohli", 33);
		System.out.println(Sachin);
		System.out.println(Dhoni);
		System.out.println(Gambhir);
		System.out.println(Kohli);
		olderplayer = Sachin.whoIsOlder(Dhoni);
		printOlder(olderplayer);
		olderplayer = Kohli.whoIsOlder(Dhoni);
		printOlder(olderplayer);
		olderplayer = Kohli.whoIsOlder(Gambhir);
		printOlder(olderplayer);
	}

	public static void printOlder(String olderplayer) {
		if (olderplayer == null) {
			System.out.println("Both players have the same age.");
		} else {
			System.out.println("The name of the older player is : " + olderplayer);
			System.out.println("-------------------------------------------------------");
		}
	}
}
