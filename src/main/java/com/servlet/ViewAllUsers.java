package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registration;
import com.dao.RegisterDAO;

@WebServlet("/ViewAllUsers")
public class ViewAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDAO dao = new RegisterDAO();
		List<Registration> list = dao.viewAllUsers();
		
		PrintWriter out = response.getWriter();
		out.println("<table cellspacing='5' width=+'35px' border='1px'>");
		out.println("<tr>");
		out.println("<th> Employee Id </th>");
		out.println("<th> Employee Name </th>");
		out.println("<th> Employee Email </th>");
		out.println("</tr>");
		for (Registration user : list) {
			out.println("<tr>");
			out.println("<td>" + user.getEmpId() + "</td>");
			out.println("<td>" + user.getEmpName() + "</td>");
			out.println("<td>" + user.getEmpEmail() + "</td>");
//			out.println("<td> <a href = 'Delete?empId=" + user.getEmpId() + "'>" + "</td>");
//			out.println("<td> <a href = 'Update?'> </a> </td>");
//			out.println("</tr>");
		}
		out.println("</table>");
	}

}