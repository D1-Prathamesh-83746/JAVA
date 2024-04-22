
import java.util.Scanner;

public class checkDouble{

	public static void main(String[] args) {
		double d1=0;
		double d2=0;
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("enter value d1");
	    if(sc.hasNextDouble()){
	    	d1=sc.nextDouble();
	    }
	    else {
	    	System.err.println("entered number is not double type");
	    	System.exit(1);
	    }
	    System.out.println("enter value d2");
	    if(sc.hasNextDouble()){
	    	d2=sc.nextDouble();
	    }
	    else {
	    	System.err.println("entered number is not double type");
	    	System.exit(1);
	    }
	    
	    System.out.print("average = "+((d1+d2)/2));
	    
	   
	   
	    
	    
		
	}

	private static boolean hasNextDouble(double d1) {
		// TODO Auto-generated method stub
		return false;
	}
}
