package com.example.service;


import com.example.entity.Book;
import com.example.persistence.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("service")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public BookServiceImpl(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.searchBooks(id);
    }

    @Override
    public boolean addBook(Book book) {
        Book newBook= bookDao.searchBooks(book.getBookId());
        if(newBook!=null) {
            return false;
        }
        bookDao.insertBook(book);
        return true;
    }

    @Override
    public boolean deleteBook(int id) {
        if (bookDao.deleteBook(id) > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean incrementNoOfCopies(int id, int increment) {
        int rows = bookDao.incrementNoOfCopies(id, increment);
        if (rows > 0)
            return true;
        else
            return false;
    }
}
