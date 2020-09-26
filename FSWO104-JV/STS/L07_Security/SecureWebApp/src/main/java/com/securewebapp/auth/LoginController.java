package com.securewebapp.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MySqlUserDetailsService userService;
	
	@GetMapping("/login")
	public String getLoginPage() {
		System.out.println("In LoginController");
		return "login";
	}
	
	@GetMapping("/register")
	public String getRegisterPage() {
		System.out.println("In LoginController");
		return "register";
	}
	
	@PostMapping("/register")
	public String createUser(@RequestParam("username") String username, @RequestParam("password") String password,
								Model model) {
		System.out.println("In LoginController");
		User foundUser = userRepository.findByUsername(username);
		if (foundUser == null) {
			User newUser = new User();
			newUser.setUsername(username);
			newUser.setPassword(password);
			userService.save(newUser);
			return "login";
		} else {
			model.addAttribute("exists", true);
			return "register";		
		}
	}

}
