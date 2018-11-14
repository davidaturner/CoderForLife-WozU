package com.davidaturner.github.FSWO102JV.Lesson9;

public class Cat extends Animal {

	public Cat ()
	{
		this("");
	}
	public Cat (String name)
	{
		super(name);
		type = "Cat";
	}
	public Cat (String name, 
			int age, float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		super("Cat", name, age, length, height, weight, gender, scientificName,
				farmName, farmCity, farmState, grassFeed);
	}
}
