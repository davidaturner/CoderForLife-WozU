package com.davidaturner.github.FSWO102JV.Lesson9;

import java.util.ArrayList;
import java.util.Collection;

public class NoahsArkBuilder implements ZooBuilder {

	@Override
	public ArrayList<Animal> build() {

		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.addAll( AddTwoDogs("Minnie", "Roscoe"));
		animals.addAll( AddTwoCats("Tabitha", "Dasher"));
		animals.addAll( AddTwoCows("Callas", "Strothers"));	
		
		return animals;
	}

	private ArrayList<Cow> AddTwoCows(String girlName, String boyName) {

		ArrayList<Cow>twoCows = new ArrayList<Cow>();
		CowFactory factory = new CowFactory();
		
		twoCows.add( factory.createCow(girlName, 0, 0.00f, 0.00f, 0.00f,
				"female", "", "", "", "", false));
		twoCows.add( factory.createCow(boyName, 0, 0.00f, 0.00f, 0.00f,
				"male", "", "", "", "", false));
		
		return twoCows;
	}

	private ArrayList<Cat> AddTwoCats(String girlName, String boyName) {
		
		ArrayList<Cat>twoCats = new ArrayList<Cat>();
		CatFactory factory = new CatFactory();
		
		twoCats.add( factory.createCat(girlName, 0, 0.00f, 0.00f, 0.00f,
				"female", "", "", "", "", false));
		twoCats.add( factory.createCat(boyName, 0, 0.00f, 0.00f, 0.00f,
				"male", "", "", "", "", false));
		
		return twoCats;
	}

	private ArrayList<Dog> AddTwoDogs(String girlName, String boyName) {
		
		ArrayList<Dog>twoDogs = new ArrayList<Dog>();
		DogFactory factory = new DogFactory();
		
		twoDogs.add( factory.createDog(girlName, 0, 0.00f, 0.00f, 0.00f,
				"female", "", "", "", "", false));
		twoDogs.add( factory.createDog(boyName, 0, 0.00f, 0.00f, 0.00f,
				"male", "", "", "", "", false));
		
		return twoDogs;
	}

}
