package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService cs=new CustomerService();
		ArrayList<Customer> list=cs.getCustomers();
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>The Customer Details Are</h1>");
		pw.print("<table>");
		pw.print("<tr><th>Customer Name</th><th>Customer Email</th><th>Customer Password</th><th>Customer Phone</th></tr>");
		for(Customer c:list) {
		pw.print("<tr> <td>"+c.getName()+"</td><td> "+c.getEmail()+"</td><td> "+c.getPassword()+"</td> "+c.getPhone() );
		pw.print("</tr>");
		}
		
		pw.print("</table>");
		pw.print("<a href='https://www.revature.co.in'>Revature</a>");
		pw.print("</body>");
		pw.print("</html>");
	}

	
}
