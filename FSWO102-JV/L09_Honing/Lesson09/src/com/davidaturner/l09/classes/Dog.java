package com.davidaturner.l09.classes;

import com.davidaturner.l09.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Bark!");

	}

}
