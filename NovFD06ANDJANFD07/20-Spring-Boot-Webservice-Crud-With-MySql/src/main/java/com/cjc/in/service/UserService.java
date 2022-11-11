package com.cjc.in.service;

import com.cjc.in.model.User;

public interface UserService {

	void saveUser(User user);

	Object getUser(int id);

}
