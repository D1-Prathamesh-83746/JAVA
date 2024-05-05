package com.sunbeam;

import java.util.Scanner;

public class Payroll {
	public static int Menu() {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 0 TO EXIT");
		System.out.println("PRESS 1 FOR SALARIED EMPLOYEE");
		System.out.println("PRESS 2 FOR HOURLY EMPLOYEE");
		System.out.println("PRESS 3 FOR COMMISSION EMPLOYEE");
		System.out.println("PRESS 4 FOR BASE SALARIED COMMISSION EMPLOYEE");
		System.out.println("PRESS 5 TO DISPLAY DETAILS OF ALL  EMP");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		int size,counter=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size -");
		size=s.nextInt();
		Employee []e=new Employee[size];
		while((choice=Menu())!=0) {
			switch (choice) {
			case 1:
				e[counter]=new SEmployee();
				e[counter].accept(s);
				counter++;
				break;
			case 2:
				e[counter]=new HEmployee();
				e[counter].accept(s);
				counter++;
				break;
			case 3:
				e[counter]=new CEmployee();
				e[counter].accept(s);
				counter++;
				break;
			case 4:
				e[counter]=new BSCEmployee();
				e[counter].accept(s);
				counter++;
				break;
			case 5:
				for(int i=0;i<size;i++) {
					e[i].display();
					e[i].calculateweeklyPay();
					System.out.println("-----------------");
				}
				break;
			}
		}
		s.close();
	}

}
