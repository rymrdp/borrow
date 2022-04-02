package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.borrowlib.dao.AdminDao;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String admin_email = req.getParameter("admin_email");
		String admin_pw = req.getParameter("admin_pw");
		
		boolean validadmin = AdminDao.AdminAuthenticate(admin_email, admin_pw);
		if (validadmin) {
			//Setup HTTP Session
			HttpSession session = req.getSession();
			
			//Set Attribute
			session.setAttribute("admin_email", admin_email);
			
			//Dispatch
			req.getRequestDispatcher("adminhome.jsp").forward(req, resp);
		}
		else {
			out.print("<h5>Incorrect email or password. Please try again.</h5>");
			req.getRequestDispatcher("index.html").forward(req, resp);
			out.close();	
			
		}
	}

}
