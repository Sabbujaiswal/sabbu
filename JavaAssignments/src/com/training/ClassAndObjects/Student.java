package com.training.ClassAndObjects;

public class Student {

	String name;String studentId;
	Student(String name, String studentId ){
		this.name = name;
		this.studentId = studentId;
		
	}

	void getDetails() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+studentId);
	}
	void getGrades(int[] marks){
		
		int count = 0;
		for(int i=0;i<marks.length;i++) {
			count += marks[i];
		}
		System.out.println("Sum of numbers = "+ count);
		
		System.out.println("Average of numbers = " + count/(marks.length));
		
		if(count <50) {
			System.out.println("C");
		}
		else if(count >50 && count <80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		
		}
		
	}
		
		
		
	}
		
			
			
				
			
		
