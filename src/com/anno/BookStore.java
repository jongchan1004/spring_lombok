package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class BookStore {
	@Setter(onMethod_ = @Autowired) //lombok 활용
	private Book book;
	
	
	
	/*
	public Book getBook() {
		return book;
	}
	
	@Autowired //찾아서 인젝션하라는 의미
	public void setBook(Book book) {
		this.book=book;
	}
	*/
}
