package com.securewebapp.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/","/home"})
	public String getHomePage() {
		System.out.println("In HomeController");
		return "home";
	}
	
	@GetMapping("/secure")
	public String getSecurePage() {
		System.out.println("In HomeController");
		return "secure";
	}
	
}
