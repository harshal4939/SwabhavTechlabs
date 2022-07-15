package com.aurionpro.test;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> timetable = new LinkedList<String>();

		timetable.add("english");
		timetable.add("science");
		timetable.addLast("physical education");
		timetable.addFirst("value education");

		printTimetable(timetable);

		timetable.add("maths");
		timetable.add(2, "hindi");
		timetable.add("marathi");

		printTimetable(timetable);

		timetable.remove("marathi");
		timetable.remove(3);
		timetable.removeLast();

		printTimetable(timetable);

		System.out.println(timetable.indexOf("physical education"));
		System.out.println(timetable.peek());

		printTimetable(timetable);

		timetable.pop();

		printTimetable(timetable);

		timetable.push("english");

		printTimetable(timetable);

		timetable.removeLastOccurrence("english");

		printTimetable(timetable);

	}

	private static void printTimetable(LinkedList<String> timetable) {
		System.out.println(timetable);
		System.out.println("-----------------------------------------");
	}

}
