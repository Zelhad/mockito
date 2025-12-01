package com.zahoTec.mockito.test_doubles.fake;

import java.time.LocalDate;

public class Book {
	
	private int  bookId;
	private String title;
	private Float  price;
	private java.time.LocalDate published;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public java.time.LocalDate getPublished() {
		return published;
	}
	public void setPublished(java.time.LocalDate published) {
		this.published = published;
	}
	public Book(int bookId, String title, Float price, LocalDate published) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.published = published;
	} 
	
	

}
