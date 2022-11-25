package com.example.client;

import com.example.presentation.BookPresentation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.persistence")
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
