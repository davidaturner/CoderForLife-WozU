package com.filmbuddy.controllers;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.filmbuddy.models.Actor;

@Controller
public class ActorsController {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping(value="/actors", method=RequestMethod.GET)
	public String getAllActors(Model model) {
		List<Actor>actors = new ArrayList<>();
		final String GET_QUERY = "SELECT * FROM Actor";
		
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(GET_QUERY);
			while (rs.next()) {
				Actor newActor = new Actor();
				newActor.setActor_id(rs.getInt("actor_id"));
				newActor.setFirst_name(rs.getString("first_name"));
				newActor.setLast_name(rs.getString("last_name"));
				newActor.setLast_update(rs.getTimestamp("last_update"));
				
				actors.add(newActor);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("actors", actors);
		return "actors";
	}
}
