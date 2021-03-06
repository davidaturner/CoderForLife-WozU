package com.fullstackproject.auth;

import com.auth0.jwt.JWT;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	  private AuthenticationManager authenticationManager;
	  
	  public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
	    this.authenticationManager = authenticationManager;
	  }

	  @Override
	  public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res) throws AuthenticationException {
	    try {
	      UserData userToBeAuthenticated = new ObjectMapper()
	    		  								.readValue(req.getInputStream(), UserData.class);

	      return authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(
	        		userToBeAuthenticated.getUsername(),
	        		userToBeAuthenticated.getPassword(),
	        		new ArrayList<>())
	      );
	    } catch (IOException e) {
	      throw new RuntimeException(e);
	    }
	  }

	  @Override
	  protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain, Authentication auth) 
			  throws IOException, ServletException {
	    String token = JWT.create()
	      .withSubject(((UserData) auth.getPrincipal()).getUsername())
	      .withExpiresAt(new Date(System.currentTimeMillis() + AuthConstants.EXPIRATION_TIME))
	      .sign(HMAC512(AuthConstants.SECRET_KEY));
	    
	    res.addHeader(AuthConstants.HEADER_STRING, AuthConstants.TOKEN_PREFIX + token);
	  }

//	  @Override
//	  protected void unsuccessfulAuthentication(HttpServletRequest req, HttpServletResponse res, AuthenticationException failed) 
//			  throws IOException, ServletException {
//	    super.unsuccessfulAuthentication(req, res, failed);
//	  }
	}
