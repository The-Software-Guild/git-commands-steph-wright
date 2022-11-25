package com.example.persistence;

import java.util.Collection;

import com.example.database.BookDataBase;
import com.example.entity.Book;

public class BookDaoImpl implements BookDao {

	
	
	@Override
	public Collection<Book> getAllBooks() {
		return BookDataBase.getBookList().values();
	}

	@Override
	public Book searchBooks(int id) {
		return BookDataBase.getBookList().get(id);
		
	}

	@Override
	public Book insertBook(Book book) {
		return BookDataBase.getBookList().put(book.getBookId(), book);
	}



}
