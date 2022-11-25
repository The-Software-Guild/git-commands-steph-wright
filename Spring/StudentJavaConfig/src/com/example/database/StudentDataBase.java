package com.example.database;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.entity.Student;
/*
 * mimicing the database: which later on we will going to change once we will do JDBC and MySql
 */
public class StudentDataBase {

	static private Map<Integer, Student> studentList=new LinkedHashMap<Integer, Student>();
	
	
	static {
		studentList.put(1, new Student(1, "James Gleik", 3));
		studentList.put(2, new Student(2, "Susanna Clarke", 50));
		
	}

	public static Map<Integer, Student> getStudentList() {
		return studentList;
	}
	
	
}
