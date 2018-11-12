package com.davidaturner.github.FSWO102JV.Lesson9;

public class CatFactory {

	public Cat createCat(String name)
	{
		return new Cat(name, 
				0, 0.00f, 0.00f, 0.00f, "", "", "", "", "", false);
	}
	public Cat createCat(String name, 
			int age, float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		return new Cat(name, 
				age, length, height, weight, gender, scientificName, 
				farmName, farmCity, farmState, grassFeed);
	}

}
