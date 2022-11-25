package com.sujata.demo;

import java.sql.*;
import java.util.Scanner;

import static java.sql.Date.valueOf;

public class MySecondJDBCProject {

	public static void main(String args[]) {

		Connection connection=null;
		PreparedStatement preparedStatement;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			preparedStatement.setInt(1, scanner.nextInt());

			System.out.println("Enter first name : ");
			preparedStatement.setString(2, scanner.next());

			System.out.println("Enter last name : ");
			preparedStatement.setString(3, scanner.next());

			System.out.println("Enter email : ");
			preparedStatement.setString(4, scanner.next());

			System.out.println("Enter phone number : ");
			preparedStatement.setString(5, scanner.next());

			System.out.println("Enter hire date : ");
			preparedStatement.setDate(6, valueOf(scanner.next()));

			System.out.println("Enter job ID : ");
			preparedStatement.setInt(7, scanner.nextInt());

			System.out.println("Enter salary : ");
			preparedStatement.setInt(8, scanner.nextInt());

			System.out.println("Enter commission : ");
			preparedStatement.setInt(9, scanner.nextInt());

			System.out.println("Manager ID : ");
			preparedStatement.setInt(10, scanner.nextInt());

			System.out.println("Department ID : ");
			preparedStatement.setInt(11, scanner.nextInt());


			System.out.println("");
			
			//DML : executeUpdate() , which will int (count of no of rows manipulated by the query)
			int rows=preparedStatement.executeUpdate();
			
//			3. Process The result
			if(rows>0)
				System.out.println("Employee added");
			else
				System.out.println("Employee Not added");
			
		} catch (ClassNotFoundException e) {
			//displaying the complete stack for exceptions
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("Employee Not added");
		}
		finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
