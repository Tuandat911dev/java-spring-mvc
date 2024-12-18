package com.laptopshop.__java_spring_laptopshop_starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.__java_spring_laptopshop_starter.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return userService.handleHello();
    }
}
