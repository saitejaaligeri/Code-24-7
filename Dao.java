package com.niit.shoppingcart;

public class Dao {

	public boolean isValidUser(String id,String password)
	{
		if(id.equals("niit") && password.equals("niit"))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
