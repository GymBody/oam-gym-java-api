package com.gym.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.tracker.model.User;
import com.gym.tracker.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}
}