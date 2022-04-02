package com.borrowlib.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.borrowlib.dao.AdminDao;


@WebServlet("/ManageAdminRedirect")
public class ManageAdminRedirect extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String admin_email = (String)session.getAttribute("admin_email");
		req.setAttribute("admin_email", admin_email);
		RequestDispatcher dispatcher = req.getRequestDispatcher("manageadmin.jsp");
		dispatcher.forward(req, resp);
	}
}
