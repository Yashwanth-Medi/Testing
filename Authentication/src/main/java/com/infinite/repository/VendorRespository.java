package com.infinite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.pojo.Vendor;


@Repository
public interface VendorRespository extends JpaRepository<Vendor, Long>{
	
	//Optional<Vendor> findByFname(String username);

	

}
