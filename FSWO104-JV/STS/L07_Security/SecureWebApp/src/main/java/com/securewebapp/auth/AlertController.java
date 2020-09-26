package com.securewebapp.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlertController {

	@GetMapping("/alert")
	public String getAlertPage() {
		System.out.println("In AlertController");
		return "alert";
	}

}
