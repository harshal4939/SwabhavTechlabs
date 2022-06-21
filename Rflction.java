package com.aurionpro.model;

import com.aurionpro.test.*;


public class Rflction {

	public static void main(String[] args) {

		RflctionTest reflectTest = new RflctionTest();

		try {
			String name;
			name = args[0];

			reflectTest.getClassMetaData(Class.forName(name));

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);

		;
	}

}