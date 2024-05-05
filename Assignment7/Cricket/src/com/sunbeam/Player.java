package com.sunbeam;

import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (matchesPlayed != other.matchesPlayed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
	public void accept(Scanner sc) {
		System.out.println("enter id - ");
		id=sc.nextInt();
		
		System.out.println("enter name - ");
		name=sc.next();
		
		System.out.println("enter age - ");
		age=sc.nextInt();
		
		System.out.println("enter Matches played - ");
		matchesPlayed=sc.nextInt();
		
	}

	public String getName() {
		return name;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	
	public void display() {
		System.out.println("NAME - "+name);
		System.out.println("NO. OF MATCHES PLAYED - "+matchesPlayed);
	}
	
}
