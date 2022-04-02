package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.bean.AdminBean;
import com.borrowlib.dao.AdminDao;

@WebServlet("/ManageAdmin")
public class ManageAdmin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String admin_fn = req.getParameter("admin_fn");
		String admin_ln = req.getParameter("admin_ln");
		String admin_email = req.getParameter("admin_email");
		String admin_pw = req.getParameter("admin_pw");
		
		AdminBean bean = new AdminBean(admin_fn, admin_ln, admin_email, admin_pw);
		AdminDao.ManageAdmin(bean);
		out.print("<h4>Admin updated successfully.</h4>");
		req.getRequestDispatcher("adminhome.jsp").include(req, resp);
		out.close();
	}
}
