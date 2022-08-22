package com.aurionpro.test;

import com.aurionpro.model.*;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(101,"harshal",30000);
		try {
		printDetails(sa);
		sa.deposit(1000);
		printDetails(sa);
		sa.withdraw(400000);
		printDetails(sa);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================================");
		/*CurrentAccount ca = new CurrentAccount(501,"ashish",30000);
		printDetails(ca);
		ca.deposit(1000);
		printDetails(ca);
		ca.withdraw(40000);
		printDetails(ca);*/
	}

	private static void printDetails(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getAccountnumber());
		System.out.println(account.getName());
		System.out.println(account.getAccountbalance());
		System.out.println("-------------------------------");
	}
}
