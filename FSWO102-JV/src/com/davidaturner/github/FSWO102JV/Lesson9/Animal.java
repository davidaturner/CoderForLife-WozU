package com.davidaturner.github.FSWO102JV.Lesson9;

public class Animal {
	
	protected String name;
	protected int age;
	
	public Animal ()
	{
		this("");
	}
	public Animal(String name)
	{
		this.name = name;
		this.age = 0;
		
	}
	
	public String getName()
	{
		return name;
	}
}
