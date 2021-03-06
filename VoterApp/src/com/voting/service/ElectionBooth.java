package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = {"Pune","Varanasi","Allahabad"};
	  
	  public Boolean checkAge(int age) throws UnderAgeException{
		  if (age >= 18)  {
			  return true;
		  }
		  else {
			  throw new UnderAgeException("You are not Eligible");
		  }
	  }
	  public Boolean checkLocality(String locality) throws LocalityNotFoundException {
		  for (String area : localities)  {
			  if (locality.equals(area))  {
				  return true;
			  }
			  else {
				  throw new LocalityNotFoundException("Locality Not Found");
			  }
		  }
		return false;
	  }
	  public Boolean checkVoterId(int voterId) throws NoVoterIDException {
		  if (voterId >= 1000 && voterId <=9000)  {
			  return true;
		  }
		  else {
			  throw new NoVoterIDException("Your voter Id is invalid");
		  }  
	  }
    public Boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException, UnderAgeException, NoVoterIDException, LocalityNotFoundException {
  	 if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId)) {
  		 System.out.println("You are Eligible to Vote");
  	 }
  	 else {
  		 throw new NotEligibleException("You are not eligible to vote");
  	 }
		return true;
  			 
    }
}
