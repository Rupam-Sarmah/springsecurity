package com.jupiter.SpringSecurityJWT.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/project/v1/auth")
@RequiredArgsConstructor
public class AuthController {
	//private final AuthService authservice
	
	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest){
		AthenticationResponse authResponse = authService.register(registerRequest);
		return ResponseEntity.ok(authResponse);
	}

}
