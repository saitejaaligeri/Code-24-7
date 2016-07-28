package com.niit.shoppingcart;

import java.util.List;
import java.util.function.Supplier;

public class SuppliersProduct {
	
	private String id;
	private String name;
	private String Price;	
	private List<Supplier> suppliers;
	
	
	
	
	public SuppliersProduct(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
		this.suppliers = suppliers;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	


}
