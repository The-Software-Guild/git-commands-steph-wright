package com.example.service;

import java.util.Collection;

import com.example.entity.Student;

public interface StudentService {

	Collection<Student> getAllStudents();

	boolean addStudent(Student student);
	

}
