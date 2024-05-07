import java.util.*;

public class Student implements Comparator<Student> {
	private int rollno;
	private String name;
	private Double marks;
	private String course;
	
	public Student(int rollno, String name, double marks, String course) {
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		this.course=course;
	}


	@Override
	public String toString() {
		return "{"+rollno+"  "+name+"  "+marks+"  "+course+ "}";
	} 
	

	@Override
	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}
	
	
}
