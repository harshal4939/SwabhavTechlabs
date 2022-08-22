package com.aurionpro.model;

public class SavingAccount extends Account {
	private static final int minimumbalance = 5000;

	public SavingAccount(int accountnumber, String name, double accountbalance) {
		super(accountnumber, name, accountbalance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.getAccountbalance() - amount < minimumbalance) {
			System.out.println("account balance is low, cant perform the withdrawal.");
		} else {
			this.setAccountbalance(this.getAccountbalance() - amount);
		}
	}
}
