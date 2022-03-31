package com.demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName=request.getParameter("firstname");
		String customerPassword=request.getParameter("password");
		String customerEmail=request.getParameter("email");
		String customerPhone=request.getParameter("phone");
		String customerGender=request.getParameter("gender");
		
		Customer customer=new Customer();
		customer.setName(customerName);
		customer.setGender(customerGender);
		customer.setPassword(customerPassword);
		customer.setPhone(customerPhone);
		customer.setEmail(customerEmail);
		
		CustomerService cs=new CustomerService();
		
		int status = cs.customerRegistration(customer);
		if(status!=0) {
			System.out.println("Registration Success");
		}else {
			System.out.println("Registraion failed");
		}
	}

	
	

}
