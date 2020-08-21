package com.anno;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Book {
	private int id;
	private String name;

}
