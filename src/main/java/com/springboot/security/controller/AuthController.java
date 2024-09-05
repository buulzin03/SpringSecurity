package com.springboot.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.service.AuthService;

@RestController
@RequestMapping("auth")
public class AuthController {
    
    @Autowired
    AuthService authService;

    @PostMapping()
    public String authenticate(Authentication authentication) {
        return authService.authenticate(authentication);
    }

}
