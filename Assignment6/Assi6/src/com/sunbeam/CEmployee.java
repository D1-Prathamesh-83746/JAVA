package com.sunbeam;

import java.util.Scanner;

public class CEmployee extends Employee {
	private int grossSales;
	private Double commisionRates;
	
	public CEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("enter gross Sales - ");
		grossSales=sc.nextInt();
		System.out.println("enter commision rates - ");
		commisionRates=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	public Double getCommisionRates() {
		return commisionRates;
	}
	
	public int getGrossSales() {
		return grossSales;
	}
	
	@Override
	public void calculateweeklyPay() {
		System.out.println("Commision - "+(commisionRates*grossSales)/100);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
