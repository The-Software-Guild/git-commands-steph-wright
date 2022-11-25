package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.persistence.BookDaoImpl;
import com.example.presentation.BookPresentationImpl;
import com.example.service.BookServiceImpl;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.example")
public class BookConfiguration {


}
