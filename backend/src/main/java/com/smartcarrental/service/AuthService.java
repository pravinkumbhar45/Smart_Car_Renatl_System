package com.smartcarrental.service;

import com.smartcarrental.dto.LoginRequest;
import com.smartcarrental.dto.RegisterRequest;

public interface AuthService {

    String register(RegisterRequest request);
    String login(LoginRequest request);
}
