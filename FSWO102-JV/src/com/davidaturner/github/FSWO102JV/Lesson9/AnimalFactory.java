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
			return createDog(name);
		}
		else if (type.toLowerCase().equals("cat"))
		{
			return createCat(name);
		}
		else if (type.toLowerCase().equals("cow"))
		{
			return createCow(name);
		}
		
		System.out.println(type + " not registered in AnimalFactory.");
		return null;
	}
	
	public Dog createDog()
	{
		return createDog("");
	}
	public Dog createDog(String name)
	{
		return new Dog(name);								// Difficult for subclassing.
	}
	
	public Cat createCat()
	{
		return createCat("");
	}
	public Cat createCat(String name)
	{
		// return new CatFactory().createCat(name);			
		return new CatFactory().createCat(name, "cat");		// Better way. Covers subclassing.
	}
	
	public Cow createCow()
	{
		return createCow("");
	}	
	public Cow createCow(String name)
	{
		return new CowFactory().createCow(name);
	}
	

}
