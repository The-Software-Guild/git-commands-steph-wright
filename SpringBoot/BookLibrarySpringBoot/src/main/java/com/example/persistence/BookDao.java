package com.example.persistence;


import com.example.entity.Book;

import java.util.Collection;


public interface BookDao {

    Collection<Book> getAllBooks();
    Book searchBooks(int id);
    int insertBook(Book book);
    int deleteBook(int id);
    int incrementNoOfCopies(int id, int increment);

}
