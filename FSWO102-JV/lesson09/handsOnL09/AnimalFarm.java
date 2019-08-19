package handsOnL09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalFarm {

	public static void main(String[] args) {
		
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
		Dog bowwow = new Dog(new Animal
				.AnimalBuilder(Dog.ARCHETYPE, 12.3f, 44.3f, 45.2f).build());
		animalList.add(bowwow);
		
		Cat mrwhiskers = new Cat(new Animal
				.AnimalBuilder(Cat.ARCHETYPE, 12.3f, 44.3f, 45.2f)
				.setGrassFed(true)
				.build());
		animalList.add(mrwhiskers);
		
		Cow bessie = new Cow(new Animal
				.AnimalBuilder(Cow.ARCHETYPE, 12.3f, 44.3f, 45.2f)
				.build());
		animalList.add(bessie);
		
		// Scorecard.
		System.out.println("Animal GETS: " + AnimalFactory.GETS);
		System.out.println("Animal BUILDS: " + Animal.AnimalBuilder.BUILDS);
		System.out.println("\r\nTotal Animals this Cycle: " + (AnimalFactory.GETS + Animal.AnimalBuilder.BUILDS));
		System.out.println("Dogs: " + Dog.COUNT);
		System.out.println("Cats: " + Cat.COUNT);
		System.out.println("Cows: " + Cow.COUNT);
		
		System.out.println("\r\nAnimal Farm PRESENTS: ");
		Iterator iter = animalList.iterator();
		while (iter.hasNext()) {
			Animal animal = (Animal)iter.next();
			System.out.println(animal.toString());
		}
		
	}

}
