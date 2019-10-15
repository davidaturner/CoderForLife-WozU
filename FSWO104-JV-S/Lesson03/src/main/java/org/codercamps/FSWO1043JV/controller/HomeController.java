package org.codercamps.FSWO1043JV.controller;

import org.codercamps.FSWO1043JV.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String homepage (Model model) {
		model.addAttribute("person", new Person());
		return "index";
	}
	
	@PostMapping("/person")
	public String results (@ModelAttribute Person person) {
		return "results";
	}
}
