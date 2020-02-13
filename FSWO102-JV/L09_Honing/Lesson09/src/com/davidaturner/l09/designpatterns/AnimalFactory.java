package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.classes.Cow;
import com.davidaturner.l09.classes.Dog;
import com.davidaturner.l09.interfaces.Animal;

public class AnimalFactory {

	public Animal createAnimal(String type) {
		if (type.equals("cat")) {
			return new Cat();
		} else if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cow")) {
			return new Cow();
		} else {
			System.out.println("animal cannot be created: type unknown");
		}
		return null;
	}
}
