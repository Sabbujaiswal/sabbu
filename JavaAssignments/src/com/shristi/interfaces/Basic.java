package com.shristi.interfaces;

public class Basic implements BasicCalculator {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Sum is : "+(x+y));

	}

	@Override
	public void difference(int x, int y) {
		if(x>y) {
		
		// TODO Auto-generated method stub
		System.out.println("Difference is :"+(x-y));
		}else {
			System.out.println("Diffrrence is :"+(y-x));
		}

	}
	

	@Override
	public void product(int x, int y) {
		System.out.println("Product is :"+(x*y));
		
		// TODO Auto-generated method stub

	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Divided  is :"+x/y);
		
		

	}

}
