package com.Studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;
import com.util.DbUtil;

public class Studentdao implements AutoCloseable {
	private Connection con;
	
	public Studentdao() throws SQLException {
		con=DbUtil.getconnection();
	}
	
	
	
	public void insertStudent(Student s) throws SQLException {
		String sql="INSERT INTO student (name,marks,mobile) VALUES(?,?,?)";
		try(PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1,s.getName());
			ps.setDouble(2, s.getMarks());
			ps.setString(3, s.getMobile());
			ps.executeUpdate();
		}
	}
	
	
	
	
	public void updateStudent(Student s) throws SQLException {
		String sql="UPDATE student SET marks=? where rollno=? ";
		try(PreparedStatement ps=con.prepareStatement(sql)){
			ps.setDouble(1,s.getMarks());
			ps.setInt(2, s.getRollno());
			ps.executeUpdate();
		}
	}
	
	
	
	public void deleteStudent(int rollno) throws SQLException {
		String sql="DELETE FROM student WHERE rollno=?";
		try(PreparedStatement ps=con.prepareStatement(sql)){
			ps.setInt(1, rollno);
			ps.executeUpdate();
		}
	}
	
	public List<Student> getallStudents() throws SQLException {
		String sql="SELECT *FROM student";
		try(PreparedStatement ps=con.prepareStatement(sql)){
			ResultSet rs=ps.executeQuery();
			List<Student> Studentlist=new ArrayList<Student>();
			Student s;
			while(rs.next()) {
				s=new Student();
				
				s.setRollno(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getDouble(3));
				s.setMobile(rs.getString(4));
				
				Studentlist.add(s);
			}
			return Studentlist;
		}
	}

	@Override
	public void close() throws SQLException {
		if(con!=null){
			con.close();
		}
		
	}
}
