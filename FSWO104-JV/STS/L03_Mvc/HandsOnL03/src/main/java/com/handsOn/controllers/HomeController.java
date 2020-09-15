package com.handsOn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.handsOn.models.Storyboard;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("storyboard", new Storyboard());
		return "beginning";
	}
	
	@PostMapping("/middle")
	public String beginningSubmit(@ModelAttribute Storyboard storyboard) {
		return "middle";
	}
	
	@PostMapping("/ending")
	public String mediumSubmit(@ModelAttribute Storyboard storyboard) {
		return "ending";
	}
	
	@PostMapping("/fullstory")
	public String endingSubmit(@ModelAttribute Storyboard storyboard) {
		return "fullstory";
	}
}
