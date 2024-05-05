package com.sunbeam;

import java.util.Scanner;

public class SEmployee extends Employee {
	private double weeklySalary;
	
	public SEmployee() {
		
	}
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("enter salary");
		weeklySalary=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	@Override
	public void calculateweeklyPay() {
		System.out.println("SALARY - "+weeklySalary);	
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
