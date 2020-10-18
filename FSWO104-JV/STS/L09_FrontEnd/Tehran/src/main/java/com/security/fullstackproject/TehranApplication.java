package com.security.fullstackproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.security.fullstackproject", 
				"com.security.fullstackproject.auth",
				"com.security.fullstackproject.controllers",
				"com.security.fullstackproject.services"})
public class TehranApplication {

	public static void main(String[] args) {
		System.out.println("In Main()");
		SpringApplication.run(TehranApplication.class, args);
	}

}
