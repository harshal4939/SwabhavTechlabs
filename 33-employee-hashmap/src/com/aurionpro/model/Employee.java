package com.aurionpro.model;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Employee(int id, String name,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
