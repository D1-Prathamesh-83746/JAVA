package com.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.Studentdao.Studentdao;
import com.entity.Student;

public class Program3 {

	public static void main(String[] args) {
		try(Studentdao sd=new Studentdao()){
			try(Scanner sc=new Scanner(System.in)){
				Student s=new Student();
				
				System.out.println("Enter rollno to delete - ");
				
				sd.deleteStudent(sc.nextInt());
				System.out.println("successfuly deleted..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
