package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	static int menu() {
		int choice;
		System.out.println("ENTER 0 TO EXIT");
		System.out.println("ENTER 1 TO ADD MANGO");
		System.out.println("ENTER 2 TO ADD ORANGE");
		System.out.println("ENTER 3 TO ADD APPLE");
		System.out.println("ENTER 4 TO DISPLAY NAMES");
		System.out.println("ENTER 5 TO DISPLAY PROPS OF FRESH FRUIT");
		System.out.println("ENTER 6 TO MARK FRUIT STALE");
		System.out.println("ENTER 7 TO DISPLAY TASTES OF STALE FRUIT");
		System.out.println("ENTER 8 TO MARK ALL SOUR FRUITS STALE");
		System.out.println("ENTER YOUR CHOICE");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		int n;
		System.out.println("enter size of basket");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		Fruits []basket=new Fruits[n];
		
		int counter=0;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				Scanner s=new Scanner(System.in);
				basket[counter]=new Mango();
				basket[counter].accept();
				counter++;
				break;
			case 2:
				basket[counter]=new Orange();
				basket[counter].accept();
				counter++;
				break;
			case 3:
				basket[counter]=new Apple();
				basket[counter].accept();
				counter++;
				break;
			case 4:
//				for(Fruits f:basket) {
//					f.displayName();
//				}
				for(int i=0;i<n;i++) {
					basket[i].displayName();
				}
			    break;
			case 5:
//				for(Fruits f:basket) {
//					if(f.getIsFresh()==true) {
//					f.display();
//					f.taste();
//					System.out.println("------------------");
//					}
			
				for(int i=0;i<n;i++) {
//					if(basket[i].getIsFresh()==true) {
					basket[i].display();
					basket[i].taste();
//				}
				}
				
				break;
			case 6:
				System.out.println("enter index");
				int index=sc.nextInt();
				if(index<0 && index>n) {
					System.out.println("invalid index");
				}
				else {
				basket[index].setIsFresh();
				}
				break;
			case 7:
				for(int i=0;i<n;i++) {
				if(basket[i].getIsFresh()==false) {
					basket[i].taste();
				}
				}
				break;
			case 8:
				for(Fruits f:basket) {
					f.setIsFresh();
				}
			default:
			    System.out.println("wrong entry");
				break;
			}
		}
	}

}
