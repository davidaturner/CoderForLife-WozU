package com.davidaturner.l09;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.classes.Cow;
import com.davidaturner.l09.classes.Dog;
import com.davidaturner.l09.designpatterns.AnyAnimalFactory;
import com.davidaturner.l09.designpatterns.CatFactory;
import com.davidaturner.l09.designpatterns.CowFactory;
import com.davidaturner.l09.designpatterns.DogFactory;
import com.davidaturner.l09.interfaces.Animal;

public class HandsOn {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		StudentHelper.openReader();
		
		CatFactory cats = new CatFactory();
		DogFactory dogs = new DogFactory();
		CowFactory cows = new CowFactory();
		AnyAnimalFactory factory = new AnyAnimalFactory();
		
//		Cat kitty = new Cat("cat");
//		Dog bowser = new Dog("dog");
//		Cow paddy = new Cow("cow");
		
//		Cat kitty = (Cat)cats.createAnimal("cat");
//		Dog bowser = (Dog)dogs.createAnimal("dog");
//		Cow paddy = (Cow)cows.createAnimal("cow");
		
		Cat kitty = (Cat)factory.createAnimal("cat");
		Dog bowser = (Dog)factory.createAnimal("dog");
		Cow paddy = (Cow)factory.createAnimal("cow");
		
		println(kitty.getName());
		println(bowser.getName());
		println(paddy.getName());
		
		System.out.println("Select Animal: ");
		String decision = StudentHelper.readStringInput();
		if (decision != null) {
			Cat cat = new Cat(decision);
			println("You selected", cat.getName());
		}		
		
		println("...Done!");
		StudentHelper.closeReader();

	}
	
	public static void println() {
		System.out.println();
	}
	public static void println(String prompt, String message) {
		if (prompt != null && !prompt.isEmpty()) {
			message = prompt + ": " + message;
		}
		System.out.println(message);
	}
	public static void println(String message) {
		println(null, message);
	}

}
