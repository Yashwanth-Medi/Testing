package com.infinite.controller;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.Service.AdminService;
import com.infinite.dto.AuthRequest;
import com.infinite.pojo.Admin;
import com.infinite.pojo.Vendor;

@RestController
@RequestMapping("/admin")

public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/Aregistor")
	public String save(@RequestBody Admin admin) {

		System.out.println(admin.getAdminname());
		return adminService.saveAdmin(admin);
	}

	@PostMapping("/Atoken")
	public String getTokent(@RequestBody AuthRequest authRequest) throws AuthenticationException {

		try {

			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
			if (authenticate.isAuthenticated()) {
				return adminService.generateToken(authRequest.getUsername());
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

		adminService.validateToken(token);
		return "token validate";
	}

}
