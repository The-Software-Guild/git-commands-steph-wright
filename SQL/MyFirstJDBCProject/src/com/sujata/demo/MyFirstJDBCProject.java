package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJDBCProject {

	public static void main(String args[]) {

		Connection connection=null;
		PreparedStatement preparedStatement;
		
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "password");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM employees");
			
			//DQL : executeQuery() , which will result ResultSet
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3. Process The result
			while(resultSet.next()) {
				//read int type "employeeid" column from employee table 
				int id=resultSet.getInt("EMPLOYEE_ID");
				//read varchar type "name" column from employee table
				String name=resultSet.getString("LAST_NAME");
				//read varchar type "designation" column from employee table
				String desig=resultSet.getString("JOB_ID");
				//read varchar type "department" column from employee table
				String deptt=resultSet.getString("DEPARTMENT_ID");
				//read double type "salary" column from employee table
				double sal=resultSet.getDouble("SALARY");
				
				//displaying result  
				System.out.println(id+" "+name+" "+desig+" "+deptt+" "+sal);
			}
			
		} catch (ClassNotFoundException e) {
			//displaying the complete stack for exceptions
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
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
