package com.infinite.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.infinite.pojo.Vendor;
import com.infinite.repository.VendorRespository;

@Service
public class VendorService {

	@Autowired
	private VendorRespository vendorRespository;
	@Autowired
	private PasswordEncoder passwordEnconde;

	@Autowired
	private JwtService jwtService;

	public Vendor addVendor(Vendor vendor) {
		return vendorRespository.save(vendor);

	}

	public Vendor FindVendorById(Long user_Id) {
		return vendorRespository.findById(user_Id).orElseThrow(IllegalArgumentException::new);

	}

	public String saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendor.setVpassword(passwordEnconde.encode(vendor.getVpassword()));
		System.out.println(vendor.getFname());
		System.out.println(vendor.getVpassword());
		vendorRespository.save(vendor);
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
