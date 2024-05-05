package com.sunbeam;

import java.util.Scanner;

public class BSCEmployee extends CEmployee {
	private double base_salary;
	
	 public BSCEmployee() {
	}
	 
	 @Override
	public void accept(Scanner sc) {	
		super.accept(sc);
		System.out.println("enter base salary");
		base_salary=sc.nextDouble();
	}
	 
	@Override
	public void display() {
		super.display();
		System.out.println("reward - "+(base_salary*0.1));
	}
	
	@Override
	public void calculateweeklyPay() {
		System.out.println("Total Salary - "+(base_salary*1.1));
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
