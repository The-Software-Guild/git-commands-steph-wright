package com.example.persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

import com.example.database.BookDataBase;
import com.example.entity.Book;
import org.springframework.stereotype.Component;

import javax.management.Query;

@Component("dao")
public class BookDaoImpl implements BookDao {

	@Override
	public Collection<Book> getAllBooks() {
		Collection<Book> bookList = new ArrayList<Book>();

		Connection connection = null;

		try {

			// REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			// CONNECT TO DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");

			// QUERY DB
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books;");
			ResultSet resultSet = preparedStatement.executeQuery();

			// PROCESS DATA
			while(resultSet.next()) {
				int id = resultSet.getInt("BOOKID");
				String bookName = resultSet.getString("BOOKNAME");
				String authorName = resultSet.getString("AUTHORNAME");
				int noOfCopies = resultSet.getInt("NOOFCOPIES");

				bookList.add(new Book(id, bookName, authorName, noOfCopies));
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bookList;
	}

	@Override
	public Book searchBooks(int id) {
		Connection connection = null;

		Book book = null;
		try {

			// REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			// CONNECT TO DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");

			// QUERY DB
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books WHERE BOOKID = ?;");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			// PROCESS DATA
			if (resultSet.next()) {
				int bookId = resultSet.getInt("BOOKID");
				String bookName = resultSet.getString("BOOKNAME");
				String authorName = resultSet.getString("AUTHORNAME");
				int noOfCopies = resultSet.getInt("NOOFCOPIES");

				book = new Book(bookId, bookName, authorName, noOfCopies);
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return book;
	}
		


	@Override
	public Book insertBook(Book book) {

		Connection connection = null;

		int update = 0;
		try {

			// REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			// CONNECT TO DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");

			// UPDATE DB
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO books VALUES (?,?,?,?)");
			preparedStatement.setInt(1, book.getBookId());
			preparedStatement.setString(2, book.getBookName());
			preparedStatement.setString(3, book.getAuthorName());
			preparedStatement.setInt(4, book.getBookId());

			update = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (update > 0) {
			return book;
		} else {
			return null;
		}

	}

	@Override
	public Boolean deleteBook(int id) {
		Connection connection = null;
		Book book = null;
		int update = 0;

		try {

			// REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			// CONNECT TO DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");

			// QUERY DB
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM books WHERE BOOKID = ?;");
			preparedStatement.setInt(1, id);
			update = preparedStatement.executeUpdate();


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (update > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean incrementNoOfCopies(int id, int increment) {
		Connection connection = null;
		Book book = null;
		int update = 0;

		try {

			// REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");

			// CONNECT TO DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");

			// QUERY DB
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE books SET NOOFCOPIES = (NOOFCOPIES + ?) WHERE BOOKID = ?;");
			preparedStatement.setInt(1, increment);
			preparedStatement.setInt(2, id);
			update = preparedStatement.executeUpdate();


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (update > 0) {
			return true;
		} else {
			return false;
		}
	}

}
