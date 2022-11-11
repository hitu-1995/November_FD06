package com.cjc.in.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.Employee;

@RestController
public class HomeController {

	   @RequestMapping("/")
	  public String checkService() {
		
		     return "Welcome this is your First Webservice";
	  }
	  
	   @RequestMapping("/getEmployeeData")
	  public Employee getEmployeeData() {
		
		   Employee emp = new Employee();
		    emp.setEid(101);
		    emp.setEname("Hitesh");
		    emp.setDesig("Trainner");
		    emp.setEaddress("Pune");
		   return emp;
	  } 
	   @RequestMapping("/insertEmployee")
	   public String insertEmployee(@RequestBody Employee employee) {
		   
		    System.out.println(employee);
		   
		    return "Employee Data Inserted";
	}
	   
	   @RequestMapping("/getAllemployee")
	   public List<Employee> getAllemployee() {
		
	       List<Employee> empList = new ArrayList<Employee>();
	       empList.add(new Employee(101, "Saurabh", "Akurdi","Java T"));
	       empList.add(new Employee(102, "Mahesh", "Nigadi","Testing T"));
	       empList.add(new Employee(101, "Shweta", "Ravet","Python T"));
	       
		   return empList;
	   }

	   @RequestMapping("/getSingleEmployee/{eid}")
	   public Employee getSingleEmployee(@PathVariable int eid) {
		
	       List<Employee> empList = new ArrayList<Employee>();
	       empList.add(new Employee(101, "Saurabh", "Akurdi","Java T"));
	       empList.add(new Employee(102, "Mahesh", "Nigadi","Testing T"));
	       empList.add(new Employee(101, "Shweta", "Ravet","Python T"));
	        
	       Employee emp = null;
	        
	         for (Employee e : empList) {
				if(e.getEid()==eid)
					emp=e;
			}
		   return emp;
	   }

	   @RequestMapping("/updateEmployeeRecord")
	   public String updateEmployeeRecord(@RequestBody Employee emp) {
		
	       List<Employee> empList = new ArrayList<Employee>();
	       empList.add(new Employee(101, "Saurabh", "Akurdi","Java T"));
	       empList.add(new Employee(102, "Mahesh", "Nigadi","Testing T"));
	       empList.add(new Employee(101, "Shweta", "Ravet","Python T"));
	       
	       System.out.println("Beafore Updation");
	         for(Employee e : empList) {
	        	 System.out.println("----------------------------");
	        	 System.out.println(e);
	        	 System.out.println("---------------------------");
	         }
	        // updating logic 
	         for(Employee e : empList) {
	        	 
	        	   if(e.getEid()==emp.getEid()) 
	        	   {
	        		   e.setEid(emp.getEid());
	        		   e.setEname(emp.getEname());
	        		   e.setEaddress(emp.getEaddress());
	        		   e.setDesig(emp.getDesig());
	        	   }
	        	     
	         }
	         System.out.println("After Updation");
	         for(Employee e : empList) {
	        	 System.out.println("----------------------------");
	        	 System.out.println(e);
	        	 System.out.println("---------------------------");
	         }
	       
		   return "Employee Is Updated";
	   }
}
