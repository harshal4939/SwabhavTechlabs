package com.aurionpro.test;

import com.aurionpro.model.*;

public class ThreadingTest {

	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();
		hello.start();
	}
}
