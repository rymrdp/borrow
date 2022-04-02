package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.bean.BookBean;
import com.borrowlib.dao.LibDao;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();		
		
		String callno = req.getParameter("callno");
		String book_name = req.getParameter("book_name");
		String book_author = req.getParameter("book_author");
		String sbook_qty = req.getParameter("book_qty");
		int book_qty = Integer.parseInt(sbook_qty);

		BookBean bean = new BookBean(callno, book_name, book_author, book_qty);
		LibDao.AddBook(bean);
		out.print("<h4>Book added successfully</h4>");
		req.getRequestDispatcher("librarianhome.jsp").include(req, resp);
		out.close();		
		
	}

}
