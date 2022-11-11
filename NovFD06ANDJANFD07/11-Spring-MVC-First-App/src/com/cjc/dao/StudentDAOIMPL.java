package com.cjc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public class StudentDAOIMPL implements StudentDAO {

	  @Autowired
	 private SessionFactory sf;
	  
	@Override
	public void saveStudent(Student student) {
		
	    Session session = sf.openSession();
	    
	    session.saveOrUpdate(student);
	    
	    session.beginTransaction().commit();
        session.close();
	    System.out.println("*** Student Inserted ***");
	}

	@Override
	public List<Student> getAllRecords(String uname, String pass) {
	
		 List<Student> stuList = null;
		  Session session = sf.openSession();
		  
		if(uname.equals("admin") && pass.equals("admin@123")) {
		       Query query = session.createQuery("from Student");
		        stuList = query.getResultList();
		        return stuList;
		}
		    session.close();
		return stuList;
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
	
		  Session session = sf.openSession();
		  
		  Transaction tx = session.beginTransaction();
		  
		   Student student = session.get(Student.class, rollno);
		   session.delete(student);
		   
		   Query query = session.createQuery("from Student");
		   List<Student> list = query.getResultList();

		     tx.commit();
		     session.close();
		     
		   return list;
	}

	@Override
	public Student editStudent(int rollno) {
		
       Session session = sf.openSession();
       
       Student student = session.get(Student.class, rollno);
       
		return student;
	}

}










