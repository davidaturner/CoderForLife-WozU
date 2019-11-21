package org.codercamps.FSWO1043JV.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getChat() {
		return "chat";
	}
}
