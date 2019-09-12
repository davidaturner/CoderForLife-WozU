package com.l03.baconbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.l03.baconbuddy.models.Person;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("person", new Person());
		
		return "index";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return index(model);
	}
	
	@PostMapping("/person")
	public String personSubmit(@ModelAttribute Person person) {
		return "results";
	}
}
