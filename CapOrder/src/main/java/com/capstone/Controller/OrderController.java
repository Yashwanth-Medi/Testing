package com.capstone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.model.Orders;
import com.capstone.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/new")
	public Orders newOrder(@RequestBody Orders order) {
		System.out.println("1-c");
		return orderService.newOrder(order);
	}

	@GetMapping("/{id}")
	public Orders orderDetails(@PathVariable("id") Long orderId) {
		return orderService.orderDetails(orderId);
	}

}
