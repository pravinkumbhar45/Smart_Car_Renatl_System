package com.smartcarrental.service.impl;

import com.smartcarrental.dto.LoginRequest;
import com.smartcarrental.dto.RegisterRequest;
import com.smartcarrental.entity.User;
import com.smartcarrental.repository.UserRepository;
import com.smartcarrental.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(RegisterRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); // bcrypt later
        user.setRole("USER");

        return userRepository.save(user);
    }

    @Override
    public User login(LoginRequest request) {
        return userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
