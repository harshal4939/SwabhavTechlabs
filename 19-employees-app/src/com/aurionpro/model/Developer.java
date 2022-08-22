package com.aurionpro.model;

public class Developer extends Employee{
	double personalallowance;
	double otherallowance;
	
	public Developer(int employeenumber, String employeename, double basicsalary) {
		super(employeenumber, employeename, basicsalary);
		this.personalallowance = basicsalary*0.3;
		this.otherallowance = basicsalary*0.2;
	}
	
	public double getPersonalallowance() {
		return personalallowance;
	}

	public double getOtherallowance() {
		return otherallowance;
	}
	
	@Override
	public double getHrallowance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDailyallowance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTransportallowance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateCtc() {
		double ctc = (basicsalary+personalallowance+otherallowance)*12;	
		return ctc;
	}

}
