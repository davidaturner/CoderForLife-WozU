package com.davidaturner.l09;

import java.util.ArrayList;
import java.util.List;

import com.davidaturner.l09.classes.Cat;
import com.davidaturner.l09.classes.Cow;
import com.davidaturner.l09.classes.Dog;
import com.davidaturner.l09.designpatterns.AnyAnimalBuilder;
import com.davidaturner.l09.designpatterns.AnyAnimalFactory;
import com.davidaturner.l09.designpatterns.CatBuilder;
import com.davidaturner.l09.designpatterns.CatFactory;
import com.davidaturner.l09.designpatterns.CowFactory;
import com.davidaturner.l09.designpatterns.DogFactory;
import com.davidaturner.l09.interfaces.Animal;
import com.davidaturner.l09.interfaces.AnimalFactory;

public class HandsOn {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		StudentHelper.openReader();
		
		System.out.println("Running Step01...");
		RunStep01();
		println();
		
		System.out.println("Running Step02...");
		RunStep02();	
		println();
		
		System.out.println("Running Step03...");
		RunStep03();
		println();

		println("...Done!");
		StudentHelper.closeReader();

	}
	
	public static void RunStep01() {
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
	}
	public static void RunStep02() {
		AnimalFactory factory = new AnyAnimalFactory();
		List<Animal> animalList = new ArrayList<>();
		boolean isDone = false;
		
		while( !isDone) {
			System.out.print("Add an animal (cat, dog or cow): ");
			String animalToBeAdded = StudentHelper.readStringInput();
			if (animalToBeAdded.toLowerCase().equals("exit")) {
				isDone = true;
				continue;
			}
			Animal animal = factory.createAnimal(animalToBeAdded);
			if (animal != null) {
				animalList.add(animal);
			}
		}		
		println();
		
		println("You have entered: ");
		for(Animal  animalToBeDisplayed : animalList) {
			println(animalToBeDisplayed.toString());
		}		
		println();
		
		int catCount = 0, dogCount = 0, cowCount = 0;
		for(Animal animalToBeDisplayed : animalList) {
			if (animalToBeDisplayed.getClass().equals(Cat.class)) {
				catCount++;
			} else if (animalToBeDisplayed.getClass().equals(Dog.class)) {
				dogCount++;
			} else if (animalToBeDisplayed.getClass().equals(Cow.class)) {
				cowCount++;
			}
		}
		println("Final tally: ");
		println("Cats: ", "" + catCount);
		println("Dogs: ", "" + dogCount);
		println("Cows: ", "" + cowCount);
	}
	
	public static void RunStep03() {
//		Animal kitty = new CatBuilder(1.2f, 2.3f, 12f)
//		.buildAnimal();
//Animal bowser = new CatBuilder()
//		.setRequired(1.4f,  2.2f,  15f)
//		.setGrassFed(true)
//		.buildAnimal();
//CatBuilder builder = new CatBuilder();
//Animal paddy = builder.setRequired(1.1f, 1.8f, 9f)
//		.buildAnimal();

Animal kitty = new AnyAnimalBuilder("cat", 2.2f, 1.3f, 12f)
				.buildAnimal();
Animal bowser = new AnyAnimalBuilder("dog", 1.8f, 1.3f, 9.3f)
.buildAnimal();
Animal paddy = new AnyAnimalBuilder("cow", 2f, 1.8f, 15f)
.setGrassFed(true)
.buildAnimal();

println("Kitty", kitty.getName() + " Dimensions: " + 
		kitty.getLength() + " " +
		kitty.getHeight() + " " +
		kitty.getWeight() + " Grass Fed?: " + kitty.isGrassFed());
println("Bowser", bowser.getName() + " Dimensions: " + 
bowser.getLength() + " " +
bowser.getHeight() + " " +
bowser.getWeight() + " Grass Fed?: " + bowser.isGrassFed());
println("Paddy", paddy.getName() + " Dimensions: " + 
paddy.getLength() + " " +
paddy.getHeight() + " " +
paddy.getWeight() + " Grass Fed?: " + paddy.isGrassFed());
	}
	// Auxiliary functions
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
