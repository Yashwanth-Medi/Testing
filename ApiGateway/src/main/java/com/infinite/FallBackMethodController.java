package com.infinite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return "product service taking long time for response"+"please try again";
		
	}
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return "product service taking long time for response"+"please try again";
		
	}
	
	@GetMapping("/productServiceFallBack")
	public String productServiceFallBackMethod()
	{
		return "product service taking long time for response"+"please try again";
		
	}

}
