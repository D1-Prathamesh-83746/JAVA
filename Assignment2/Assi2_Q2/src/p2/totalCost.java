package p2;

import java.util.Scanner;

public class totalCost {
	public double TMiles;
	public double CPG;
	public double AMG;
	public double parking;
	public double toll;
	public double totalCost;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total miles driven - ");
		TMiles=sc.nextDouble();
		
		System.out.println("enter cost per gallon - ");
		CPG=sc.nextDouble();

		System.out.println("enter average miles - ");
		AMG=sc.nextDouble();
		
		System.out.println("enter parking charges - ");
		parking=sc.nextDouble();
		
		System.out.println("enter toll per day - ");
		toll=sc.nextDouble();
	}
	public void display() {
		totalCost=((CPG/AMG)*TMiles)+parking+toll;
		System.out.println("total cost = "+totalCost);
	}
}
