package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.dao.LibDao;

@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String callno = req.getParameter("callno");
		req.setAttribute("callno", callno);
		LibDao.DeleteBook(callno);
		resp.sendRedirect("ManageBook");
		
	}

}
