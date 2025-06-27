package com.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.DTO.UserCredentials;
import com.global.model.User;
import com.global.projection.UserView;
import com.global.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User register(User user) {
		return userRepository.save(user);
	}
	public User login(UserCredentials request) {
		 User user = userRepository.findByUsername(request.getUsername());

		    if (user == null) {
		        throw new RuntimeException("User not found!");
		    }

		    if (!user.getPassword().equals(request.getPassword())) {
		        throw new RuntimeException("Password doesn't match!");
		    }

		    return user;
	}
	public List<UserView> findAll(){
		return userRepository.findAllBy();
	}
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}
