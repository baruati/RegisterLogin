package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;

import com.bean.Registration;
import com.dao.RegisterDAO;
import com.connection.JDBCConnection;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		
			String empId = request.getParameter("empId");
			String empName = request.getParameter("empName");
			
			HttpSession session = request.getSession();
			PrintWriter writer = response.getWriter();
			
			if (empId.equals("704918") && empName.equals("Bhaskar")) {
				session.setAttribute("empName", empName);
				
				RegisterDAO dao = new RegisterDAO();
				String empEmail = request.getParameter("empEmail");
				Registration employee = new Registration(empId, empName, empEmail);
				dao.userLogin(employee);
				
//				request.setAttribute("varName", variable);
//				getServletContext().getRequestDispatcher("logout.jsp").forward(request,response);
				
				RequestDispatcher req = request.getRequestDispatcher("mainPage.jsp");
				req.forward(request, response);
				LocalDateTime l= LocalDateTime.now();
				writer.print("<h1>You log in at");
				writer.print(l);
			}
			
			else {
				String html = "<h1 style='color:red'> <center> Invalid credentials! </center> </h1>";
				writer.println(html);
				
				RequestDispatcher req = request.getRequestDispatcher("index.jsp");
				req.include(request, response);
			}
		}

}
