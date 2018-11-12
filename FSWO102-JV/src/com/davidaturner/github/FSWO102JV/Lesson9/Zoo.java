package com.davidaturner.github.FSWO102JV.Lesson9;

import java.util.ArrayList;

public abstract class Zoo {

	String name = null;
	
	ArrayList<Animal> animals = null;
	ZooBuilder builder = null;
	
	public Zoo(String name)
	{
		this("", null);
	}
	public Zoo( String name, ZooBuilder builder)
	{
		this.name = name;
		animals = new ArrayList<Animal>();
		this.builder = builder;		
	}
	
	public Zoo gatherAnimals()
	{
		if (builder != null)
		{
			animals.addAll( builder.build());
		}
		if (animals != null && !animals.isEmpty())
		{
			System.out.println("Gathering animals for " + name.toUpperCase() 
				+"... SUCCESSFUL!");
			printInventory();
			
		}
		else
		{
			System.out.println("Trouble encountered! No animals gathered.");
		}
		
		return this;
	}

	abstract public void buildCompound();
	
	abstract public void executeMission();
	
	abstract public void describeStaff();
	
	abstract public void exitStrategy();
	
	
	public void setBuilder(ZooBuilder builder)
	{
		this.builder = builder;
	}
	
	public String getName()
	{
		return name;
	}
	
	void printInventory()
	{
		System.out.println("Taking inventory...");
		System.out.println();
		System.out.println("This Zoo, " + name + ", has " + 
					(animals.size()>0?animals.size():"no") + 
					" animals in the compound.");
		System.out.println();
		for(Animal animal : animals)
		{
			System.out.println(animal.name + ", a " + animal.gender + " " +
						animal.type + ".");
		}
		System.out.println();
		System.out.println("ALL ANIMALS ARE PRESENT AND ACCOUNTED FOR!");
		
	}
}
