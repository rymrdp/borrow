package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.bean.IssueBean;
import com.borrowlib.dao.LibDao;

@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String callno = req.getParameter("callno");
		String sstudent_id = req.getParameter("student_id");
		int student_id = Integer.parseInt(sstudent_id);
		String student_name = req.getParameter("student_name");
		String sstudent_phone = req.getParameter("student_phone");
		long student_phone = Long.parseLong(sstudent_phone);
		String student_email = req.getParameter("student_email");
		
		IssueBean bean = new IssueBean(callno, student_id, student_name, student_phone, student_email);
		int issuestat = LibDao.IssueBook(bean);
		if (issuestat != 0) {
			out.println("<h4>Book issued successfully!</h4>");
			req.getRequestDispatcher("librarianhome.jsp").include(req, resp);
		}else{
			out.println("<h4>Sorry, unable to issue book.</h4>");
			req.getRequestDispatcher("librarianhome.jsp").include(req, resp);
		}			
		
		
	}

}
