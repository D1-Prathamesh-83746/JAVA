package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle();
		Point2D p=new Point2D();
		try {
        c.setMyDiameter(-2);
        p.setX(8);
        p.setY(-7);
		}
		catch(NonNegative n){
			n.printStackTrace();
		}
	}
}
