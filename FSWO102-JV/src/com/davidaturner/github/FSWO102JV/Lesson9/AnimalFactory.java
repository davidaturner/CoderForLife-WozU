package com.davidaturner.github.FSWO102JV.Lesson9;

public class AnimalFactory {
	
	public Animal createAnimal(String type)
	{
		return createAnimal("", type);
	}
	public Animal createAnimal(String name, String type)
	{
		if (type.toLowerCase().equals("dog"))
		{
			return (new DogFactory()).createDog(name);
		}
		else if (type.toLowerCase().equals("cat"))
		{
			return (new CatFactory()).createCat(name);
		}
		else if (type.toLowerCase().equals("cow"))
		{
			return (new CowFactory()).createCow(name);
		}
		
		System.out.println(type + " not registered in AnimalFactory.");
		return null;
	}	

}
