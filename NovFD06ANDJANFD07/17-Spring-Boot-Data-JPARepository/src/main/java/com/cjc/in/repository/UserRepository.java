package com.cjc.in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.in.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUnameAndPass(String uname, String pass);

	User findByNameOrAddress(String uname, String pass);

	List<User> findDistinctByAddress(String address);
	
	List<User> findByNameEndingWith(String pattern);
 
}
