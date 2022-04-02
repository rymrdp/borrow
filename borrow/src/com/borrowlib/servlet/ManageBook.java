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

@WebServlet("/ManageBook")
public class ManageBook extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List list = new ArrayList();
		list = LibDao.view();
		req.setAttribute("list", list);
		req.getRequestDispatcher("managebook.jsp").forward(req, resp);
		
	}

}
