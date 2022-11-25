package com.example.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.presentation.BookPresentation;

public class BookClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(BookConfiguration.class);
		
		BookPresentation presentation =(BookPresentation)springContainer.getBean("presentation");

		while(true) {
			presentation.showMenu();
			int choice = presentation.getChoice();
			presentation.performMenu(choice);
		}

	}

}
