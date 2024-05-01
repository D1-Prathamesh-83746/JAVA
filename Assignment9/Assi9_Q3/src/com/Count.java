package com;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		//String s = "The class String includes methods for examining individual characters of the sequencefor comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the UnicodeStandard version specified by the Character class.";
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
	    int count=0;
        for(int i=0;i<s.length();i++) {
        	count++;
        }
        System.out.println("Count ->"+count);
	}

}
