package com.example.Securitydemo.security;

public interface AuthService {
	JwtAuthResponse login(LoginDto loginDto);
    String save(UserRequestDTO userRequestDto) throws Exception;
}
