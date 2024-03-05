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

import com.infinite.Service.VendorService;
import com.infinite.dto.AuthRequest;
import com.infinite.pojo.Vendor;
import com.infinite.pojo.userAuth;

@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService vendorService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/Vregistor")
	public String addNewUser(@RequestBody Vendor vendor) {

		System.out.println(vendor.getFname());
		return vendorService.saveVendor(vendor);
	}

	@PostMapping("/Vtoken")
	public String getTokent(@RequestBody AuthRequest authRequest) throws AuthenticationException {

		try {

			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
			if (authenticate.isAuthenticated()) {
				return vendorService.generateToken(authRequest.getUsername());
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

		vendorService.validateToken(token);
		return "token validate";
	}

}
