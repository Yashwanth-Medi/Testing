package com.infinite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinite.pojo.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 
		User findByUserId(Long userId); 

}