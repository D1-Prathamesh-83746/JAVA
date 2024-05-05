package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static int menu(Scanner sc) {
		System.out.println("0. TO EXIT");
		System.out.println("1. ADD PLAYERS");
		System.out.println("2. TOTAL RUNS,WICKETS,MATCHESPLAYED OF ALL");
		System.out.println("3. NAME AND MATCHES PLAYED ALL");
		System.out.println("ENTER YOUR CHOICE FROM MENU");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice,index=0;
		Player p[] = new Player[11];
		Scanner sc = new Scanner(System.in);
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
                if(index<11) {
				for (index = 0; index < 11; index++) {
					p[index] = new Cricketer();
					p[index++].accept(sc);
					System.out.println("");
				}
                }
                else
                	System.out.println("array is full");

				break;
			case 2:
				int sumRuns = 0;
				int sumW = 0;
				int Tmatches = 0;
				for (int i = 0; i < 11; i++) {
					if (p[i] != null && p[i] instanceof Cricketer) {
						Cricketer c = (Cricketer) p[i];
						sumRuns = sumRuns + c.getRun();
						sumW = sumW + c.getWicket();
						Tmatches = Tmatches + p[i].getMatchesPlayed();
					}
				}
				System.out.println("Total runs - " + sumRuns);
				System.out.println("Total wickets - " + sumW);
				System.out.println("Total matches played - " + Tmatches);
				break;
			case 3:
				for (int i = 0; i < 11; i++) {
					if(p[i]!=null) {
					p[i].display();
					}
				}
				break;
          
			default:
				System.out.println("wrong choice");
				break;
			}
		}
		sc.close();
	}

}
