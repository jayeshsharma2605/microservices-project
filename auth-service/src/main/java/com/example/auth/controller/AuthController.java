package com.example.auth.controller;

import com.example.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> req) {
        return service.register(req.get("username"), req.get("password"));
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> req) {
        return service.login(req.get("username"), req.get("password"));
    }
}
