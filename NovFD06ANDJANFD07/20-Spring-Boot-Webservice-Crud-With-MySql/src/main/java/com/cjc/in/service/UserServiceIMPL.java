package com.cjc.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.User;
import com.cjc.in.repository.ComplaintRepository;
import com.cjc.in.repository.UserRepository;

@Service
public class UserServiceIMPL  implements UserService{

	@Autowired
	private UserRepository urepository;
	
	private ComplaintRepository crepository;
	
	@Override
	public void saveUser(User user) {
	
	     urepository.save(user);
		
	}

	@Override
	public Object getUser(int id) {   // 10123
		
		 User u = null;
		     if(id>=100 && id<=999) {
		    	  Optional<User> optional = urepository.findById(id);
				  if(optional.isPresent()) {
					   u = optional.get();
					   return u;
				  }
				  else {
					  return "User Not Found";
				  }
		     }  
		     else {
		    	 return "Enter Correct ID should be three Digits  "+id;
		     }
	}
}
