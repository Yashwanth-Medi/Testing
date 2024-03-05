package com.infinite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/orderServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return "order service taking long time for response"+"please try again";
		
	}
	@GetMapping("/productServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return "product service taking long time for response"+"please try again";
		
	}
	
	@GetMapping("/orderdetailsServiceFallBack")
	public String productServiceFallBackMethod()
	{
		return "orderdetails service taking long time for response"+"please try again";
		
	}

}
