package com.example.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.presentation.StudentPresentation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		ApplicationContext springContainer=new ClassPathXmlApplicationContext("studentconfiguration.xml");
		
		StudentPresentation presentation =(StudentPresentation)springContainer.getBean("presentation");

		while(true) {
			presentation.showMenu();
			int choice = presentation.getChoice();
			presentation.performMenu(choice);
		}

	}

}
