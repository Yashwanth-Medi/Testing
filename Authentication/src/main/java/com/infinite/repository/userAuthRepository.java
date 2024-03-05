package com.infinite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.pojo.userAuth;
@Repository
public interface userAuthRepository extends JpaRepository<userAuth, Long> {
	
	 //Optional<userAuth> findByName(String username);

	 //Optional<userAuth> findByName(String username);

	Optional<userAuth> findByUsername(String username);
}
