package com.niit.shoppingcart;

public class TestProduct {
	
	public static void main(String[] args) {
		
			Product p1 = new Product(101, "Iphone", 1000000);
			Product p2 = new Product(102, "Laptop", 23564211);
			Product p3 = new Product(103, "bike",   32165165);
			
			
			System.out.println(p1.getId());
			System.out.println(p1.getName());
			System.out.println(p1.getPrice());
			
			System.out.println(p2.getId());
			System.out.println(p2.getName());
			System.out.println(p2.getPrice());
			
			System.out.println(p3.getId());
			System.out.println(p3.getName());
			System.out.println(p3.getPrice());
			
		
	}

}
