package com.aurionpro.model;

public abstract class Account {
	int accountnumber;
	String name;
	double accountbalance;
	public int getAccountnumber() {
		return accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public Account(int accountnumber, String name, double accountbalance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.accountbalance = accountbalance;
	}
	
	public void deposit(double amount) {
		accountbalance=accountbalance+amount;
	}
	
	public abstract void withdraw(double amount);
}