package com.rokin.heroku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rokin.heroku.model.User;
import com.rokin.heroku.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> getUsers() {
		return this.userService.getUsers();
	}
	
	@PostMapping()
	public User saveUser(@RequestBody User user) {
		return this.userService.saveUser(user);
	}
}
