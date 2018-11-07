package com.davidaturner.github.FSWO102JV.Lesson9;

public class CatFactory {

	public Cat createCat(String name)
	{
		return new Cat(name);
	}
	public Cat createCat(String name, String type)
	{
		if (type.toLowerCase().equals("cat"))
		{
			return new Cat(name);
		}

		System.out.println(type + " not registered in CatFactory.");
		return null;
	}

}
