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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.filmbuddy.models.Actor;
import com.filmbuddy.models.ActorFilm;

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
	
	@RequestMapping(value="/actorfilms", method=RequestMethod.GET)
	public String getAllActorsWithFilm(Model model) {
		List<ActorFilm>actorfilms = new ArrayList<>();
		final String GET_QUERY = "select actor.actor_id, first_name, last_name, " +
				"film_actor.film_id, title from actor\r\n" + 
				"inner join film_actor on actor.actor_id = film_actor.actor_id\r\n" + 
				"inner join film on film_actor.film_id = film.film_id;";
		
		Connection con;
		try {
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(GET_QUERY);
			while (rs.next()) {
				ActorFilm newActorFilm = new ActorFilm();
				newActorFilm.setActor_id(rs.getInt("actor_id"));
				newActorFilm.setFirst_name(rs.getString("first_name"));
				newActorFilm.setLast_name(rs.getString("last_name"));
				newActorFilm.setFilm_id(rs.getInt("film_id"));
				newActorFilm.setTitle(rs.getString("title"));
//				newActorFilm.setRelease_year(rs.getYear("release_year"));
				
				actorfilms.add(newActorFilm);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("actorfilms", actorfilms);
		return "actorfilms";
	}

}
