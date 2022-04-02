package com.borrowlib.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.borrowlib.bean.BookBean;
import com.borrowlib.bean.IssueBean;

public class LibDao {

	// Librarian Login
	public static boolean libAuthenticate(String lib_email, String lib_pw ) {
		boolean auth=false;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from librarian where lib_email = ? and lib_pw = ?");
			ps.setString(1, lib_email);
			ps.setString(2, lib_pw);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				auth = true;
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return auth;
	}
	
	// Add a Book
	public static int AddBook(BookBean bean) {
		int addstat = 0;
		Connection conn= DBConnect.getConnection();
		try
		{
			PreparedStatement ps = conn.prepareStatement("Insert into books values (?,?,?,?,?)");
			ps.setString(1, bean.getCallno());
			ps.setString(2, bean.getBook_name());
			ps.setString(3, bean.getBook_author());
			ps.setInt(4, bean.getBook_qty());
			ps.setInt(5, 0);
			addstat = ps.executeUpdate();
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return addstat;
		
	}
	
	// Manage Book
	public static List<BookBean> view(){
		List<BookBean> list = new ArrayList<BookBean>(); 
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from books");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				BookBean bean = new BookBean();
				bean.setCallno(rs.getString("callno"));
				bean.setBook_name(rs.getString("book_name"));
				bean.setBook_author(rs.getString("book_author"));
				bean.setBook_qty(rs.getInt("book_qty"));
				bean.setIssued_qty(rs.getInt("issued_qty"));
				list.add(bean);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// Edit Book
	public static int EditBook(BookBean bean) {
		int editstat=0;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("update books set book_name =?, book_author=?,"
					+ "book_qty=?, issued_qty=? where callno=?");
			ps.setString(1, bean.getBook_name());
			ps.setString(2, bean.getBook_author());
			ps.setInt(3, bean.getBook_qty());
			ps.setInt(4,bean.getIssued_qty());
			ps.setString(5, bean.getCallno());	
			editstat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editstat;
	}
	
	// Delete Book
	public static int DeleteBook(String callno) {
		int deletestat=0;
		Connection conn = DBConnect.getConnection();
		try {			
			PreparedStatement ps = conn.prepareStatement("delete from books where callno=?");
			ps.setString(1,callno);	
			deletestat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deletestat;
	}
	
	// Get Issued Qty
	public static int getIssued(String callno){
		int issued=0;
		try{
			Connection conn = DBConnect.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from books where callno=?");
			ps.setString(1,callno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				issued=rs.getInt("issued_qty");
			}
			conn.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return issued;
	}
	
	// Issue Book
	public static int IssueBook(IssueBean bean) {
		int issuestat=0;
		Connection conn = DBConnect.getConnection();
		try {			
			PreparedStatement ps = conn.prepareStatement("insert into issued values (?,?,?,?,?,?,?)");
			ps.setString(1,bean.getCallno());	
			ps.setInt(2, bean.getStudent_id());
			ps.setString(3, bean.getStudent_name());
			ps.setLong(4, bean.getStudent_phone());
			ps.setString(5, bean.getStudent_email());
			Date currentDate=new Date(System.currentTimeMillis());
			ps.setDate(6,currentDate);
			ps.setString(7, "no");
			
			issuestat = ps.executeUpdate();
			
			if (issuestat != 0)
			{
				PreparedStatement ps1 = conn.prepareStatement("update books set issued_qty=? where callno=?");
				ps1.setInt(1, getIssued(bean.getCallno())+1);
				ps1.setString(2,bean.getCallno());
				issuestat=ps1.executeUpdate();
			}		
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return issuestat;
	}
	
	// Return a book
	public static int ReturnBook(String callno,int student_id) {
		int returnstat = 0;
		Connection conn = DBConnect.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("update issued set return_status = 'yes' where callno = ? and student_id = ?");
			ps.setString(1, callno);
			ps.setInt(2, student_id);
			returnstat = ps.executeUpdate();
			
			if (returnstat!=0) {
				PreparedStatement ps1 = conn.prepareStatement("update books set issued_qty=? where callno=?");			
				ps1.setInt(1, getIssued(callno)-1);	
				ps1.setString(2,callno);
				returnstat=ps1.executeUpdate();				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return returnstat;
		
	}
	
	// Return a book

	public static List<IssueBean> ViewIssuedBooks() {
		Connection conn = DBConnect.getConnection();
		List<IssueBean> list = new ArrayList<IssueBean>(); 
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from issued");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				IssueBean bean = new IssueBean();
				bean.setCallno(rs.getString("callno"));
				bean.setStudent_id(rs.getInt("student_id"));
				bean.setStudent_name(rs.getString("student_name"));
				bean.setStudent_phone(rs.getLong("student_phone"));
				bean.setStudent_email(rs.getString("student_email"));
				bean.setIssue_date(rs.getDate("issue_date"));
				bean.setReturn_status(rs.getString("return_status"));
				list.add(bean);
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
