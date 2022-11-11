package com.cjc.in.service;

import java.util.List;

import com.cjc.in.model.Student;

public interface StudentService {

	public void saveStudent(Student student);
	
	public List<Student> getAllRecords(String uname , String pass);

	public List<Student> deleteStudent(int rollno);

	public Student editStudent(int rollno);
	
	
}
