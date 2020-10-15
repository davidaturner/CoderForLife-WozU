package com.security.fullstackproject.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValuesController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("In Hello()");
		return "index.html";
	}

}
