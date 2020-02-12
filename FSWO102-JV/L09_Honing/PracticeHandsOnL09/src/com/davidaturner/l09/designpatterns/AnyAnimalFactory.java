package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.classes.Cow;
import com.davidaturner.l09.classes.Dog;
import com.davidaturner.l09.interfaces.Animal;
import com.davidaturner.l09.interfaces.AnimalFactory;

public class AnyAnimalFactory extends AnimalFactory {

	@Override
	public Animal createAnimal(String name) {
		switch(name) {
		case "cat" :
			return new Cat(name);
		case "dog":
			return new Dog(name);
		case "cow":
			return new Cow(name);
		default:
			System.out.println("Cannot create animal. Unrecognized name.");
		}
		return null;
	}
}
