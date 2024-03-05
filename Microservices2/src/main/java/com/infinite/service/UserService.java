package com.infinite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infinite.help.Department;
import com.infinite.help.Product;
import com.infinite.help.ResponseTemplateValueObject;
import com.infinite.pojo.User;
import com.infinite.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateValueObject getUsersWithDepartment(Long userId) {
		ResponseTemplateValueObject vo = new ResponseTemplateValueObject();

		User user = userRepository.findByUserId(userId);

		Department department = restTemplate.getForObject("http://10.4.33.19:8080/department/" + user.getDepartmentID(),
				Department.class);
		Product product = restTemplate.getForObject("http://10.4.33.19:8100/product/" + user.getProductid(),
				Product.class);

		vo.setUser(user);
		vo.setDepartment(department);
		vo.setProduct(product);

		return vo;

	}

}
