package com.example.service;

import java.util.Collection;

import com.example.entity.Student;
import com.example.persistence.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("service")
public class StudentServiceImpl implements StudentService {


	private StudentDao studentDao;
	

	public StudentServiceImpl(@Autowired StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}


	@Override
	public boolean addStudent(Student student) {
		Student newStudent = studentDao.searchStudents(student.getRollNo());
		if(newStudent !=null) {
			return false;
		}
		studentDao.insertStudent(student);
		return true;
	}



}
