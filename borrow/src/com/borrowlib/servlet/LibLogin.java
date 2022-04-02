package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.borrowlib.dao.LibDao;

@WebServlet("/LibLogin")
public class LibLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		//Get information from html
		String lib_email = req.getParameter("lib_email");
		String lib_pw = req.getParameter("lib_pw");
		
		boolean validlib = LibDao.libAuthenticate(lib_email, lib_pw);
		if (validlib) {
			//Setup HTTP Session
			HttpSession session = req.getSession();
			
			//Set Attribute
			session.setAttribute("lib_email", lib_email);
			
			//Dispatch
			req.getRequestDispatcher("librarianhome.jsp").forward(req, resp);
	
		}
		else
			out.print("<h5>Incorrect email or password. Please try again.</h5>");
			req.getRequestDispatcher("index.html").include(req, resp);
			out.close();		
	}
	

}
