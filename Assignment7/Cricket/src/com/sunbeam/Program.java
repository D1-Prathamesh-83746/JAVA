package com.sunbeam;

import java.util.Scanner;

public class Program {
    
	public static int menu(Scanner sc) {
		System.out.println("0. TO EXIT");
		System.out.println("1. ADD PLAYERS");
		System.out.println("2. TOTAL RUNS OF ALL");
		System.out.println("3. TOTAL WICKETS OF ALL");
		System.out.println("4. TOTAL MATCHES PLAYED");
		System.out.println("5. DISPLAY NAMES AND MATCHES PLAYED");
		System.out.println("ENTER YOUR CHOICE FROM MENU");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice,index=0;
		Player p[]=new Player[3];
        Scanner sc=new Scanner(System.in);
        while((choice=menu(sc))!=0) {
        	switch (choice) {
			case 1:
				p[index]=new Cricketer();
				p[index++].accept(sc);
				break;
			case 2:
				int sumRuns=0;
				for(int i=0;i<3;i++) {
					sumRuns=sumRuns+p[i].getRun();
				}
				System.out.println("Total runs - "+sumRuns);
				break;
			case 3:
				int sumW=0;
				for(int i=0;i<3;i++) {
					sumW=sumW+p[i].getWicket();
				}
				System.out.println("Total wickets - "+sumW);
				break;
			case 4:
				int Tmatches=0;
				for(int i=0;i<3;i++) {
					Tmatches=Tmatches+p[i].getMatchesPlayed();
				}
				System.out.println("Total matches - "+Tmatches);
				break;
			case 5:
				for(int i=0;i<3;i++) {
					p[i].display();
				}
				break;
            
			default:
				break;
			}
        }
	}

}
