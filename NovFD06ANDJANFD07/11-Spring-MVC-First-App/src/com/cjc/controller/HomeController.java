package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@Controller
public class HomeController {

	   @Autowired
	   private StudentService service;
	   
	
	 public HomeController() {
		 System.out.println("HomeController :: Object Created");
	 }
	
	@RequestMapping("/")
	public String landingPage() {
		System.out.println("landingPage :: called......");
		return "index";
	}
	@RequestMapping("/log")
	public String loginPage() {
	   System.out.println("loginPage :: Called...");	
	 	return "login";
	}
	
	@RequestMapping("/login")
	//@ResponseBody
	public String loginCheck( @RequestParam("uname") String username ,
			                     @RequestParam("pass") String password,
			                      ModelMap map) {
		System.out.println(username+ "   "+password);
		 
		   List<Student> list = service.getAllRecords(username, password);
		    
		      if(list!=null) {
		    	  
		    	  map.addAttribute("data",list);
		    	  return "success";
		      }
		      else {
		    	  return "index";
		      }
	}
	@RequestMapping("/regPage")
	public String regPage() {
		
		return "register";
	}
	
	@RequestMapping("/reg")
	public String insertStudent(@ModelAttribute Student stu) {
		
		System.out.println(stu);
	
		   service.saveStudent(stu);
		   
		return "index";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam int rollno , ModelMap map) {
	List<Student> stuList =	service.deleteStudent(rollno);
	  map.addAttribute("data",stuList);
	  return "success";
	}
   	
	@RequestMapping("/edit")
	public String editData(@RequestParam int rollno , ModelMap map) {
		  Student stu =  service.editStudent(rollno);
		   map.addAttribute("data" ,stu);
		  return "update";
	}
}









