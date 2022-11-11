package com.cjc.in.controll;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.cjc.in.model.Address;
import com.cjc.in.model.Student;

public class Test {

	public static void main(String[] args) throws Exception {
	  
		  
	}

	public static void xmlTostudent() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Student.class);
		  
		  Unmarshaller unmarshaller = context.createUnmarshaller();
		  Object object = unmarshaller.unmarshal(new File("student.xml"));
		  
		  System.out.println((Student)object);
	}

	public static void studentToXML() throws JAXBException {
		Student stu = new Student();
		stu.setRollno(101);
		stu.setName("ABC");
		stu.setAddress("Nigadi");
      Address ad = new Address();
      ad.setCity("Pune");
      ad.setArea("Ravet");
      stu.setAddr(ad);
      
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(stu, new File("student.xml"));
		System.out.println("File Created");
	}
}
