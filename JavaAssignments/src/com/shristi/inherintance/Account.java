package com.shristi.inherintance;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	double getBalance() {
		return balance;
	}
}
