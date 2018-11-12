package com.davidaturner.github.FSWO102JV.Lesson9;

public class DogFactory {

	public Dog createDog(String name)
	{
		return new Dog(name, 
				0, 0.00f, 0.00f, 0.00f, "", "", "", "", "", false);
	}
	public Dog createDog(String name, 
			int age, float length, float height, float weight,
			String gender, String scientificName,
			String farmName, String farmCity, String farmState,
			boolean grassFeed)
	{
		return new Dog(name, 
				age, length, height, weight, gender, scientificName, 
				farmName, farmCity, farmState, grassFeed);
	}
}
