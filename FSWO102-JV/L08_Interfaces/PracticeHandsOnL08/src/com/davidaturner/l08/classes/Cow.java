package com.davidaturner.l08.classes;

import com.davidaturner.l08.interfaces.Mammal;

public class Cow implements Mammal {

	public static String TYPE="Cow";

	@Override
	public void eat() {
		System.out.println("Cows eat grass.");

	}

	@Override
	public void speak() {
		System.out.println("Cow says, Moo!");

	}

	@Override
	public void run() {
		System.out.println("Cows can run at a top speed of 25 mph!");

	}

}
