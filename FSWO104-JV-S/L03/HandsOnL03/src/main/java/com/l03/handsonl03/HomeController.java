package com.l03.handsonl03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "storyteller";
	}
	
	@GetMapping("/beginning")
	public String beginning() {
		return "beginning";
	}
	
	@GetMapping("/middle")
	public String middle() {
		return "middle";
	}
	
	@GetMapping("/end")
	public String end() {
		return "end";
	}
	
	@GetMapping("/fullstory")
	public String fullstory() {
		return "fullstory";
	}

}
