package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList implements Iterable<Integer> {

	Node head;

	public void add(int a) {
		Node newnode = new Node();
		newnode.data = a;

		if (head == null) {
			head = newnode;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newnode;
		}
	}

	public void addAt(int i, int a) {

		Node newnode = new Node();
		newnode.data = a;

		Node n = head;
		for (int j = 0; j < i - 1; j++) {
			n = n.next;
		}
		newnode.next = n.next;
		n.next = newnode;
	}

	public void addAtStart(int a) {
		Node newnode = new Node();
		newnode.data = a;
		newnode.next = head;
		head = newnode;
	}

	public void remove(int i) {
		if (i == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node tempnode = null;
			for (int j = 0; j < i - 1; j++) {
				n = n.next;
			}
			tempnode = n.next;
			n.next = tempnode.next;

		}
	}

	public void display() {
		System.out.println("The linked list is : ");
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			Node current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Integer next() {
				if (hasNext()) {
					Integer data = (Integer) current.data;
					current = current.next;
					return data;
				}
				return null;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Remove not implemented.");
			}

		};

	}

}
