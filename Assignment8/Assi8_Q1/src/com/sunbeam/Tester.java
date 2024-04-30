package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the String -");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		if (s.length() > 80) {
			throw new ExceptionLineTooLong("the string is too long");
		}
		else {
			System.out.println(s);
		}
	}
}
