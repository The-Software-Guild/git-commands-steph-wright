package com.example.persistence;


import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}