package com.example.service;

import java.util.Collection;

import com.example.entity.Student;
import com.example.persistence.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class StudentServiceImpl implements StudentService {

	//Service will request persistence layer for all data needs
//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	private StudentDao studentDao;
	

	public StudentServiceImpl(StudentDao studentDao) {
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
