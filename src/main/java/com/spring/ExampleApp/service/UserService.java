package com.spring.ExampleApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.ExampleApp.model.User;
import com.spring.ExampleApp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		repo.save(user);
		return user;
	}

}
