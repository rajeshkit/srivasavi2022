package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		String email = request.getParameter("email");
		PrintWriter pw=response.getWriter();
		Cookie c=new Cookie("username",uname);
		Cookie c1=new Cookie("email",email);
		response.addCookie(c);
		response.addCookie(c1);
		pw.println("<html>"
				+ "<head><title>Demo</title></head>"
				+ "<body>"
				+ "<h1>Login Servlet</h1>"
				+ "<p>Login Successfull</p>"
				+ "Welcome: "+uname+"<br>"
				+ "your email id is: "+email+"<br>"
				+ "<a href='inbox'>Inbox Page</a><br>"
				+ "<a href='send'>Sent Email Page</a>"
				+ "</body>"
				+ "</html>");
		
	}

}
