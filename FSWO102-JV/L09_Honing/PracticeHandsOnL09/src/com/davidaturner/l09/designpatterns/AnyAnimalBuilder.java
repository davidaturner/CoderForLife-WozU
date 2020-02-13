package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.classes.Cow;
import com.davidaturner.l09.classes.Dog;
import com.davidaturner.l09.interfaces.Animal;
import com.davidaturner.l09.interfaces.AnimalBuilder;

public class AnyAnimalBuilder implements AnimalBuilder {

	private Animal animalBuilt;
	
	public AnyAnimalBuilder(String name, float length, float height, float weight) {
		
		Animal animalBuilt = null;
		if (name.equals("cat")) {
			animalBuilt = new Cat(name);			
		} else if (name.equals("dog")) {
			animalBuilt = new Dog(name);
		} else if (name.equals("cow")) {
			animalBuilt = new Cow(name);
		} else {
			System.out.println("cannot build animal. type unknown.");
		}		
		if (animalBuilt != null) {
			animalBuilt.setLength(length);
			animalBuilt.setHeight(height);
			animalBuilt.setWeight(weight);
		}
		this.animalBuilt = animalBuilt;
		
	}
	
	@Override
	public Animal buildAnimal() {
		return animalBuilt;
	}
	
	public AnimalBuilder setGrassFed(boolean grassFed) {
		animalBuilt.setGrassFed(grassFed);
		return this;
	}

}
