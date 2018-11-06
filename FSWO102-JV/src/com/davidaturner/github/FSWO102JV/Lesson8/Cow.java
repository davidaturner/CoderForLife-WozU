package com.davidaturner.github.FSWO102JV.Lesson8;

public class Cow implements Mammal {
	
	@Override
	public void speak() {
		System.out.println("Moo!");
		
	}

	@Override
	public void run() {
		System.out.println("Cows can run at a Top Speed of 25 mph!");
		
	}

	@Override
	public void eat() {
		// From Animal interface.
		System.out.println("Cows eat grass.");
		
	}
}
