package com.davidaturner.github.FSWO102JV.Lesson9;

public class Animal {
	
	protected String type;
	
	protected String name;
	protected int age;
	protected float length;
	protected float height;
	protected float weight;
	protected String gender;
	protected String scientificName;
	
	// optional
	protected String farmName;
	protected String farmCity;
	protected String farmState;
	protected boolean grassFeed;

		
	public Animal ()
	{
		this("");
	}
	public Animal(String name)
	{
		this.name = name;
		age = 0;
		type = "Animal";
		
	}
	public Animal(AnimalBuilder builder)
	{
		type = builder.type;
		
		name = builder.name;
		age = builder.age;
		length = builder.length;
		height = builder.height;
		weight = builder.weight;
		gender = builder.gender;
		scientificName = builder.scientificName;
		
		farmName = builder.farmName;
		farmCity = builder.farmCity;
		farmState = builder.farmState;
		grassFeed = builder.grassFeed;
		
	}
	public Animal(String type, String name, int age, 
						float length, float height, float weight,
						String gender, String scientificName,
						String farmName, String farmCity, String farmState,
						boolean grassFeed)
	{
		this.type = type;
		
		this.name = name;
		this.age = age;
		this.length = length;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.scientificName = scientificName;
		
		this.farmName = farmName;
		this.farmCity = farmCity;
		this.farmState = farmState;
		this.grassFeed = grassFeed;		
	}

	
	public String getType() {
		return type;
	}	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getLength() {
		return length;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	public String getGender() {
		return gender;
	}
	public String getScientificName() {
		return scientificName;
	}
	public String getFarmName() {
		return farmName;
	}
	public String getFarmCity() {
		return farmCity;
	}
	public String getFarmState() {
		return farmState;
	}
	public boolean isGrassFeed() {
		return grassFeed;
	}
	
	
	
	
}
