package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.dao.LibDao;

@WebServlet("/ReturnBook")
public class ReturnBook extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String callno = req.getParameter("callno");
		String sstudent_id = req.getParameter("student_id");
		int student_id = Integer.parseInt(sstudent_id);
		int returnstat = LibDao.ReturnBook(callno, student_id);
		
		if (returnstat != 0) {
			out.println("<h4>Book returned successfully!</h4>");
			req.getRequestDispatcher("librarianhome.jsp").include(req, resp);
		}else{
			out.println("<h4>Sorry, unable to return book.</h4>");
			req.getRequestDispatcher("librarianhome.jsp").include(req, resp);
		}			
	}

}
