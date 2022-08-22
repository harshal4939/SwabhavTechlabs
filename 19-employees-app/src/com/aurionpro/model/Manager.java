package com.aurionpro.model;

public class Manager extends Employee{
	double hrallowance;
	double dailyallowance;
	double transportallowance;
	
	public Manager(int employeenumber, String employeename, double basicsalary) {
		super(employeenumber, employeename, basicsalary);
		this.hrallowance = basicsalary*0.3;
		this.dailyallowance = basicsalary*0.2;
		this.transportallowance = basicsalary*0.1;
	}

	public double getHrallowance() {
		return hrallowance;
	}

	public double getDailyallowance() {
		return dailyallowance;
	}

	public double getTransportallowance() {
		return transportallowance;
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
	public double getPerks() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculateCtc() {
		double ctc = (basicsalary + hrallowance + dailyallowance + transportallowance)*12;
		return ctc;
	}
}
