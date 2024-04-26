package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public final class TestPointArray1 {

	public static int menu() {
		int choice;
		System.out.println("ENTER 1 TO DISPLAY DETAILS OF SPECIFIC POINT");
		System.out.println("ENTER 2 TO DISPLAY DETAILS OF ALL POINTS");
		System.out.println("ENTER 3 TO CHECK INDICES FOR TWO POINTS");
		System.out.println("ENTER 4 TO EXIT");
		System.out.println("enter your choice - ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {

		System.out.println("enter no. of points");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		Point2D[] points = new Point2D[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter Point-"+i+" x and y coordinates");
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			int y=s.nextInt();
			
			points[i]=new Point2D(x,y);
		}
        
		int choice;
		while((choice=menu())!=4) {
		switch (choice) {
		case 1:
			System.out.println("Enter index to get coordinates");
			int index=sc.nextInt();
			if(index>=size && index<0) {
				System.out.println("Invalid entry,pls Retry");
			}
			else {
				System.out.println("Point-"+index+1+" -> "+points[index].getDetails());
			}
			break;
        
		case 2:
			for(Point2D element:points) {
				System.out.println(element.getDetails());
			}
			break;
			
		case 3:
			System.out.println("enter index-1");
			int i1=sc.nextInt();
			System.out.println("enter index-2");
			int i2=sc.nextInt();
			
			if(points[i1].isEqual(points[i2])) {
				System.out.println("both indexes coincides");
			}
			else {
				System.out.println(points[i1].calculateDistance(points[i2]));
			}
			break;
		default:
			System.out.println("wrong entry");
			break;
		}
		}
		
	}

}
