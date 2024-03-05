package com.infinite.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import com.infinite.pojo.Vendor;
import com.infinite.pojo.userAuth;
import com.infinite.repository.userAuthRepository;

@Component
public class CustomDetailsService implements UserDetailsService {

	@Autowired
	private userAuthRepository authRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		Optional<userAuth> credential = authRepository.findByUsername(username);

		if (credential.isPresent()) {
			userAuth auth = credential.get();

			CustomeUserDetails cud = new CustomeUserDetails(auth);

			return new CustomeUserDetails(auth);
		} else {
			throw new UsernameNotFoundException("User not found with name: " + username);
		}
	}

}
