package com.example.presentation;

import java.util.Collection;
import java.util.Scanner;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class StudentPresentationImpl implements StudentPresentation {

	private StudentService studentService;

	public StudentPresentationImpl(StudentService service) {
		this.studentService = service;
	}
	
	public void setEmployeeService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void showMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Class Roster");
		System.out.println("1. List All Students");
		System.out.println("2. Add New Student");
		System.out.println("3. Exit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	@Override
	public int getChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice :");
		return Integer.parseInt(scanner.nextLine());
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			displayBookList();
			break;
		case 2:
			displayAddBook(scanner);
			break;
		case 3:
			System.out.println("Thanks for using Class Roster!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
			break;
		}

	}

	public void displayBookList() {
		Collection<Student> students = studentService.getAllStudents();
		for(Student emp: students) {
			System.out.println(emp);
		}
	}

	public void displayAddBook(Scanner scanner) {
		Student newStudent =new Student();

		System.out.println("Enter Roll No. : ");
		newStudent.setRollNo(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter Student's name : ");
		newStudent.setName(scanner.nextLine());
		System.out.println("Enter Grade : ");
		newStudent.setGrade(Integer.parseInt(scanner.nextLine()));
		if(studentService.addStudent(newStudent))
			System.out.println("Student has been successfully added to roster.");
		else
			System.out.println("A student with roll no. "+ newStudent.getRollNo()+" already exists!");

	}

}
