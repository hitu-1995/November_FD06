package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDAO;
import com.cjc.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired
	private StudentDAO dao;
	
	@Override
	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}

	@Override
	public List<Student> getAllRecords(String uname, String pass) {
	
		return dao.getAllRecords(uname, pass);
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
		return dao.deleteStudent(rollno);
	}

	@Override
	public Student editStudent(int rollno) {
		
		return dao.editStudent(rollno);
	}

}
