package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegisterDAO;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("");
		RegisterDAO dao = new RegisterDAO();
		
//		RequestDispatcher req = request.getRequestDispatcher("logout.jsp");
//		req.forward(request, response);
		
		if (dao.userLogout(uid)) {
			RequestDispatcher req = request.getRequestDispatcher("logout.jsp");
			req.forward(request, response);
		}
		
		else {
			PrintWriter writer = response.getWriter();
			writer.println("<head>");
			writer.println("<title> logging out! </title>");
			writer.println("<body>");
//			writer.println("<font color=green>");
			writer.println("<center>");
			
			writer.println("<h2>Successfully logged out. </h2>");
//			writer.println("<h2> Please retry &#8635. </h2>");

			writer.println("</center>");
			writer.println("</font>");
			writer.println("</body>");
			writer.println("</head>");
		}
		
	}

}
