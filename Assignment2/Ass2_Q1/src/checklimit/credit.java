package checklimit;

import java.util.Scanner;

public class credit {
	
	public int accountNo;
	public int pBalance;
	public int totalCharge;
	public int totalCredit;
	

	public int newBalance;
	
	public int limit;
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter accNo - ");
		accountNo=sc.nextInt();
		
		System.out.print("Enter pBalance - ");
		pBalance=sc.nextInt();
		
		System.out.print("Enter totalCharge - ");
		totalCharge=sc.nextInt();
		
		System.out.print("Enter totalCredit - ");
		totalCredit=sc.nextInt();
		
		System.out.print("Enter limit - ");
		limit=sc.nextInt();
	}
	public void dispaly() {
	  newBalance=(pBalance+totalCharge-totalCredit);
	  

		if(limit<newBalance) {
			System.out.println("LIMIT IS EXCEEDED");
		}
		else {
			System.out.println("ALLOWED LIMIT");
		}	
	  
	}
}
