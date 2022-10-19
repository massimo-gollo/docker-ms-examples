package com.myapp.user.controllers;

import com.myapp.user.models.User;
import com.myapp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Creating the REST controller
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/ping",produces = "application/json")
    public String getEmployees() {
        return "Hello from Users";
    }


}
