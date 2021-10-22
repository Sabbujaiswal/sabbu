package com.shristi.polymorphism;

public class Overload_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism manager = new Polymorphism("sabbu", "Manager");
		System.out.println(manager.calcBonus(1000, 1000));
		
		Polymorphism programmer = new Polymorphism("sacin", "Programmer");
		System.out.println(programmer.calcBonus(1000));
		
		Polymorphism director = new Polymorphism("jaiswal", "Director");
		System.out.println(director.calcBonus(1000, 1000, 1000));
		
		
		
	}

}
