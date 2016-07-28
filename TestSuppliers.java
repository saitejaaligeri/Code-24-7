package com.niit.shoppingcart;

import java.util.ArrayList;
import java.util.List; 

public class TestSuppliers {



	public static void main(String[] args) {
		Product p1 = new Product(101, "Windows", 50000);
		Product p2 = new Product(102, "Iphone", 49000);
		Product p3 = new Product(103, "Samsung", 45000);
		
		Suppliers s1 = new Suppliers("SUP001", "reliancedigi","bombay");
		
		List<Product> productList = new ArrayList<Product>();
		
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		s1.setProducts(productList);
		
		System.out.println("the details...");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		List<Product> products = s1.getProducts();
		
		for( Product p : products)
		{
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println("........");
			
		}
		
		
		
	}
}
