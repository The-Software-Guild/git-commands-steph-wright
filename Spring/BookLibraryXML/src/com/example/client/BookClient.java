package com.example.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import com.example.presentation.BookPresentation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		//AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(BookConfiguration.class);
		//BookPresentation presentation =(BookPresentation)springContainer.getBean("presentation");

		//ApplicationContext springContainer = new FileSystemXmlApplicationContext("/home/steph/Desktop/Aspire/BookLibraryXML/src/com/example/bookconfiguration.xml");
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("bookconfiguration.xml");
		BookPresentation presentation = (BookPresentation) springContainer.getBean("presentation");

		while(true) {
			presentation.showMenu();
			int choice = presentation.getChoice();
			presentation.performMenu(choice);
		}

	}

}
