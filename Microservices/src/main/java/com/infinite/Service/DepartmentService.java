package com.infinite.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infinite.pojo.Department;
import com.infinite.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	  public Department findDepartmentById(Long departmentid) {
		  //return departmentRepository.findDepartmentById(departmentid);
		  
		  return departmentRepository.findById(departmentid).orElseThrow(IllegalArgumentException::new);
		  }

}
