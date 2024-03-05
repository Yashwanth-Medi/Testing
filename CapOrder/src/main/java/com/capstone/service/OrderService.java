package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.model.Orders;
import com.capstone.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Orders newOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	public Orders orderDetails(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId).orElseThrow(IllegalArgumentException::new);
	}

	public void removeOrder(Long orderId) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(orderId);
		
	}

}
