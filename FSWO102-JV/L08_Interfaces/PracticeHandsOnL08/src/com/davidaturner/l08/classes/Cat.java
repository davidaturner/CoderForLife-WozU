package com.davidaturner.l08.classes;

import com.davidaturner.l08.interfaces.Mammal;

public class Cat implements Mammal {

	public static String TYPE="Cat";
	
	@Override
	public void eat() {
		System.out.println("Cats eat mice.");

	}

	@Override
	public void speak() {
		System.out.println("Cat says, Meow!");

	}

	@Override
	public void run() {
		System.out.println("Cats can run at a top speed of 30 mph!");

	}

}
