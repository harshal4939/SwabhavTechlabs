package com.aurionpro.model;

import java.util.*;

public class QueueTest {
	static Deque<String> dq = new ArrayDeque<String>();

	public static void main(String[] args) {
		dq.add("B");
		dq.addFirst("A");
		dq.addLast("C");
		System.out.println(dq);

		push("X");
		push("Y");
		pop();
		//top();
		System.out.println(dq);

		size();

		pop();
		pop();
		pop();
		pop();

		isEmpty();
		System.out.println(dq);
	}

	private static void size() {
		// TODO Auto-generated method stub

		System.out.println("The size of the stack is :" + dq.size());
	}

	private static void isEmpty() {
		// TODO Auto-generated method stub
		if (dq.size() == 0) {
			System.out.println("The stack is empty.");
		}
	}

	/*private static void top() {
		// TODO Auto-generated method stub
		System.out.println(dq.element());
	}
*/
	private static void pop() {
		// TODO Auto-generated method stub
		dq.removeFirst();
	}

	private static void push(String string) {
		// TODO Auto-generated method stub
		dq.addLast(string);
	}
}
