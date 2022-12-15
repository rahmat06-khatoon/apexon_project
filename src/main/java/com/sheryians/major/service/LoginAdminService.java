package com.sheryians.major.service;

import org.springframework.stereotype.Service;

import com.sheryians.major.model.User;
@Service
public class LoginAdminService {

public boolean loginValidate(User user) {
		
		if(user.getEmail().equals("admin@mail.com") && user.getPassword().equals("admin@123")) {
		
			return true;
		}
		
		
		return false;
		
	}
}
