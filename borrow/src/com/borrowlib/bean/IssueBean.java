package com.borrowlib.bean;

import java.sql.Date;

public class IssueBean {
	
	private String callno;
	private int student_id;
	private String student_name;
	private long student_phone;
	private String student_email;
	private Date issue_date;
	private String return_status;
	
	
	public IssueBean() {
		super();
	}
	public IssueBean(String callno, int student_id, String student_name, long student_phone, String student_email) {
		super();
		this.callno = callno;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_email = student_email;
	}
	public IssueBean(String callno, int student_id, String student_name, long student_phone, String student_email,
			Date issue_date, String return_status) {
		super();
		this.callno = callno;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.issue_date = issue_date;
		this.return_status = return_status;
	}
	public String getCallno() {
		return callno;
	}
	public void setCallno(String callno) {
		this.callno = callno;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public long getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(long student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_status() {
		return return_status;
	}
	public void setReturn_status(String return_status) {
		this.return_status = return_status;
	}
	
	
	
}
