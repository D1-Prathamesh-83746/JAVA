package com.p1;


public class Invoice {
	private String PNo;
	private String PDesc;
	private int Quantity;
	private double Price;
	
	public Invoice(){
		PNo="";
		PDesc="";
		Quantity=0;
		Price=0.0;
	}
	void setPNo(String PNo){
		this.PNo=PNo;
	}
	String getPNo() {
		return PNo; 
	}
	
	void setPDesc(String PDesc){
		this.PDesc=PDesc;
	}
	String getPDesc() {
		return PDesc; 
	}
	
	
	void setQuantity(int Quantity) {
		if(Quantity>0)
		this.Quantity = Quantity;
	}
	int getQuantity() {
		return Quantity;
	}
	
	public void setPrice(double Price) {
		if(Price>0)
		this.Price = Price;
	}
	public double getPrice() {
		return Price;
	}
	
	void display() {
		   System.out.println("part number - "+PNo);
		   System.out.println("part description - "+PDesc);
		   System.out.println("total bill - "+(Quantity*Price));  
	}
}
