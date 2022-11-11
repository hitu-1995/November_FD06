package com.cjc.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.in.model.User;
import com.cjc.in.service.UserService;

@RestController
@RequestMapping("/userApi")
public class UserController {
 
	    @Autowired
        private UserService service;
        
       @GetMapping("/checkUser") // localhost:8081/userApi/checkUser
	   public String checkUser() {
		return "User Application Working Fine.....";
	   }
       
       @PostMapping("/insertUser")
       public String insertUser(@RequestBody User user) {
    	    service.saveUser(user);
    	    return "User Saved Successfull  "+user;
	  }
        @GetMapping("/getSingleData/{id}")
       public Object getSingleData(@PathVariable int id) {
    	  
        Object o =  service.getUser(id);
        
        return o;
     	}
       
}
