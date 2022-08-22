package com.aurionpro.test;

import java.util.ArrayList;
import com.aurionpro.model.*;

public class LineItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cartprice = 0;
		ArrayList<LineItem> items = new ArrayList<>();
		items.add(new LineItem(1, "maggi", 10, 12));
		items.add(new LineItem(2, "yippe", 5, 10));
		items.add(new LineItem(3, "knor", 3, 15));

		System.out.println("The elements in the cart are :");
		for (LineItem item : items) {
			System.out.println(item);
			cartprice = cartprice + item.calculateTotalPrice();
		}
		System.out.println("The total cart price is :" + cartprice);

	}

}
