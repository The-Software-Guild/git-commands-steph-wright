package com.example.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.persistence.BookDaoImpl;
import com.example.presentation.BookPresentationImpl;
import com.example.service.BookServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.example")
public class BookConfiguration {

}
