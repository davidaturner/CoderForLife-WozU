package com.davidaturner.github.FSWO102JV.Lesson8;

public class HandsOn8 {

	public void Step1 ()
	{
		System.out.println("STEP 1: ");
		System.out.println();
		
		Dog dog = new Dog();
		Cat cat = new Cat();		
		Cow cow = new Cow();
		
		System.out.print("Dogs can ");
		dog.speak();
		dog.run();
		System.out.print("Cats can ");
		cat.speak();
		cat.run();
		System.out.print("Cows can ");
		cow.speak();
		cow.run();
		
		System.out.println();
	}
	
	public void Step2 ()
	{
		System.out.println("STEP 2: ");
		System.out.println();
		
		Dog dog = new Dog();
		Cat cat = new Cat();		
		Cow cow = new Cow();
		
		System.out.print("Dogs can ");
		dog.speak();
		dog.run();
		dog.eat();
		System.out.print("Cats can ");
		cat.speak();
		cat.run();
		cat.eat();
		System.out.print("Cows can ");
		cow.speak();
		cow.run();
		cow.eat();
		
		System.out.println();		
	}
	
	public void Step3 ()
	{
		System.out.println("STEP 3: ");
		System.out.println();
		
		Lizard lizard = new Lizard();
		Turtle turtle = new Turtle();		

		lizard.eat();
		lizard.crawl();

		turtle.eat();
		turtle.crawl();

		
		System.out.println();		
	}
}
