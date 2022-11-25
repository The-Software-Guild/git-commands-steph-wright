package com.example.service;


import java.util.Collection;

import com.example.entity.Book;

public interface BookService {

    Collection<Book> getAllBooks();

    Book searchBookById(int id);

    boolean addBook(Book book);

    boolean deleteBook(int id);

    boolean incrementNoOfCopies(int id, int increment);

}
