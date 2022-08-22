package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		/*case0();
		case1();
		case2();
		case3();*/
		case4();///polymorphism
		case5();

	}
	private static void case5() {

			Object obj;
			obj = 10;
			System.out.println(obj.getClass());
			obj = "harshal";
			System.out.println(obj.getClass());
			obj = 10 < 20;
			System.out.println(obj.getClass());
		}
	
	private static void case4() {
		// TODO Auto-generated method stub
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	private static void atThePark(Man man) {
		// TODO Auto-generated method stub
		man.play();
	}
	private static void case3() {
		// TODO Auto-generated method stub
		
	}
	private static void case2() {
		// TODO Auto-generated method stub
		
	}
	private static void case1() {
		// TODO Auto-generated method stub
		Boy boy = new Boy();
		boy.read();
		boy.play();
		
	}
	private static void case0() {
		Man man = new Man();
		man.read();
		man.play();
	}
	
}
