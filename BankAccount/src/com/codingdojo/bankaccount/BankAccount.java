package com.codingdojo.bankaccount;

public class BankAccount {
	private double checkingBalance;
	private double savingBalance;
	public static int numberOfAccounts = 0;
	public static int totalAmount = 0;
	
//	CONSTRUCTOR
	public BankAccount(double checkingBalance, double savingBalance) {
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
		numberOfAccounts++;
	}

//	GETTER AND SETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	//	METHODS
	// method to deposit money into checking or saving 
	public void deposit(double money, String account) {
		// checks if checking account entered
		if (account == "checking") {
			//set a variable and insert into setter
			double checkBalance = getCheckingBalance();
			checkBalance += money;
			this.setCheckingBalance(checkBalance);
		}
		// checks if saving account is entered
		else if (account == "saving") {
			//set a variable and insert into setter
			double saveBalance = getSavingBalance();
			saveBalance += money;
			this.setSavingBalance(saveBalance);
		}
		else {
			System.out.println("Not a valid entry");
		}
	}
	
	// method to withdraw from checking or saving
	public void withdraw(double money, String account) {
		// checks if checking account entered
		if (account == "checking") {
			double checkBalance = getCheckingBalance();
			if (checkBalance >= money) {
				checkBalance -= money;
				this.setCheckingBalance(checkBalance);
			}
			else {
				System.out.println("Insufficient funds");
			}
		}
		// checks if saving account is entered
		else if (account == "saving") {
			double saveBalance = getSavingBalance();
			if (saveBalance >= money) {
				saveBalance -= money;
				this.setSavingBalance(saveBalance);
			}
			else {
				System.out.println("Insufficient funds");
			}
		}
		else {
			System.out.println("Not a valid entry");
		}
	}
	
	public double displayTotal() {
		totalAmount += (getCheckingBalance() + getSavingBalance());
		return totalAmount;
	}
	
}
