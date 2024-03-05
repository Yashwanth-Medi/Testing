package com.infinite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.pojo.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
