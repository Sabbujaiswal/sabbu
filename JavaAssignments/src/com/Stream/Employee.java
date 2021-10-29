package com.Stream;

public class Employee {
	String name;
	String city;
	String empId;
	public Employee(String name, String city, String empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
	

}
