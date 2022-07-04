package com.bridgelabz.CandidateAPIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CandidateApIgatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(CandidateApIgatewayApplication.class, args);
		System.out.println("Welcome to Candidate API gateway");
	}

}
