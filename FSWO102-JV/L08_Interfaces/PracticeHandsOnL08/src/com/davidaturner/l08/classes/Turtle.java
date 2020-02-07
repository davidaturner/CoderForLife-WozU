package com.davidaturner.l08.classes;

import com.davidaturner.l08.interfaces.Reptile;

public class Turtle implements Reptile {

	public static String TYPE="Turtle";

	@Override
	public void eat() {
		System.out.println("Turtles eat lettuce.");

	}

	@Override
	public void crawl() {
		System.out.println("Turtles can crawl at a top speed of 30 mph!");

	}

}
