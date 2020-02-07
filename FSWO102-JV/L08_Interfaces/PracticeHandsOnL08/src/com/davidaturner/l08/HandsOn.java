package com.davidaturner.l08;

import com.davidaturner.l08.classes.Cat;
import com.davidaturner.l08.classes.Cow;
import com.davidaturner.l08.classes.Dog;
import com.davidaturner.l08.classes.Lizard;
import com.davidaturner.l08.classes.Turtle;
import com.davidaturner.l08.interfaces.Mammal;
import com.davidaturner.l08.interfaces.Reptile;

public class HandsOn {

	public static void main(String[] args) {

		Mammal cat = new Cat();
		Mammal dog = new Dog();
		Mammal cow = new Cow();
		
		Reptile lizard = new Lizard();
		Reptile turtle = new Turtle();
		
		// Mammals
		describeMammal(cat);
		describeMammal(dog);
		describeMammal(cow);
		
		// Reptile
		describeReptile(lizard);
		describeReptile(turtle);

	}
	
	private static void describeMammal(Mammal animal) {
		animal.eat();
		animal.speak();
		animal.run();
		System.out.println();
	}
	
	private static void describeReptile(Reptile animal) {
		animal.eat();
		animal.crawl();
		System.out.println();
	}

}
