package com.example.Securitydemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Securitydemo.models.Users;
import com.example.Securitydemo.security.AuthService;
import com.example.Securitydemo.security.JwtAuthResponse;
import com.example.Securitydemo.security.LoginDto;
import com.example.Securitydemo.security.UserRequestDTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

	private AuthService authService;

	// Build Login REST API
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
		JwtAuthResponse response = authService.login(loginDto);
		if (response != null) {
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Invalid Crendentals ..... ", HttpStatus.BAD_REQUEST);
		}

	}

	// Building Post API
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody UserRequestDTO userRequestdto) {
		String successMessage = "";
		try {
			successMessage = authService.save(userRequestdto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>(successMessage, HttpStatus.OK);

	}

}
