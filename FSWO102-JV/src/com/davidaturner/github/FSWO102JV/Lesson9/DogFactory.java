package com.davidaturner.github.FSWO102JV.Lesson9;

public class DogFactory {

	public Dog createDog(String name)
	{
		return new Dog(name);
	}
	public Dog createDog(String name, String type)
	{
		if (type.toLowerCase().equals("dog"))
		{
			return new Dog(name);
		}

		System.out.println(type + " not registered in DogFactory.");
		return null;
	}
}
