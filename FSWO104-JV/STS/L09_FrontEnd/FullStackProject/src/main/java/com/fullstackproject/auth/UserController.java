package com.fullstackproject.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/user")
@RequestMapping("/")
public class UserController {

  @Autowired
  private MySQLUserDetailsService userService;

  @GetMapping("/hello")
  public String hello () {
	  return "Hello, World!";
  }
  
  @PostMapping("/authenticate")
  public void authenticate() {
  }
//  @PostMapping("/register")
//  public void register(@RequestBody UserData userToBeRegistered) {
//    userService.Save(userToBeRegistered);
//  }
}