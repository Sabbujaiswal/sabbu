package com.shristi.inherintance;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	void withdraw(int amount) {
		balance = balance - amount;
	}

	void deposit(int amount) {
		balance = balance + amount;
	}

	double getBalance() {
		return balance;
	}
}
