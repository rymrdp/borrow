package com.borrowlib.bean;

public class BookBean {

	private String callno, book_name, book_author;
	private int book_qty, issued_qty;			
	
	public BookBean() {
		super();
	}
	
	public BookBean(String callno, String book_name, String book_author, int book_qty) {
		super();
		this.callno = callno;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_qty = book_qty;
	}
	
	public BookBean(String callno, String book_name, String book_author, int book_qty, int issued_qty) {
		super();
		this.callno = callno;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_qty = book_qty;
		this.issued_qty = issued_qty;
	}
	public String getCallno() {
		return callno;
	}
	public void setCallno(String callno) {
		this.callno = callno;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public int getBook_qty() {
		return book_qty;
	}
	public void setBook_qty(int book_qty) {
		this.book_qty = book_qty;
	}
	public int getIssued_qty() {
		return issued_qty;
	}
	public void setIssued_qty(int issued_qty) {
		this.issued_qty = issued_qty;
	}
	
	
}
