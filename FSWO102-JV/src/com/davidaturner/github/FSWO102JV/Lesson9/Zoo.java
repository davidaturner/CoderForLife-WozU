package com.davidaturner.github.FSWO102JV.Lesson9;

import java.util.ArrayList;

public abstract class Zoo {

	ArrayList<Animal> animals = null;
	ZooBuilder builder = null;
	
	public Zoo()
	{
		this(null);
	}
	public Zoo( ZooBuilder builder)
	{
		animals = new ArrayList<Animal>();
		this.builder = builder;
		
	}
	
	public void gatherAnimals() {
		
		if ( builder != null)
		{
			addAnimals( builder.build());
		}
	}
	
	abstract public void buildCompound();
	
	abstract public void executeMission();
	
	abstract public void describeStaff();
	
	abstract public void exitStrategy();
	
	public void addAnimals(ArrayList<Animal> moreAnimals)
	{
		if (animals == null)
		{
			animals = new ArrayList<Animal>();
		}
		animals.addAll( moreAnimals);
	}
	
	public void setBuilder(ZooBuilder builder)
	{
		this.builder = builder;
	}
	
	void printInventory()
	{
		System.out.println("This Zoo has " + (animals.size()>0?animals.size():"no") + " animals in the compound.");
	}
}
