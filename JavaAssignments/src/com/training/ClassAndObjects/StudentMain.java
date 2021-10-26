package com.training.ClassAndObjects;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 20, 40, 60 };

		Student s = new Student("jaiswl", "160");
		s.getDetails();
		s.getGrades(arr);
		
		int[] arr1 = new int[] { 5, 15,25 };
		
		System.out.println();

		Student s1 = new Student("sahab", "180");
		s1.getDetails();
		s1.getGrades(arr1);
		
	}

}
