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
		
		twoCows.add( factory.createCow(girlName));
		twoCows.add( factory.createCow(boyName));
		
		return twoCows;
	}

	private ArrayList<Cat> AddTwoCats(String girlName, String boyName) {
		
		ArrayList<Cat>twoCats = new ArrayList<Cat>();
		CatFactory factory = new CatFactory();
		
		twoCats.add( factory.createCat(girlName));
		twoCats.add( factory.createCat(boyName));
		
		return twoCats;
	}

	private ArrayList<Dog> AddTwoDogs(String girlName, String boyName) {
		
		ArrayList<Dog>twoDogs = new ArrayList<Dog>();
		DogFactory factory = new DogFactory();
		
		twoDogs.add( factory.createDog(girlName));
		twoDogs.add( factory.createDog(boyName));
		
		return twoDogs;
	}

}
