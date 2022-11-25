package com.example.presentation;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Scanner;

@Component
public class BookPresentationImpl implements BookPresentation {

    @Autowired
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
        System.out.println("4. Delete Book");
        System.out.println("5. Increment No. of Copies");
        System.out.println("6. Exit");
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
                displayDeleteBook(scanner);
                break;
            case 5:
                displayIncrement(scanner);
                break;
            case 6:
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

    public void displayDeleteBook(Scanner scanner) {
        System.out.println("Enter Book ID to be deleted : ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean hasBeenDeleted = bookService.deleteBook(id);
        if (hasBeenDeleted) {
            System.out.println("Book has been successfully deleted.");
        } else {
            System.out.println("No book exists with ID " + id);
        }
    }

    public void displayIncrement(Scanner scanner) {
        System.out.println("Enter Book ID to be incremented : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter amount of copies to increment by : ");
        int copies = Integer.parseInt(scanner.nextLine());
        boolean hasBeenUpdated = bookService.incrementNoOfCopies(id, copies);
        if (hasBeenUpdated) {
            System.out.println("Number of copies successfully incremented.");
        } else {
            System.out.println("No book exists with ID " + id);
        }
    }
}
