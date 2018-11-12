package com.davidaturner.github.FSWO102JV.Lesson9;

public class Cow extends Animal {
	
	public Cow ()
	{
		this("");
	}
	public Cow (String name)
	{
		super(name);
		type = "Cow";
	}
	public Cow (String name, 
			int age, float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		super("Cow", name, age, length, height, weight, gender, scientificName,
				farmName, farmCity, farmState, grassFeed);
	}
}
