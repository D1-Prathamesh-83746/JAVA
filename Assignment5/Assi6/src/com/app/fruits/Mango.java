package com.app.fruits;

public class Mango extends Fruits {
	public Mango(String name,double weight,String color) {
		super(name,weight,color);
	}
	public Mango() {
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	@Override
	public void displayName() {
		super.displayName();
	}
	
	public String taste() {
		return "sweet";
	}
}
