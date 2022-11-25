package com.example.service;

import java.util.Collection;

import com.example.entity.Book;
import com.example.persistence.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class BookServiceImpl implements BookService {


	private BookDao bookDao;
	

	public BookServiceImpl(@Autowired BookDao bookDao) {
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
	public boolean deleteBook(int id) { return bookDao.deleteBook(id); }

	@Override
	public boolean incrementNoOfCopies(int id, int increment) { return bookDao.incrementNoOfCopies(id, increment); }
}
