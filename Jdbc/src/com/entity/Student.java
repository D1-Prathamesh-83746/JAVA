package com.entity;

public class Student {
	private int rollno;
	private String name;
	private Double marks;
	private String mobile;
	
	
	public Student() {	
	}
	
	public Student(int rollno, String name, Double marks, String mobile) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.mobile = mobile;
	}

	public int getRollno() {
		return rollno;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", mobile=" + mobile
				+  "]";
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}

