package com.mj.librarymanagement.entities;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	int bookId;	
	String bookName;	
	int bookCount;	
	double bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookId, String bookName, int bookCount, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCount = bookCount;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
