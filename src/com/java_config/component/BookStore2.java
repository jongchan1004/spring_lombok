package com.java_config.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookStore2 {
	private Book book;
	
	@Autowired
	public void setBook(Book book) { //dependency injection
		this.book = book;
	}
	
	public Book getBook() {
		return book;
	}

}
