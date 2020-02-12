package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.interfaces.Animal;
import com.davidaturner.l09.interfaces.AnimalFactory;

public class CatFactory extends AnimalFactory {

	@Override
	public Animal createAnimal(String name) {
		return new Cat(name);
	}

}
