package com.borrowlib.bean;

public class AdminBean {
	private int admin_id;
	private String admin_fn , admin_ln, admin_email, admin_pw;

	
	// Constructor
	public AdminBean(int admin_id, String admin_fn, String admin_ln, String admin_email, String admin_pw) {
		super();
		this.admin_id = admin_id;
		this.admin_fn = admin_fn;
		this.admin_ln = admin_ln;
		this.admin_email = admin_email;
		this.admin_pw = admin_pw;
	}
	
	public AdminBean(String admin_fn, String admin_ln, String admin_email, String admin_pw) {
		super();
		this.admin_fn = admin_fn;
		this.admin_ln = admin_ln;
		this.admin_email = admin_email;
		this.admin_pw = admin_pw;
	}
	
	public AdminBean() {}


	public int getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}


	public String getAdmin_fn() {
		return admin_fn;
	}


	public void setAdmin_fn(String admin_fn) {
		this.admin_fn = admin_fn;
	}


	public String getAdmin_ln() {
		return admin_ln;
	}


	public void setAdmin_ln(String admin_ln) {
		this.admin_ln = admin_ln;
	}


	public String getAdmin_email() {
		return admin_email;
	}


	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}


	public String getAdmin_pw() {
		return admin_pw;
	}


	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}
	
	//Getters & Setters
	

}
