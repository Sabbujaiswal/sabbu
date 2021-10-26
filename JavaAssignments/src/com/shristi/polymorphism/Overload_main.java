package com.shristi.polymorphism;

public class OverloadMain {

	public static void main(String[] args) {
		
		
		Employee programmer = new Employee("sachin", "Programmer");
		System.out.println(programmer.calcBonus(5000));
		
		Employee manager = new Employee("sabbu", "Manager");
		System.out.println(manager.calcBonus(5000, 4000));
		
		
		Employee director = new Employee("jaiswal", "Director");
		System.out.println(director.calcBonus(5000, 4000, 1000));
		
		
		
	}

}
