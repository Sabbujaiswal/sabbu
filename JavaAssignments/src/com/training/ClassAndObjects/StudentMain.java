package com.training.ClassAndObjects;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 10, 20, 30 };

		Student s = new Student("nayeem", "170");
		s.getDetails();
		s.getGrades(arr);
		
		int[] arr1 = new int[] { 15, 25,5 };
		
		System.out.println();

		Student s1 = new Student("sahab", "180");
		s1.getDetails();
		s1.getGrades(arr1);
		
	}

}
