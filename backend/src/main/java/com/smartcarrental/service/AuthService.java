package com.smartcarrental.service;

import com.smartcarrental.dto.LoginRequest;
import com.smartcarrental.dto.RegisterRequest;
import com.smartcarrental.entity.User;

public interface AuthService {

    User register(RegisterRequest request);

    User login(LoginRequest request);
}
