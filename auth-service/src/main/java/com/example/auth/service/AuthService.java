package com.example.auth.service;

import com.example.auth.model.User;
import com.example.auth.repository.UserRepository;
import com.example.auth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AuthService {
    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    // Register
    public String register(String username, String password) {

        if (repo.findByUsername(username).isPresent()) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        user.setRole("USER");

        repo.save(user);

        return "User registered successfully";
    }

    // Login
    public Map<String, String> login(String username, String password) {

        User user = repo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!encoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtil.generateToken(user.getUsername(), user.getRole());

        return Map.of(
                "access_token", token,
                "role", user.getRole()
        );
    }
}
