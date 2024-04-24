package com.p1;

public class Test{
   public static void main(String[] args) {
	   
	   Invoice t=new Invoice();
	   t.setPNo("P1");
	   t.setPDesc("part 1");
	   t.setQuantity(3);
	   t.setPrice(100.5);
	   
	   t.display();
   }
}
