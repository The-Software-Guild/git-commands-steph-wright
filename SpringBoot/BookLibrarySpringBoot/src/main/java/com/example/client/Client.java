package com.example.client;

import com.example.presentation.BookPresentation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.example")
public class Client {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(Client.class, args);

		Scanner scanner=new Scanner(System.in);

		BookPresentation presentation =(BookPresentation)springContainer.getBean("bookPresentationImpl");

		while(true) {
			presentation.showMenu();
			int choice = presentation.getChoice();
			presentation.performMenu(choice);
		}


	}

}
