package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name = "bookid")
    private int bookId;
    @Column(name = "bookname")
    private String bookName;
    @Column(name = "authorname")
    private String authorName;
    @Column(name = "noofcopies")
    private int noOfCopies;
}
