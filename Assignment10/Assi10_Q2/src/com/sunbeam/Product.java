package com.sunbeam;


public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private String category;
	private double price;
	
	public Product() {
	}

	public Product(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
    @Override
    public String toString() {
    	return "Products {  "+id+"  ,  "+name+"  ,  "+category+"  ,  "+price;
    }
	
	@Override
	public int compareTo(Product o) {
		return this.category.compareTo(o.category);
	}


//	@Override
//	public int compare(this,Product other) {
//		return this.category.compareTo(other.category);
//	}
	
}
