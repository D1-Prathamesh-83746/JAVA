package com.Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string to reverse");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		System.out.println("reverse is - "+(sb.reverse()));	
	}

}
