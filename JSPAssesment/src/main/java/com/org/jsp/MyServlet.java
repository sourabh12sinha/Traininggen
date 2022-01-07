package com.org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	  
	    String name= request.getParameter("name");    
	    PrintWriter out = response.getWriter();
	    out.println (
	      "<html> \n" +
	        "<head> \n" +
	          "<title> My first jsp  </title> \n" +
	        "</head> \n" +
	        "<body> \n" +
	          "<font size=\"12px\" \">" +
	            "Hello"+ name  +
	          "</font> \n" +
	        "</body> \n" +
	      "</html>" 
	    );  
	  }  
	}

