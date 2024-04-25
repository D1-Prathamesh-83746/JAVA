package com.app.geometry;
import java.lang.Math;
public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
	
	public boolean isEqual(Point2D temp) {
		if(this.x==temp.x && this.y==temp.y) {
			return true;
		}
		return false;
	}
	public double calculateDistance(Point2D temp) {
		double temp1=Math.pow((this.x-temp.x),2);
		double temp2=Math.pow((this.y-temp.y),2);
		double temp3=temp1+temp2;
		double d=Math.sqrt(temp3);
		return d;
	}
}
