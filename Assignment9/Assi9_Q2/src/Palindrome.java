import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string to reverse");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(s);
        sb.reverse(); 
    
        
		if(s.toString().equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}

}
