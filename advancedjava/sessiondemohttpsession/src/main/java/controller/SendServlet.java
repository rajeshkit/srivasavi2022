package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		HttpSession s=request.getSession(false);
		pw.println("<html>"
				+ "<head><title>Demo</title></head>"
				+ "<body>"
				+ "<h1>SentEmail Servlet</h1>"
				+ "<p></p>"
				+ "Welcome:"+s.getAttribute("name")+"<br>"
				+ "Email:"+s.getAttribute("mail")+"<br>"
				+ "<a href='inbox'>Inbox Page</a>"
				+ "</body>"
				+ "</html>");
	}

	

}
