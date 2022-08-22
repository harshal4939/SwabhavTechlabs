package com.aurionpro.model;

public abstract class Employee {
	final int employeenumber;
	final String employeename;
	double basicsalary;
	public double getBasicsalary() {
		return basicsalary;
	}
	public int getEmployeenumber() {
		return employeenumber;
	}
	public String getEmployeename() {
		return employeename;
	}
	public Employee(int employeenumber, String employeename, double basicsalary) {
		this.employeenumber = employeenumber;
		this.employeename = employeename;
		this.basicsalary = basicsalary;
	}
	public abstract double calculateCtc();
	
	public abstract double getHrallowance();

	public abstract double getDailyallowance();

	public abstract double getTransportallowance();

	public abstract double getPersonalallowance();

	public abstract double getOtherallowance();

	public abstract double getPerks();
	
	@Override
	public String toString() {
		return "Employee [employeenumber=" + employeenumber + ", employeename=" + employeename + ", basicsalary="
				+ basicsalary + "]";
	}
	
}
