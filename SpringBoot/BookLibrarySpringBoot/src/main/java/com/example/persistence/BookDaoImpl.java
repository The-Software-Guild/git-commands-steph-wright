package com.example.persistence;

import com.example.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Collection<Book> getAllBooks() {

        String query = "SELECT * FROM books;";
        List<Book> bookList = jdbcTemplate.query(query, new BookRowMapper());
        return bookList;

    }

    @Override
    public Book searchBooks(int id) {

        Book book = null;

        try {
            String query = "SELECT * FROM books WHERE BOOKID = ?;";
            book = jdbcTemplate.queryForObject(query, new BookRowMapper(), id);

        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
        return  book;


    }



    @Override
    public int insertBook(Book book) {

        try {
            String query = "INSERT INTO books VALUES(?,?,?,?);";
            int rows = jdbcTemplate.update(query, book.getBookId(), book.getBookName(),
                    book.getAuthorName(), book.getBookId());
            return rows;
        } catch (DuplicateKeyException ex) {
            return 0;
        }


    }

    @Override
    public int deleteBook(int id) {

        String query = "DELETE FROM books WHERE BOOKID =?;";
        int rows = jdbcTemplate.update(query, id);
        return rows;

    }

    @Override
    public int incrementNoOfCopies(int id, int increment) {
        String query = "UPDATE books SET COPIES=COPIES+? WHERE BOOKSID=?";
        int rows = jdbcTemplate.update(query, increment, id);
        return rows;


    }

}