package com.aurionpro.model;

public class Employee {
	public final int id;
	public final String name;
	public final double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	private void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
	private static void printD() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
}

