package com.aurionpro.test;

import java.util.*;

class PriorityQueueTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);

		System.out.println("The elements in the priority queue are : " + pq);

		System.out.println("The first element in the priority queue is : " + pq.peek());

		System.out.println("Enter the element you want to add");
		int n = sc.nextInt();
		pq.add(n);

		System.out.println("updated priority queue : " + pq);

		System.out.println("Enter the element you want to remove from the queue");
		int m = sc.nextInt();
		pq.remove(m);

		System.out.println("updated priority queue : " + pq);

		pq.remove();
		pq.poll();
		//element
		System.out.println("updated priority queue : " + pq);
	}
}
