package com.davidaturner.l09.interfaces;

public abstract class Animal {

	private String name;

	private float length;
	private float height;
	private float weight;
	
	private boolean grassFed;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isGrassFed() {
		return grassFed;
	}

	public void setGrassFed(boolean grassFed) {
		this.grassFed = grassFed;
	}
	
}
