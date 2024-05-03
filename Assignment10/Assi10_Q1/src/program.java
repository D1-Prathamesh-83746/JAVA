import java.util.Arrays;

public class program {

	public static void main(String[] args) {
		Student s[]= {
				new Student(18,"virat",87),
				new Student(45,"Rohit",89),
				new Student(7,"dhoni",95),
				new Student(1,"lokesh",75),
				new Student(3,"Abhishek",69),
		};
		
		System.out.println("Before sorting");
        for(Student element:s)
        	System.out.println(element);
        
        Arrays.sort(s);
        
    	System.out.println("After sorting");
        for(Student element:s)
        	System.out.println(element);
	}

}
