package com.example.persistence;

import com.example.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        int id = resultSet.getInt("BOOKID");
        String name = resultSet.getString("BOOKNAME");
        String authorName = resultSet.getString("AUTHORNAME");
        int noOfCopies = resultSet.getInt("NOOFCOPIES");

        Book book = new Book(id, name, authorName, noOfCopies);
        return book;
    }
}
