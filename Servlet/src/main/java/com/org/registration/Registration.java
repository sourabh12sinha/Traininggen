package com.org.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("connection ready");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_registration","root","root");
			 System.out.println(con);
		        
			 PreparedStatement ps = con.prepareStatement("insert into Registration(name,pass,email,country) values(?,?,?,?)");
			 ps.setString(1, name);
			 ps.setString(2, pass);
			 ps.setString(3, email);
			 ps.setString(4, country);
			 
			 int i = ps.executeUpdate();
			 pw.print("Successfullly registered");
			 
			 System.out.println("Registered");
		       
		    } catch (Exception e) {
		    	 pw.print(e);
		       
		    }
		 pw.close();
	}

}
