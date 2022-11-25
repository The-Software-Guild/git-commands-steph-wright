package com.example.persistence;

import java.util.Collection;

import com.example.entity.Student;

/*
 * DAO : Data Access Object : Design Pattern to design persistence layer
 */
public interface StudentDao {

	Collection<Student> getAllStudents();
	Student searchStudents(int id);
	Student insertStudent(Student student);

}
