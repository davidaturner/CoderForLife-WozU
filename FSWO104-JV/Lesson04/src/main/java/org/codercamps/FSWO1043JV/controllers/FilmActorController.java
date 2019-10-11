package org.codercamps.FSWO1043JV.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.codercamps.FSWO1043JV.models.Actor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/FilmActors"})
public class FilmActorController {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@GetMapping()
	public String getAllFilmActors(Model model) {
		ArrayList<Actor>filmActors = new ArrayList<>();
		
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from filmactors");			
			while(rs.next()) {
				
				Actor actor = new Actor();
				actor.setActionID(rs.getInt("actionID"));
				actor.setFirstName(rs.getString("firstName"));
				actor.setLastName(rs.getString("lastName"));
				actor.setLastUpdate(rs.getTimestamp("lastUpdate"));
				
				filmActors.add(actor);
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		model.addAttribute("actors", filmActors);
	
		return "firmactors";
	}
}
