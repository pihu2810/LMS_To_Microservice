package com.bridgelabz.CandidateEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CandidateEurekaApplication {

	public static void main(String[] args) {

		SpringApplication.run(CandidateEurekaApplication.class, args);
		System.out.println("Welcome to CandidateEureka");
	}

}
