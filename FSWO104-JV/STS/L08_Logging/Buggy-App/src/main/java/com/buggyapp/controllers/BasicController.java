package com.buggyapp.controllers;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		String localDateTime = getLocalDateTime();
		return localDateTime;
	}
	
	@RequestMapping("/random")
	public @ResponseBody String random() {
		String result = "";
		int randomvalue = getRandomValue();
		
		result = Integer.toString(randomvalue);
		return result;
	}
	
	private String getLocalDateTime() {
		String result = "";
		LocalDateTime now = LocalDateTime.now();
		result = now.toString();
		System.out.println(result);
		return result;
	}
	
	private int getRandomValue() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
}
