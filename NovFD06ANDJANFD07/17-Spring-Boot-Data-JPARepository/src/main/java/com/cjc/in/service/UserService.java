package com.cjc.in.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cjc.in.model.User;
import com.cjc.in.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	  public void check() {
		  // insertUser();
		//  getUserById();
		// getUserByUnameAndPass();
		//   getUserByNameOrAddress();
		 // getDistincUserByAddress();
		 // getAllNameEndingWith();
		 //   pagingSorting1();
		 //   pagingAndSorting2();
	  }

	public void pagingAndSorting2() {
		List<User> list = repository.findAll(PageRequest.of(0, 4)
				    .withSort(Sort.by("name").ascending())).getContent();
		
		for(User user : list) {
			   System.out.println("-------------------");
			   System.out.println(user);
			   System.out.println("----------------");
		   }
	}

	public void pagingSorting1() {
		List<User> list = repository.findAll(PageRequest.of(0, 4)).getContent();

		   for(User user : list) {
			   System.out.println("-------------------");
			   System.out.println(user);
			   System.out.println("----------------");
		   }
	}

	public void getAllNameEndingWith() {
		List<User> list = repository.findByNameEndingWith("h");
		  
		   for(User user : list) {
			   
			   System.out.println("-------------------");
			   System.out.println(user);
			   System.out.println("----------------");
		   }
	}

	public void getDistincUserByAddress() {
		List<User> list = repository.findDistinctByAddress("Akurdi");
		  
		    for(User user  : list) {
		    	System.out.println("------------------");
		    	System.out.println(user);
		    	System.out.println("------------------");
		    }
	}

	public void getUserByNameOrAddress() {
		User user = repository.findByNameOrAddress("", "mumbai");
		System.out.println(user);
	}

	public void getUserByUnameAndPass() {
		User user =    repository.findByUnameAndPass("swapnil","swapnil@123");
	      System.out.println(user);
	}

	public void getUserById() {
		Optional<User> id = repository.findById(102);
		  User user = id.get();
		  System.out.println(user);
	}

	public void insertUser() {
		List<User> list = Arrays.asList(
		          new User(107, "Vishal", "vishal", "vishal@123", "Akurdi"),
		          new User(108, "Vaibhvav", "vaibhav", "vaibhav@123", "Nagar"));
		   
		      repository.saveAll(list);
	}
	
}
