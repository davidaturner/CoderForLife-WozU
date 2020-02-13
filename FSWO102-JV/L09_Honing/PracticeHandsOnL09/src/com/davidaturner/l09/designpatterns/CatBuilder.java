package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.interfaces.Animal;
import com.davidaturner.l09.interfaces.AnimalBuilder;

public class CatBuilder implements AnimalBuilder {

	Animal cat;
	
	public CatBuilder() {
		this(0f, 0f, 0f);
	}
	public CatBuilder(float length, float height, float weight) {
		this.cat = new Cat("cat");
		setRequired(length, height, weight);
		
	}
	
	@Override
	public Animal buildAnimal() {
		// TODO Auto-generated method stub
		return this.cat;
	}

	public CatBuilder setRequired(float length, float height, float weight) {
		if (cat != null) {
			cat.setHeight(height);
			cat.setLength(length);
			cat.setWeight(weight);
		}
		return this;
	}
	
	public CatBuilder setGrassFed(boolean grassFed) {
		if (cat != null) {
			cat.setGrassFed(grassFed);
		}
		return this;
	}
}
