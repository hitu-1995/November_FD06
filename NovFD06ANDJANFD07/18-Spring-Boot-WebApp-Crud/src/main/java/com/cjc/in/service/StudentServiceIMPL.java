package com.cjc.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Student;
import com.cjc.in.repository.StudentDAO;

@Service
public class StudentServiceIMPL implements StudentService{

	   @Autowired
	   private StudentDAO dao;
	   
	@Override
	public void saveStudent(Student student) {
		
		dao.save(student);
		
	}

	@Override
	public List<Student> getAllRecords(String uname, String pass) {
		
		    if(uname.equals("admin")&&pass.equals("admin")) {
		    	List<Student> list = dao.findAll();
		    	return list;
		    }
		  
		   
		return   null;
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
	 
		     dao.deleteById(rollno);
		     System.out.println("Deleted");
		return dao.findAll();
	}

	@Override
	public Student editStudent(int rollno) {
	
		 
		return dao.findById(rollno).get();
	}

	
}
