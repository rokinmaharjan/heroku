package com.rokin.heroku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokin.heroku.model.User;
import com.rokin.heroku.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		System.err.println("GET API for users called");
		return this.userRepository.findAll();
	}

	public User saveUser(User user) {
		System.err.println("POST API for users called");
		return this.userRepository.save(user);
	}

}
