package com.davidaturner.l08.classes;

import com.davidaturner.l08.interfaces.Reptile;

public class Lizard implements Reptile {

	public static String TYPE="Lizard";

	@Override
	public void eat() {
		System.out.println("Lizards eat crickets.");

	}

	@Override
	public void crawl() {
		System.out.println("Lizards can crawl at a top speed of 30 mph!");

	}

}
