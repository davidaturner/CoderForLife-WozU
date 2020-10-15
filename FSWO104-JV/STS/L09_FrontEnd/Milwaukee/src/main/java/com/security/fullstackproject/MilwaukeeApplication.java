package com.security.fullstackproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MilwaukeeApplication {

	public static void main(String[] args) {
		System.out.println("In Main()");
		SpringApplication.run(MilwaukeeApplication.class, args);
	}

}
