package tester;

import java.util.Scanner;

import com.app.geomertry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		int x1,y1,x2,y2;
		
		System.out.println("enter x1 & y1 cordinates");
		
		Scanner sc=new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		Point2D p1=new Point2D(x1, y1);
		
        System.out.println("coordinates of P1 -> "+p1.getDetails());
        
        System.out.println("enter x2 & y2 cordinates");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
        Point2D p2=new Point2D(x2,y2);
        
        System.out.println("coordinates of P2 -> "+p2.getDetails());
        
        
        System.out.println("Equal or not - "+p1.isEqual(p2));
        
        if(p1.isEqual(p2)==true) {
        	System.out.println("Both are at same point");
        }
        else {
        System.out.println("difference - "+p1.calculateDistance(p2));
        }

	}

}
