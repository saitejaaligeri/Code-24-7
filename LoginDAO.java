package com.niit.ShoppingCart.Dao;

import java.util.List;

import com.niit.ShoppingCart.Model.Login;

public interface LoginDAO {

	
	public List<Login> list();
	
	public Login get(int id);
	
	public Login getSingleLogin(int id);
	
	public void save(Login Login);
	
	public void update(Login Login);
	
	public List getAllLogins();
	
	public void delete(int id);
}
