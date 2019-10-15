package org.codercamps.FSWO1043JV.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codercamps.FSWO1043JV.models.Actor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/actors"})
public class ActorController {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@GetMapping()
	public String getAllActors(Model model) {
		List<Actor>actors = new ArrayList<>();
		
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM actor");			
			while(rs.next()) {
				
				Actor actor = new Actor();
				actor.setActor_id(rs.getInt("actor_id"));
				actor.setFirst_name(rs.getString("first_name"));
				actor.setLast_name(rs.getString("last_name"));
				actor.setLast_update(rs.getTimestamp("last_update"));
				
				actors.add(actor);
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		model.addAttribute("actors", actors);	
		return "actors";
	}
}
