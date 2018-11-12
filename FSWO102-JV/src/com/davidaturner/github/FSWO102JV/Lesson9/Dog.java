package com.davidaturner.github.FSWO102JV.Lesson9;

public class Dog extends Animal {
	
	public Dog ()
	{
		this("");
	}
	public Dog (String name)
	{
		super(name);
		type = "Dog";
	}
	public Dog (String name, int age, 
			float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		super("Dog", name, age, length, height, weight, gender, scientificName,
				farmName, farmCity, farmState, grassFeed);
	}
}
