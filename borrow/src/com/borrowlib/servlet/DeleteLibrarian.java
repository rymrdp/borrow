package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.dao.AdminDao;

@WebServlet("/DeleteLibrarian")
public class DeleteLibrarian extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String id = req.getParameter("id");
		int lib_id=Integer.parseInt(id);
		req.setAttribute("lib_id", lib_id);
		AdminDao.DeleteLibrarian(lib_id);
		
	
		resp.sendRedirect("ManageLibrarian");
		
	}

}
