package com.tester;

import java.sql.*;
import java.util.Scanner;

import com.Studentdao.Studentdao;
import com.entity.Student;

public class Program1{

	public static void main(String[] args) {
		try (Studentdao sd=new Studentdao()) {
			try (Scanner sc = new Scanner(System.in)) {

				Student s = new Student();

				System.out.println("enter name - ");
				s.setName(sc.next());

				System.out.println("enter marks - ");
				s.setMarks(sc.nextDouble());

				System.out.println("enter mobile no - ");
				s.setMobile(sc.next());

				sd.insertStudent(s);
				System.out.println("succefully added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
	}
}
