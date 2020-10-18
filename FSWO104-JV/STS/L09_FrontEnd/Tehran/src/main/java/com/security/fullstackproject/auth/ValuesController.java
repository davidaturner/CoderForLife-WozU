package com.security.fullstackproject.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValuesController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("In Hello()");
		return "Hello, World!";
//		return "index.html";
	}
	
	/*
	 * This method will authenticate the input username and password.
	 * If successful, a JWT web token is created and sent back to user.
	 * Ironically, this API endpoint /authenticate must be authenticated before
	 * it can run. Add configure method to WebSecurityConfiguration.
	 * 
	 * Use with Postman - username and password in JSON body.
	 * 
	 */
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ResponseEntity<?>createAuthenticationToken(
			@RequestBody AuthenticationRequest request) throws Exception {
		String username = request.getUsername();
		String password = request.getPassword();
		System.out.println("In createAuthenticationToken()");
		System.out.println("  Authenticating! username: " + username + " password: " + password);
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(username, password)
					);
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password");
		}
		System.out.println("  Authenticated! Creating Jwt...");
		final UserDetails userDetails = myUserDetailsService.loadUserByUsername(username);
		System.out.println("  Retrieved! username: " + userDetails.getUsername() + " password: " + userDetails.getPassword());
		final String jwt = jwtUtil.generateToken(userDetails);
		System.out.println("   Jwt: " + jwt);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));

	}

}
