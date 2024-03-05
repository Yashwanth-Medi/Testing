package com.infinite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QuestionSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionSeviceApplication.class, args);
	}

}
