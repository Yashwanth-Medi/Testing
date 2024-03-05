package com.capstone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Model.OrderDetails;
import com.capstone.Service.OrderDetailService;
import com.capstone.helper.Responeobjects;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailService detailService;

	@PostMapping("/save")
	public void newOrderDetails(@RequestBody OrderDetails orderDetails) {
		System.out.println("add");
		detailService.newOrder(orderDetails);

	}

	@GetMapping("/orderdetails/{id}")
	public Responeobjects getOrderDetails(@PathVariable("id") Long orderDetailsId) {
		return detailService.orderDetails(orderDetailsId);
		
	}
}
