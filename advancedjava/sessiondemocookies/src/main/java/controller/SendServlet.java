package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		Cookie[] cookies  = request.getCookies();
		String name=null;
		String mail=null;
		for (int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("username")) {
				name=cookies[i].getValue();
			}
			if(cookies[i].getName().equals("email")) {
				mail=cookies[i].getValue();
			}
		}
		pw.println("<html>"
				+ "<head><title>Demo</title></head>"
				+ "<body>"
				+ "<h1>SentEmail Servlet</h1>"
				+ "<p></p>"
				+ "Welcome:"+name+"<br>"
				+ "Email:"+mail+"<br>"
				+ "<a href='inbox'>Inbox Page</a>"
				+ "</body>"
				+ "</html>");
	}

	

}
