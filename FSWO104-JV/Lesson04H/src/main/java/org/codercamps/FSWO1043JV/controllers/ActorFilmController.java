package org.codercamps.FSWO1043JV.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codercamps.FSWO1043JV.model.ActorFilm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/actorfilms"})
public class ActorFilmController {

	@Value("${spring.datasource.url}")
	private String url;
		
	@Value("${spring.datasource.username}")
	private String username;
		
	@Value("${spring.datasource.password}")
	private String password;
		
	@GetMapping()
	public String getAllActors(Model model) {
		List<ActorFilm>actorfilms = new ArrayList<>();
			
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT a.actor_id, a.first_name, a.last_name, a.last_update, "
					+ "f.film_id, f.title, f.description " + 
					"FROM film_actor fa inner JOIN film f ON f.film_id = fa.film_id " + 
					"inner JOIN actor a ON fa.actor_id = a.actor_id");
			
			while(rs.next()) {				
				ActorFilm actorfilm = new ActorFilm();
				actorfilm.setActor_id(rs.getInt("actor_id"));
				actorfilm.setFirst_name(rs.getString("first_name"));
				actorfilm.setLast_name(rs.getString("last_name"));
				actorfilm.setLast_update(rs.getDate("last_update"));
				actorfilm.setFilm_id(rs.getInt("film_id"));
				actorfilm.setTitle(rs.getString("title"));
				actorfilm.setDescription(rs.getString("description"));

				actorfilms.add(actorfilm);				
			}
			
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		model.addAttribute("actorfilms", actorfilms);	
		return "view";
	}
}
