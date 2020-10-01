package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Greetings, %s!";	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		
		long newCounter = 0;
//		newCounter = counter.get() * counter.incrementAndGet();
		newCounter = (counter.incrementAndGet() % 2 == 0)? counter.incrementAndGet() : counter.get();
		String templateWithName = String.format(template, name);
		Greeting greetingObj = new Greeting(newCounter, templateWithName);
		return greetingObj;
	}
}
