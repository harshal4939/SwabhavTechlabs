package com.aurionpro.test;

import java.util.Iterator;
import java.util.Scanner;

import com.aurionpro.model.*;

public class CustomLinkedListTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CustomLinkedList cll = new CustomLinkedList();
		
		int start=1;
		int n,i;
		
		while(start==1) {
			System.out.println("0) Add at Index\t 1)Add\t 2)Remove\t 3)Display\t 4) Iterator");
			int choice =sc.nextInt();
			if(choice==0) {
				System.out.println("Enter the index you want to insert at");
				i = sc.nextInt();
				System.out.println("Enter the number you want to insert");
				n=sc.nextInt();
				cll.addAt(i,n);
			}
			else if(choice==1) {
				System.out.println("Enter the number you want to insert");
				n=sc.nextInt();
				cll.add(n);
			}
			else if(choice==2) {
				System.out.println("Enter the positon that  You want to delete");
				i=sc.nextInt();
				cll.remove(i);
			}
			else if(choice==3) 
				cll.display();
			else if(choice==4) {
				Iterator<Integer> it=cll.iterator();
				it.forEachRemaining(System.out::println);
			}
			
			System.out.println("Enter 1 to continue  and 0 to exit");
			start =sc.nextInt();
		}

		
	}
}
