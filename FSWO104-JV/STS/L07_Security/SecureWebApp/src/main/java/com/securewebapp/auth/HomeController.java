package com.securewebapp.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping
	public String getSecurePage() {
		return "secure";
	}
	
	@GetMapping
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping
	public String getRegisterPage() {
		return "register";
	}
}
