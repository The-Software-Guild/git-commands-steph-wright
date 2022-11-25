package com.example.client;

import com.example.entity.Book;
import com.example.persistence.BookDao;
import com.example.persistence.BookDaoImpl;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class TestDaoImpl {

    @Autowired
    BookDao dao;



    @Test
    @Order(1)
    void CheckGetAllBooks() {
        Assertions.assertTrue(dao.getAllBooks().size() > 0);
    }


    @Test
    @Order(2)
    void bCheckSearchBooks() {
        Assertions.assertEquals(1, dao.searchBooks(1).getBookId());
    }


    @Test
    @Order(3)
    void cCheckInsertBook() {
        Assertions.assertEquals(1, dao.insertBook(new Book(5, "Normal People", "Salley Rooney", 30)));
    }


    @Test
    @Order(4)
    void dCheckInsertBookNegative() {
        Assertions.assertNotEquals(1, dao.insertBook(new Book(2, "Piranesi", "Susanna Clarke", 2)));
    }


    @Test
    @Order(5)
    void eCheckDeleteBook() {
        Assertions.assertEquals(1, dao.deleteBook(5));
    }


    @Test
    @Order(6)
    void fCheckDeleteBookNegative() {
        Assertions.assertNotEquals(1, dao.deleteBook(5));
    }

}
