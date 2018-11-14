package com.davidaturner.github.FSWO102JV.Lesson9;

public class AnimalBuilder {

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
	
	public AnimalBuilder(String type, String name, int age, float length, float height, float weight, String gender,
			String scientificName) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.length = length;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.scientificName = scientificName;
	}
	
	public AnimalBuilder setFarmName(String farmName) {
		this.farmName = farmName;
		return this;
	}
	public AnimalBuilder setFarmCity(String farmCity) {
		this.farmCity = farmCity;
		return this;
	}
	public AnimalBuilder setFarmState(String farmState) {
		this.farmState = farmState;
		return this;
	}
	public AnimalBuilder setGrassFeed(boolean grassFeed) {
		this.grassFeed = grassFeed;
		return this;
	}
	
	public Animal build()
	{
		return new Animal(this);
	}
}
