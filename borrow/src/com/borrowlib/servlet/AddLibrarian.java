package com.borrowlib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.borrowlib.bean.LibBean;
import com.borrowlib.dao.AdminDao;
@WebServlet("/AddLibrarian")
public class AddLibrarian extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String lib_fn = req.getParameter("lib_fn");
		String lib_ln = req.getParameter("lib_ln");
		String lib_email = req.getParameter("lib_email");
		String lib_pw = req.getParameter("lib_pw");
		String lib_snum = req.getParameter("lib_num");
		long lib_num=Long.parseLong(lib_snum);
		
		LibBean bean = new LibBean(lib_fn, lib_ln, lib_email, lib_pw, lib_num);
		AdminDao.AddLib(bean);
		out.print("<h4>Librarian added successfully</h4>");
		req.getRequestDispatcher("adminhome.jsp").include(req, resp);
		out.close();
		
	}
}
