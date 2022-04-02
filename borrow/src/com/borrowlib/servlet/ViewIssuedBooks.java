package com.borrowlib.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.dao.LibDao;

@WebServlet("/ViewIssuedBooks")
public class ViewIssuedBooks extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List list = new ArrayList();
		list = LibDao.ViewIssuedBooks();
		req.setAttribute("list", list);
		req.getRequestDispatcher("viewissuedbooks.jsp").forward(req, resp);
				
	}

}
