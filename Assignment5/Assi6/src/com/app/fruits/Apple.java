package com.app.fruits;

public class Apple extends Fruits {
	public Apple(String name,double weight,String color) {
		super(name,weight,color);
	}
	public Apple() {

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
    	return 	"sweet n sour";
    }
}
