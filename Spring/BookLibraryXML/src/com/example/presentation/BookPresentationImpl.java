package com.example.presentation;

import java.util.Collection;
import java.util.Scanner;

import com.example.entity.Book;
import com.example.service.BookService;

public class BookPresentationImpl implements BookPresentation {

	//Presentation will pass the request to service for processing and gives response to client
//	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	private BookService bookService;

	public BookPresentationImpl(BookService service) {
		this.bookService = service;
	}
	
	public void setEmployeeService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public void showMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Book Library");
		System.out.println("1. List All Books");
		System.out.println("2. Search Book By ID");
		System.out.println("3. Add New Book");
		System.out.println("4. Exit");
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
			displaySearchBooks(scanner);
			break;
		case 3:
			displayAddBook(scanner);
			break;
		case 4:
			System.out.println("Thanks for using Book Library!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
			break;
		}

	}

	public void displayBookList() {
		Collection<Book> books = bookService.getAllBooks();
		for(Book emp: books) {
			System.out.println(emp);
		}
	}

	public void displaySearchBooks(Scanner scanner) {
		System.out.println("Enter Book ID : ");
		int id=scanner.nextInt();
		Book book = bookService.searchBookById(id);
		if(book !=null)
			System.out.println(book);
		else
			System.out.println("Invalid ID");
	}

	public void displayAddBook(Scanner scanner) {
		Book newBook =new Book();

		System.out.println("Enter Book ID : ");
		newBook.setBookId(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter Book Title : ");
		newBook.setBookName(scanner.nextLine());
		System.out.println("Enter Author Name : ");
		newBook.setAuthorName(scanner.nextLine());
		System.out.println("Enter No. of Copies : ");
		newBook.setNoOfCopies(Integer.parseInt(scanner.nextLine()));
		if(bookService.addBook(newBook))
			System.out.println("Book has been successfully added to library.");
		else
			System.out.println("A book with ID "+ newBook.getBookId()+" already exists!");

	}

}
