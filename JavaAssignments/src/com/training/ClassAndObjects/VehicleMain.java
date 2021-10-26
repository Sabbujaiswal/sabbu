package com.training.ClassAndObjects;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.name = "TATA";
		v.model = "Swift";
		v.price = 500000;
		v.getDetails();
		
		System.out.println();
		
		Vehicle v1 = new Vehicle();
		v1.name = "BMW";
		v1.model = "Nexon";
		v1.price = 450000;
		v1.getDetails();
	}

}
