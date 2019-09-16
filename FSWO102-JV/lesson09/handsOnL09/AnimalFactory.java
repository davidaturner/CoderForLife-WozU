package handsOnL09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalFactory {

	public static int GETS = 0;
	
	public static Animal getAnimal(String request) {
		
		if (request.toLowerCase().equals(Dog.ARCHETYPE)) {
			GETS++;
			return new Dog();
		}
		else if (request.toLowerCase().equals(Cat.ARCHETYPE)) {
			GETS++;
			return new Cat();
		}
		else if (request.toLowerCase().equals(Cow.ARCHETYPE)) {
			GETS++;
			return new Cow();
		}
		else {
			System.out.println("Unknown Animal. Cannot GET.");
			return null;
		}
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<>();
		
		animalList.add( AnimalFactory.getAnimal(Dog.ARCHETYPE));
		animalList.add( AnimalFactory.getAnimal(Cat.ARCHETYPE));		
		animalList.add( AnimalFactory.getAnimal(Cow.ARCHETYPE));
		animalList.add( AnimalFactory.getAnimal(Cow.ARCHETYPE));		
		
		System.out.println("\r\nStraight from the Factory: ");
		Iterator iter = animalList.iterator();
		while (iter.hasNext()) {
			Animal animal = (Animal)iter.next();
			System.out.println(animal.toString());
		}
	}
}
