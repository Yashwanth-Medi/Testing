package com.infinite.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.infinite.pojo.Admin;

import com.infinite.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private PasswordEncoder passwordEnconde;

	@Autowired
	private JwtService jwtService;

	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);

	}

	public Admin FindAdminById(Long admin_Id) {
		return adminRepository.findById(admin_Id).orElseThrow(IllegalArgumentException::new);

	}

	public String saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		admin.setAdminpassword(passwordEnconde.encode(admin.getAdminpassword()));
		System.out.println(admin.getAdminname());
		System.out.println(admin.getAdminpassword());
		adminRepository.save(admin);
		return "Succesfull";

	}

	public String generateToken(String username) {
		// TODO Auto-generated method stub
		return jwtService.generateToken(username);
	}

	public void validateToken(String token) {
		// TODO Auto-generated method stub
		jwtService.validateToken(token);

	}

}
