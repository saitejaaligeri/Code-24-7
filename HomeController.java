package com.niit.ShoppingCart.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCart.Dao.LoginDAO;
import com.niit.ShoppingCart.Dao.SupplierDAO;
import com.niit.ShoppingCart.Dao.UserDetailsDAO;
import com.niit.ShoppingCart.Model.Login;
import com.niit.ShoppingCart.Model.Supplier;
import com.niit.ShoppingCart.Model.UserDetails;

@Controller
public class HomeController 
{
	@Autowired
	UserDetailsDAO ud;
	@Autowired
	LoginDAO ld;
	@Autowired
	SupplierDAO sd;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1;
	}
	
	@RequestMapping("Home")
	public ModelAndView homedis()
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1;
	}
	
	@RequestMapping("Register")
	public ModelAndView regi()
	{
		ModelAndView m1=new ModelAndView("Register");
		return m1;
	}
		

	@RequestMapping("Admin")
	public ModelAndView regi12()
	{
		ModelAndView m1=new ModelAndView("Admin");
		return m1;
	}
		
	@RequestMapping("Contact")
	public ModelAndView regi1()
	{
		ModelAndView m1=new ModelAndView("Contact");
		return m1;
	}
		
	
	
	@RequestMapping("addsupplier")
	public ModelAndView display3() {

		ModelAndView mv3 = new ModelAndView("addsupplier");
		return mv3;
	}
	
	@RequestMapping("storesupplier")
	public String addBook(HttpServletRequest request, @Valid @ModelAttribute("Supplier") Supplier supplier,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addsupplier";
		}
		sd.save(supplier);
		return "addsupplier";

	}
	
	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		ModelAndView m1=new ModelAndView("Login");
		return m1;
	}
	
	
	@RequestMapping("/LogoutSuccess")
	public ModelAndView sand()
	{
		ModelAndView m1=new ModelAndView("LogoutSuccess");
		return m1;
	}
	
	@RequestMapping("/UserHome")
	public ModelAndView san()
	{
		ModelAndView m1=new ModelAndView("UserHome");
		return m1;
	}
	
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public void logout(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws ServletException, IOException {
		HttpSession newsession = request.getSession(false);
		if (newsession != null) 
	    {
	         newsession.invalidate();

	    }
		response.sendRedirect("j_spring_security_logout");	
		}
	
	
	@ModelAttribute("UserDetails")
	public UserDetails registerUser() {
		return new UserDetails();

	}
	
	@ModelAttribute("Supplier")
	public Supplier sandy() {
		return new Supplier();

	}
	
	@RequestMapping(value = "storeUser", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("UserDetails") UserDetails registeruser,BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors");
			return "Register";
		}
		System.out.println(registeruser.getUsername());
		ud.save(registeruser);
		Login loginuser = new Login();
		loginuser.setId(registeruser.getId());
		loginuser.setUsername(registeruser.getUsername());
		loginuser.setPassword(registeruser.getPassword());
		loginuser.setStatus(registeruser.isStatus());
		ld.save(loginuser);
		return "Register";
	}
	}

	
