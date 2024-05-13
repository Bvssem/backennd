package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;








import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {    @Autowired
    private Userservice userservice;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userservice.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/login")
    public String login() {

        return "Login page";
    }
}
