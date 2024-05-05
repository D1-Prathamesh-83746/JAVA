package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee() {
		
	}
	
	public void accept(Scanner sc) {
		System.out.println("enter first name");
		firstName=sc.next();
		System.out.println("enter last name");
		lastName=sc.next();
		System.out.println("enter Employee id");
		SSN=sc.next();
	}
	
	public void display() {
		System.out.println("FIRSTNAME - "+firstName);
		System.out.println("LASTNAME - "+lastName);
		System.out.println("SSN - "+SSN);
	}
	@Override
	public String toString() {
		return "FIRSTNAME - "+firstName+"LASTNAME - "+lastName+"SSN - "+SSN;
	}
	abstract public void calculateweeklyPay();
}
