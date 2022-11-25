package com.example.persistence;

import java.util.Collection;

import com.example.database.StudentDataBase;
import com.example.entity.Student;
import org.springframework.stereotype.Component;


public class StudentDaoImpl implements StudentDao {

	
	
	@Override
	public Collection<Student> getAllStudents() {
		return StudentDataBase.getStudentList().values();
	}

	@Override
	public Student searchStudents(int rollNo) {
		return StudentDataBase.getStudentList().get(rollNo);
		
	}

	@Override
	public Student insertStudent(Student student) {
		return StudentDataBase.getStudentList().put(student.getRollNo(), student);
	}



}
