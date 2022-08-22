package com.aurionpro.model;

public class CurrentAccount extends Account{
	
	private static final int overdraft=50000;
	public CurrentAccount(int accountnumber, String name, double accountbalance) {
		super(accountnumber, name, accountbalance);
		
	}
	
	@Override
	public void withdraw(double amount) {
		if(this.getAccountbalance()-amount<-overdraft)
			System.out.println("account balance is low, cant perform the withdrawal.");
			
		else {
			this.setAccountbalance(this.getAccountbalance()-amount);
		}
	}
}
