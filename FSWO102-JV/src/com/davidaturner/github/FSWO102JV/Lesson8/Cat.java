package com.davidaturner.github.FSWO102JV.Lesson8;

public class Cat implements Mammal {

	@Override
	public void speak() {
		System.out.println("Meow!");
		
	}

	@Override
	public void run() {
		System.out.println("Cats can run at a Top Speed of 30 mph!");
		
	}

	@Override
	public void eat() {
		// From Animal interface.
		System.out.println("Cats eat mice.");
		
	}
}
