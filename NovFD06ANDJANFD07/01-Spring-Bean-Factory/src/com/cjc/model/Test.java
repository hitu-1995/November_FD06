package com.cjc.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public abstract class Test {

	public static void main(String[] args) {
	  
		 Resource resource = new ClassPathResource("bean.xml");
		 
		   BeanFactory factory = new XmlBeanFactory(resource);
		   
		 Student student = factory.getBean("stu",Student.class);
		   
		 //  System.out.println(student);
		   
		   System.out.println("main---end");
		
	}
}
