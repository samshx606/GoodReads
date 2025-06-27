package com.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.DTO.UserCredentials;
import com.global.model.User;
import com.global.projection.UserView;
import com.global.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return userService.register(user);
	}
	@PostMapping("/login")
	public User login(@RequestBody UserCredentials request) {
		return userService.login(request);
	}
	@GetMapping("")
	public List<UserView> findAll(){
		return userService.findAll();
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.delete(id);
	}
}
