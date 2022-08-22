package com.aurionpro.model;

public class Accountant extends Employee{
	double perks;
	
	public Accountant(int employeenumber, String employeename, double basicsalary) {
		super(employeenumber, employeename, basicsalary);
		this.perks = basicsalary*0.5;
	}
	
	public double getPerks() {
		return perks;
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
	public double getPersonalallowance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOtherallowance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateCtc() {
		double ctc=(basicsalary+perks)*12;
		return ctc;
	}

}
