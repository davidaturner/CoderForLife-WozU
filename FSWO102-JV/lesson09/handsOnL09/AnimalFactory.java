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
		Steps0102();
	}
	
	public static void Steps0102 () {
		
		List<Animal> animalList = new ArrayList<>();
		
		boolean inputDone = false;	
		while( !inputDone ) {
			
			String request = StudentHelper.ReadInputString();
			if ( request.toLowerCase().equals("exit")) {
				inputDone = true;
				continue;
			}
			Animal animal = AnimalFactory.getAnimal(request);
			if (animal != null) {
				animalList.add(animal);				
			}
		}
		
		// Add three more!
		animalList.add(new Animal
				.AnimalBuilder(Dog.ARCHETYPE, 12.3f, 44.3f, 45.2f).build());
		animalList.add(new Animal
				.AnimalBuilder(Cat.ARCHETYPE, 12.3f, 44.3f, 45.2f)
				.setGrassFed(true)
				.build());
		animalList.add(new Animal
				.AnimalBuilder(Cow.ARCHETYPE, 12.3f, 44.3f, 45.2f)
				.build());
		
		// Scorecard.
		System.out.println("Animal GETS: " + AnimalFactory.GETS);
		System.out.println("Animal BUILDS: " + Animal.AnimalBuilder.BUILDS);
		System.out.println("Total: " + AnimalFactory.GETS + Animal.AnimalBuilder.BUILDS);
		System.out.println("Dogs: " + Dog.COUNT);
		System.out.println("Cats: " + Cat.COUNT);
		System.out.println("Cows: " + Cow.COUNT);
		
		System.out.println("Animal Farm: ");
		Iterator iter = animalList.iterator();
		while (iter.hasNext()) {
			Animal animal = (Animal)iter.next();
			System.out.println(animal.toString());
		}
		


	}

}
