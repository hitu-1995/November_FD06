package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface StudentDAO {

	public void saveStudent(Student student);
	
	public List<Student> getAllRecords(String uname , String pass);

	public List<Student> deleteStudent(int rollno);
	
	public Student editStudent(int rollno);
}
