package com.fullstackproject.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MySQLUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
//  public UserDetails loadUserByUsername(String username) {
//	  System.out.println("In LoadUser()");
//    UserData userToBeLoaded = userRepository.findByUsername(username);
//    if (userToBeLoaded == null) {
//      throw new UsernameNotFoundException(username);
//    }
//    return new User(userToBeLoaded.getUsername(), userToBeLoaded.getPassword(), getAuthorities());
//  }
  public UserDetails loadUserByUsername(String username) {
	  System.out.println("In LoadUser()");
//    UserData userToBeLoaded = userRepository.findByUsername(username);
//    if (userToBeLoaded == null) {
//      throw new UsernameNotFoundException(username);
//    }
//    return new User(userToBeLoaded.getUsername(), userToBeLoaded.getPassword(), getAuthorities());
	  return new User("toy", "toy", new ArrayList<>());
  }

//  public UserDetails Save(UserData userToBeSaved) {
//	userToBeSaved.setPassword(passwordEncoder.encode(userToBeSaved.getPassword()));
//    UserData savedUser = userRepository.save(userToBeSaved);
//    return new User(savedUser.getUsername(), savedUser.getPassword(), getAuthorities());
//  }

//  private List<SimpleGrantedAuthority> getAuthorities() {
//    List<SimpleGrantedAuthority> authList = new ArrayList<>();
//    authList.add(new SimpleGrantedAuthority("ROLE_USER"));
//    return authList;
//  }
}
