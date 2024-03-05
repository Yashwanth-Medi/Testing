package com.infinite.controller;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

import com.infinite.Service.Usercredentialservice;
import com.infinite.dto.AuthRequest;
import com.infinite.pojo.userAuth;

@RestController
@RequestMapping("/auth")
public class Authccontroller {

	@Autowired
	private Usercredentialservice service;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/registor")
	public String addNewUser(@RequestBody userAuth auth) {

		System.out.println(auth.getUsername());
		return service.saveUser(auth);
	}

	@PostMapping("/token")
	public String getTokent(@RequestBody AuthRequest authRequest) throws AuthenticationException {

		try {

			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
			if (authenticate.isAuthenticated()) {
				return service.generateToken(authRequest.getUsername());
			} else {
				String msg = "Invalid Credenrials";
				return msg;
			}
		} catch (BadCredentialsException | DisabledException e) {
			// TODO: handle exception
			throw new AuthenticationException("Authentication Failed", e);
		}

	}

	@GetMapping("/validate/{token}")
	public String validateToken(@PathVariable("token") String token) {

		service.validateToken(token);
		return "token validate";
	}
}
