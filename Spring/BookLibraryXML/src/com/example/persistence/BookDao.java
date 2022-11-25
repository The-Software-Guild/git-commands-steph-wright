package com.example.persistence;

import java.util.Collection;

import com.example.entity.Book;

/*
 * DAO : Data Access Object : Design Pattern to design persistence layer
 */
public interface BookDao {

	Collection<Book> getAllBooks();
	Book searchBooks(int id);
	Book insertBook(Book book);

}
