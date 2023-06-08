package com.codingdojo.bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		//create a new bank account
		BankAccount acct1 = new BankAccount(150, 1000);
		
		// depost money method test
		acct1.deposit(1, "checking");
		acct1.deposit(1, "saving");
		
		// Insufficient funds test
		acct1.withdraw(9999999, "checking");
		acct1.withdraw(9999999, "saving");
		
		//display total of all accounts method test
		System.out.println("Total: " + acct1.displayTotal());
	}

}
