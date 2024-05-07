package com.tester;

import java.sql.SQLException;
import java.util.List;

import com.Studentdao.Studentdao;
import com.entity.Student;

public class Program4 {

	public static void main(String[] args) {
		try(Studentdao sd=new Studentdao()){
			List<Student> sl=sd.getallStudents();
			for(Student s:sl)
				System.out.println(s);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
