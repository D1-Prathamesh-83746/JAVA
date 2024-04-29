package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	private int runs;
	private int wickets;
	

	@Override
	public int getRun() {
		return this.runs;
	} 
	
	@Override
	public int getWicket() {
		return this.wickets;
	}

	@Override
	public String toString() {
		return "Cricketer [toString()=" + super.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
    @Override
    public void accept(Scanner sc) {
    	super.accept(sc);
    	System.out.println("Enter number of runs scored - ");
    	this.runs=sc.nextInt();
    	System.out.println("Enter number of wickets - ");
    	this.wickets=sc.nextInt();
    }

    @Override
    public void display() {
    	
    	super.display();
    }


	
	
}
