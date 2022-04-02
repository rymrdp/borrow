package com.borrowlib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.borrowlib.bean.AdminBean;
import com.borrowlib.bean.LibBean;


public class AdminDao {

	// Authenticate Admin
	
	public static boolean AdminAuthenticate(String admin_email, String admin_pw) {
		boolean auth=false;
		Connection conn = DBConnect.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from admin where admin_email = ? and admin_pw = ?");
			ps.setString(1, admin_email);
			ps.setString(2, admin_pw);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				auth=true;
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return auth;
	}
	
	// ADD Librarian
	
	public static int AddLib(LibBean bean) {
		int addstat=0;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Insert into librarian (lib_fn, lib_ln,"
					+ " lib_num, lib_email, lib_pw) values (?,?,?,?,?)");
			ps.setString(1, bean.getLib_fn());
			ps.setString(2, bean.getLib_ln());
			ps.setLong(3, bean.getLib_num());
			ps.setString(4,bean.getLib_email());
			ps.setString(5, bean.getLib_pw());
			
			addstat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return addstat;
		
	}
	
	// Manage Librarian
	public static List<LibBean> view(){
		List<LibBean> list = new ArrayList<LibBean>(); 
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from librarian");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				LibBean bean = new LibBean();
				bean.setLib_id(rs.getInt("lib_id"));
				bean.setLib_fn(rs.getString("lib_fn"));
				bean.setLib_ln(rs.getString("lib_ln"));
				bean.setLib_num(rs.getLong("lib_num"));
				bean.setLib_email(rs.getString("lib_email"));
				bean.setLib_pw(rs.getString("lib_pw"));
				list.add(bean);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// Edit Librarian
	public static int EditLib(LibBean bean) {
		int editstat=0;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("update librarian set lib_fn =?, lib_ln=?,"
					+ "lib_num=?, lib_email=?, lib_pw=? where lib_id=?");
			ps.setString(1, bean.getLib_fn());
			ps.setString(2, bean.getLib_ln());
			ps.setLong(3, bean.getLib_num());
			ps.setString(4,bean.getLib_email());
			ps.setString(5, bean.getLib_pw());
			ps.setInt(6, bean.getLib_id());			
			editstat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editstat;
	}
	
	// Manage Admin
	public static int ManageAdmin(AdminBean bean) {
		int editstat=0;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("update admin set admin_fn =?, admin_ln=?,"
					+ "admin_pw=? where admin_email=?");
			ps.setString(1, bean.getAdmin_fn());
			ps.setString(2, bean.getAdmin_ln());
			ps.setString(3, bean.getAdmin_pw());
			ps.setString(4, bean.getAdmin_email());			
			editstat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editstat;
	}
	
	// Delete Librarian
	public static int DeleteLibrarian(int lib_id) {
		int editstat=0;
		Connection conn = DBConnect.getConnection();
		try {			
			PreparedStatement ps = conn.prepareStatement("delete from librarian where lib_id=?");
			ps.setInt(1,lib_id);	
			editstat = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editstat;
	}
	
	
	
	
}
