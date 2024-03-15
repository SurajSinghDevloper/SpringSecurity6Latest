package com.example.Securitydemo.security;

import com.example.Securitydemo.models.Users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthResponse {
	  private Users user;
	private String accessToken;
  
  
}