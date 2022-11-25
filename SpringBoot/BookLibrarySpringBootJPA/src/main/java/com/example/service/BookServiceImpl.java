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
        return bookDao.findAll();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.findById(id).orElse(null);
    }

    @Override
    public boolean addBook(Book book) {
        Book newBook= searchBookById(book.getBookId());
        if(newBook!=null) {
            return false;
        }
        bookDao.save(book);
        return true;

    }

    @Override
    public boolean deleteBook(int id) {
        Book deleteBook = searchBookById(id);
        if (deleteBook == null) {
            return false;
        } else {
            bookDao.delete(bookDao.getReferenceById(id));
            return true;
        }

    }

    @Override
    public boolean incrementNoOfCopies(int id, int increment) {
        Book updateBook = searchBookById(id);
        if (updateBook == null)
            return false;
        else {
            updateBook.setNoOfCopies(updateBook.getNoOfCopies() + increment);
            bookDao.save(updateBook);
            return true;
        }

    }
}
