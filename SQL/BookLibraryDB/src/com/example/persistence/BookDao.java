package com.example.persistence;

import java.util.Collection;

import com.example.entity.Book;


public interface BookDao {

	Collection<Book> getAllBooks();
	Book searchBooks(int id);
	Book insertBook(Book book);
	Boolean deleteBook(int id);
	Boolean incrementNoOfCopies(int id, int increment);

}
