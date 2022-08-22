package com.aurionpro.model;

public class Players {
	
	public final String name;
	public final int age;
	public String id;
	public static int number = 100;
	

	public Players(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id="p"+number++;
	}

	public Players(String name,int age) {
		this(name,age,"p"+number);
	}
	
	public Players(String name) {
		this(name,25,"p"+number);
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return "p"+number;
	}


	public String whoIsOlder(Players player2) {
		if(this.age>player2.age)
			return this.name;
		if(this.age==player2.age)
			return null;
		return player2.name;
	}
	
	@Override
	public String toString() {
		return "Players [name=" + name + ", age=" + age + ", id=" +id + "]";
	}
}