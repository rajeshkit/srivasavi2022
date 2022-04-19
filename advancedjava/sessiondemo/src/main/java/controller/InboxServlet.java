package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InboxServlet
 */
public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html>"
				+ "<head><title>Demo</title></head>"
				+ "<body>"
				+ "<h1>Inbox Servlet</h1>"
				+ "<p></p>"
				+ "Welcome:"+request.getParameter("uname")+ "<br>"
				+ "Email is:"+request.getParameter("email")+ "<br>"
				+ "<a href='inbox'>Inbox Page</a><br>"
				+ "<a href='send'>Sent Email Page</a>"
				+ "</body>"
				+ "</html>");
		
	
	}

	

}
