package com.voting.main;

import java.util.Scanner;

import com.voting.exceptions.*;
import com.voting.service.ElectionBooth; 

public class Voter {

	public static void main(String[] args) {

		ElectionBooth booth  = new ElectionBooth();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			booth.checkAge(age);
		}
		catch(UnderAgeException e)  {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Enter your locality: ");
		String locality = sc.next();
		
		try  {
			booth.checkLocality(locality);
		}
		catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Enter your voter ID: ");
		int voterId = sc.nextInt();
		
		try  {
			booth.checkVoterId(voterId);
		}
		catch(NoVoterIDException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		sc.close();
	
		
	}

}
