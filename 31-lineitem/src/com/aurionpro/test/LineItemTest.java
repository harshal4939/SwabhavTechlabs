package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import com.aurionpro.model.*;

public class LineItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cartprice = 0;
		Set<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(1, "maggi", 10, 12));
		items.add(new LineItem(2, "yippe", 5, 10));
		items.add(new LineItem(3, "knor", 3, 15));
		items.add(new LineItem(1, "maggi", 10, 12));
		
		for (LineItem item : items) {
			System.out.println(item);
		}
			System.out.println("Total cart price :"+ calculateTotalPrice(items));
		}


	private static double calculateTotalPrice(Set<LineItem> items) {

		ArrayList<LineItem> itemsvalue = new ArrayList<LineItem>(items);

		double sum = 0;
		for (int i = 0; i < itemsvalue.size(); i++) {
			sum = sum + itemsvalue.get(i).getTotalPrice();
		}
		return (sum);
	}
}