package com.example.Securitydemo.security;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRequestDTO {

	private String email;
	private String name;
	private String password;
	private String username;

	
	
	
	
}
