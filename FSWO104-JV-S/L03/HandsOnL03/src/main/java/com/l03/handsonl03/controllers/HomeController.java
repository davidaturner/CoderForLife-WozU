package com.l03.handsonl03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.l03.handsonl03.model.Storyteller;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void setStory(Model model) {
		model.addAttribute("name", "Mark");
		model.addAttribute("animal", "LLama");
		model.addAttribute("yearsAgo", 3);			
	}
	
	@GetMapping("/")
	public String home() {
		return "beginning";
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
	
	@GetMapping("/storyteller")
    public String storyteller(Model model) {
		model.addAttribute("storyteller", new Storyteller());
        return "storyteller";
    }
	
	@PostMapping("/storyteller")
	public String submit(@ModelAttribute("storyteller") Storyteller storyteller) {
		return "fullstory";
	}

	@GetMapping("/fullstory")
	public String fullstory() {
		return "fullstory";
	}
	

}
