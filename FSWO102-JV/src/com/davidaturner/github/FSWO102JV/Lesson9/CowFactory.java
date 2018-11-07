package com.davidaturner.github.FSWO102JV.Lesson9;

public class CowFactory {

	public Cow createCow(String name)
	{
		return new Cow(name);
	}
	public Cow createCow(String name, String type)
	{
		if (type.toLowerCase().equals("cow"))
		{
			return new Cow(name);
		}

		System.out.println(type + " not registered in CowFactory.");
		return null;
	}
}
