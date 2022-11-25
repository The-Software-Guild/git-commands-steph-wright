package com.example.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.persistence.BookDaoImpl;
import com.example.presentation.BookPresentationImpl;
import com.example.service.BookServiceImpl;

@Configuration
public class BookConfiguration {

	@Bean(name="dao")
	public BookDaoImpl getPersistence() {
		return new BookDaoImpl();
	}

	@Bean(name="service")
	public BookServiceImpl getService() {
		return new BookServiceImpl(getPersistence());
	}

	@Bean(name="presentation")
	public BookPresentationImpl getPresentation() {
		return new BookPresentationImpl(getService());
	}
}
