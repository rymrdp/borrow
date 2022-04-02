package com.borrowlib.bean;

public class LibBean {
	private int lib_id;
	private String lib_fn, lib_ln, lib_email, lib_pw;
	private long lib_num;
	
	//Constructor
	public LibBean(int lib_id, String lib_fn, String lib_ln, String lib_email, String lib_pw, long lib_num) {
		super();
		this.lib_id = lib_id;
		this.lib_fn = lib_fn;
		this.lib_ln = lib_ln;
		this.lib_email = lib_email;
		this.lib_pw = lib_pw;
		this.lib_num = lib_num;
	}
	
	
	public LibBean(String lib_fn, String lib_ln, String lib_email, String lib_pw, long lib_num) {
		super();
		this.lib_fn = lib_fn;
		this.lib_ln = lib_ln;
		this.lib_email = lib_email;
		this.lib_pw = lib_pw;
		this.lib_num = lib_num;
	}
	
	public LibBean() {}
	
	//Getters & Setters
	public int getLib_id() {
		return lib_id;
	}
	public void setLib_id(int lib_id) {
		this.lib_id = lib_id;
	}
	public String getLib_fn() {
		return lib_fn;
	}
	public void setLib_fn(String lib_fn) {
		this.lib_fn = lib_fn;
	}
	public String getLib_ln() {
		return lib_ln;
	}
	public void setLib_ln(String lib_ln) {
		this.lib_ln = lib_ln;
	}
	public String getLib_email() {
		return lib_email;
	}
	public void setLib_email(String lib_email) {
		this.lib_email = lib_email;
	}
	public String getLib_pw() {
		return lib_pw;
	}
	public void setLib_pw(String lib_pw) {
		this.lib_pw = lib_pw;
	}
	public long getLib_num() {
		return lib_num;
	}
	public void setLib_num(long lib_num) {
		this.lib_num = lib_num;
	}
	
	

}
