package com.tester;


import java.util.Scanner;

import com.Studentdao.Studentdao;
import com.entity.Student;

public class Program2 {

	public static void main(String[] args) {
		try(Studentdao sd=new Studentdao()){
			try(Scanner sc=new Scanner(System.in)){
				
				Student s=new Student();
				
				System.out.println("enter rollno - ");
				s.setRollno(sc.nextInt());
				
				System.out.println("enter Marks - ");
				s.setMarks(sc.nextDouble());
				
				sd.updateStudent(s);
				System.out.println("updated");
				
			}
		}  catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
