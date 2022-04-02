package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.bean.LibBean;
import com.borrowlib.dao.AdminDao;

@WebServlet("/ManageLibrarian")
public class ManageLibrarian extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List list = new ArrayList();
		//List<LibBean> list=AdminDao.view();	
		list = AdminDao.view();
		req.setAttribute("list", list);
		req.getRequestDispatcher("managelibrarian.jsp").forward(req, resp);
	}
	
	

}