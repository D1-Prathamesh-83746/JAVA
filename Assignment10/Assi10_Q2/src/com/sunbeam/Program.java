package com.sunbeam;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Product []arr= {
				new Product(1,"bat","Cricket", 10000),
				new Product(2,"chair","Furniture",3500),
				new Product(3,"headlight","Automobiles", 10000),
				new Product(4,"books","Stationary", 10000),
				new Product(5,"Tshirt","Clothes",500),
				new Product(6,"pizza","Food",300),
		};
		
		System.out.println("before sorting ");
		for(Product element:arr)
			System.out.println(element);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting ");
		for(Product element:arr)
			System.out.println(element);
	}

}
