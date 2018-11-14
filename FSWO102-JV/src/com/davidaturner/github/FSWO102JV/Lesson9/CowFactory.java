package com.davidaturner.github.FSWO102JV.Lesson9;

public class CowFactory {

	public Cow createCow(String name)
	{
		return new Cow(name, 
				0, 0.00f, 0.00f, 0.00f, "", "", "", "", "", false);
	}
	public Cow createCow(String name, 
			int age, float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		return new Cow(name, 
				age, length, height, weight, gender, scientificName, 
				farmName, farmCity, farmState, grassFeed);
	}
}
