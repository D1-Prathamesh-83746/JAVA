package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	private String color;
	private double weight;
	private String name;
	private Boolean isFresh;
	
	public Fruits(){
	}
	
	public Fruits(String name,double weight,String color) {
		this.color=color;
		this.weight=weight;
		this.name=name;
		isFresh=true;
	}	
	public String taste(){
		return  "no specific taste";
	}
	public String toString() {
		return color+" "+name+" "+isFresh;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name ");
		name=sc.next();
		
		System.out.println("enter weight ");
		weight=sc.nextDouble();
		
		System.out.println("enter color ");
		color=sc.next();
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(weight);
		System.out.println(color);
	}
	public void displayName() {
		System.out.println(this.name);
	}
	public void setIsFresh() {
		isFresh=false;
	}
	public boolean getIsFresh() {
		return isFresh;
	}
	
}
