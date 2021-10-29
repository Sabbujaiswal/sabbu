package com.Stream;
import java.util.Arrays;
import java.util.Objects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String[] args) {
		List<Employee>empList;
		
		
		
		  Employee emp1 = new Employee("Sahab", "Varanasi", "10");
	        Employee emp2 = new Employee("Mohan", "Pune", "20");
	        Employee emp3 = new Employee("Kali", "Allahabad", "30");
	        Employee emp4 = new Employee("Ambika", "Kansapur", "40");
	        Employee emp5 = new Employee("Sabbu", "Bhadohi", "50");
	        
	        
	     
	        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
	        System.out.println("Employee :");
	        for(Employee employee :empList) {
	        	System.out.println(employee);
	        	
	        }
	        List<Employee>filteredEmployees;
	        filteredEmployees = empList.stream().filter(employee -> Objects.equals(employee.getCity(), "Bangalore")).collect(Collectors.toList());
	        System.out.println();
	        System.out.println("Filtered Employees :");
	        System.out.println(filteredEmployees);

//Sort employee list
	        List<Employee> sortedEmployees;

	        sortedEmployees = empList.stream().sorted(new Comparator<Employee>() {
	            @Override
	            public int compare(Employee first, Employee second) {
	                return first.getCity().compareTo(second.getCity());
	}
	

}).collect(Collectors.toList());
	        System.out.println();
	        System.out.println("Sorted Employees");
	        System.out.println(sortedEmployees);

	        //Employee byId
	        try {
	            Employee foundEmployee = empList.stream()
	                    .filter(employee -> Objects.equals(employee.getEmpId(), "40"))
	                    .findFirst().orElseThrow(() -> new Exception("Not Found"));

	            System.out.println();
	            System.out.println("First found employee with the if of 40");
	            System.out.println(foundEmployee);
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	        // printing employee name start with k
	        
	        try {
	            Employee myEmp;
	            myEmp = empList.stream()
	                    .filter(employee -> employee.getName().startsWith("K"))
	                    .findFirst().orElseThrow(() -> new Exception("Not in first place"));

	            System.out.println();
	            System.out.println("Employee :");
	            System.out.println(myEmp);
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }
	}
	            
	           

	        
