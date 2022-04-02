package com.borrowlib.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditLibrarianRedirect")
public class EditLibrarianRedirect extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int lib_id=Integer.parseInt(id);
		req.setAttribute("lib_id", lib_id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("editlibrarian.jsp");
		dispatcher.forward(req, resp);
	}
	

}
