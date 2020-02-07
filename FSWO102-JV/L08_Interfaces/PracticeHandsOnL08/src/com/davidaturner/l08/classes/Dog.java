package com.davidaturner.l08.classes;

import com.davidaturner.l08.interfaces.Mammal;

public class Dog implements Mammal {

	public static String TYPE="Dog";

	@Override
	public void eat() {
		System.out.println("Dogs eat bones.");

	}

	@Override
	public void speak() {
		System.out.println("Dog says, Bark!");
		
	}

	@Override
	public void run() {
		System.out.println("Dogs can run at a top speed of 45 mph!");
		
	}

}
