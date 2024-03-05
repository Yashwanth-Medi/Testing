package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CapOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapOrderApplication.class, args);
	}

}
