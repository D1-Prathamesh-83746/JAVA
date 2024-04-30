package com.sunbeam;

public class Circle {
	private double myDiameter;
	private Point2D p;
	
	public Circle() {
		myDiameter=100;
	}
	
	public void setMyDiameter(double myDiameter) throws NonNegative {
		if(myDiameter<0) {
			throw new NonNegative("Diameter cannot be negative");
		}
		else {
		this.myDiameter = myDiameter;
		}
	}
}
