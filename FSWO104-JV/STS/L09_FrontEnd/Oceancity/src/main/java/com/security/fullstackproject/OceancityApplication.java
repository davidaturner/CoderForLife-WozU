package com.security.fullstackproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.security.fullstackproject", "com.security.fullstackproject.auth"})
public class OceancityApplication {

	public static void main(String[] args) {
		System.out.println("In Main()");
		SpringApplication.run(OceancityApplication.class, args);
	}

}
