package com.davidaturner.github.FSWO102JV.Lesson8;

public class Dog implements Mammal {

	@Override
	public void speak() {
		System.out.println("Bark!");
		
	}

	@Override
	public void run() {
		System.out.println("Dogs can run at a Top Speed of 45 mph!");
		
	}

	@Override
	public void eat() {
		// From Animal interface.
		System.out.println("Dogs eat bones.");
		
	}

}
