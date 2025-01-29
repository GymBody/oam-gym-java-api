package com.gym.tracker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.tracker.model.User;
import com.gym.tracker.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @GetMapping(path = "/users")
    public User GetUserProfileByID(Long id) {
    	
    	return userService.getUserById(id);
    }
}