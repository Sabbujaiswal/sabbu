package com.training.ClassAndObjects;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Bank b = new Bank(500000);
			b.deposit(3000);
			System.out.println(b.getBalance());
			
			b.withdraw(2000);
			System.out.println(b.getBalance());
	}

}
