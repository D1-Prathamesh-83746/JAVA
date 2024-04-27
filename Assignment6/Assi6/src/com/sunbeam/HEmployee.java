package com.sunbeam;

import java.util.Scanner;

public class HEmployee extends Employee {
	private double wage;
	private double hrs;
	
	public HEmployee() {
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter wage -");
		wage=sc.nextDouble();
		System.out.println("Enter hrs -");
		hrs=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		if(hrs>40) {
			double sal=((wage*40)+((wage*1.5)*(hrs-40)));
			System.out.println("Total Salary - "+sal);
		}
		else {
		System.out.println("Total Salary -"+(hrs*wage));
		}
	}
}
