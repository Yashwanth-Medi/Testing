package com.infinite.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.infinite.pojo.userAuth;
import com.infinite.repository.userAuthRepository;

@Service
public class Usercredentialservice {

	@Autowired
	private userAuthRepository authRepository;

	@Autowired
	private PasswordEncoder passwordEnconde;

	@Autowired
	private JwtService jwtService;

	public String saveUser(userAuth auth) {
		auth.setPassword(passwordEnconde.encode(auth.getPassword()));
		System.out.println(auth.getUsername());
		System.out.println(auth.getPassword());
		authRepository.save(auth);
		return "Succesfull";
	}

	public String generateToken(String username) {
		return jwtService.generateToken(username);

	}

	public void validateToken(String token) {
		jwtService.validateToken(token);
	}

}
