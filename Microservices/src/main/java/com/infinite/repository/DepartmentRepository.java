package com.infinite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.pojo.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	//Department findDepartmentById(Long departmentid);
	 // Products findByProductId(Long productid);

}
