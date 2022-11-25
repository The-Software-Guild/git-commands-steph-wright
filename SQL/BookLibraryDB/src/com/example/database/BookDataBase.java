package com.example.database;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.entity.Book;

public class BookDataBase {

	static private Map<Integer, Book> bookList=new LinkedHashMap<Integer, Book>();
	
	
	static {
		bookList.put(1, new Book(1, "Chaos", "James Gleik", 3));
		bookList.put(2, new Book(2, "Piranesi", "Susanna Clarke", 50));
		
	}

	public static Map<Integer, Book> getBookList() {
		return bookList;
	}
	
	
}
