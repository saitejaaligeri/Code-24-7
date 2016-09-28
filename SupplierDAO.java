package com.niit.ShoppingCart.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ShoppingCart.Model.Supplier;

@Repository

public interface SupplierDAO {

     public boolean save(Supplier supplier);
     
     public boolean update(Supplier supplier);
     
     public void delete(int id);
     
     public Supplier get(int id);
     
     public List<Supplier> list();
     
     
     

	
	
	
}
