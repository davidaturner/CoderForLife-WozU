package com.l03.handsonl03.model;

public class Storyteller {

	private String name;
	private String animal;
	private int yearsAgo;
	
	public Storyteller() {
	}
	
	public Storyteller(String name, String animal, int yearsAgo) {
		this.name = name;
		this.animal = animal;
		this.yearsAgo = yearsAgo;
	}
	@Override
	public String toString() {
		return name + " " + animal + " " + yearsAgo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getYearsAgo() {
		return yearsAgo;
	}
	public void setYearsAgo(int yearsAgo) {
		this.yearsAgo = yearsAgo;
	}



}
