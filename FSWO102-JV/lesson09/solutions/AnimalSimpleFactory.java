package solutions;

public class AnimalSimpleFactory {

	public static final String DOG = "dog";
	public static final String CAT = "cat";
	public static final String COW = "cow";
	public static final String TURKEY = "turkey";
	
	public static IAnimal getAnimal(String animalType) {
		
		if (animalType.toLowerCase().equals(DOG)) {
			return new Dog();
		}
		else if (animalType.toLowerCase().equals(CAT)) {
			return new Cat();
		}
		else if (animalType.toLowerCase().equals(COW)) {
			return new Cow();
		}
		else if (animalType.toLowerCase().equals(TURKEY)) {
			return new Turkey.TurkeyBuilder().build();
		}
		else {
			System.out.println("Animal type unknown.");
			return null;
		}
	}
	
	public static IHomeAnimal getAnimal(String name, String animalType) {
		
		if (animalType.toLowerCase().equals(DOG)) {
			return new Dog(name);
		}
		else if (animalType.toLowerCase().equals(CAT)) {
			return new Cat(name);
		}
		else if (animalType.toLowerCase().equals(COW)) {
			return new Cow(name);
		}
		else {
			System.out.println("Animal type unknown.");
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		IAnimal[] animalFarm = new IAnimal[5];
		for(int i=0; i<5; i++) {			
			animalFarm[i] = AnimalSimpleFactory.getAnimal(AnimalSimpleFactory.DOG);
		}
		
		for(IAnimal animal: animalFarm) {
			System.out.println(animal);
		}
		
		IHomeAnimal mrwhiskers = getAnimal("Mr Whiskers", CAT);
		animalSpeaks(mrwhiskers);
		
		Cat mrwhiskersthecat = (Cat)mrwhiskers;
		mrwhiskersthecat.howManyLives();
		
		IHomeAnimal bessie = getAnimal("Bessie", COW);
		animalSpeaks(bessie);

	}
	
	public static void animalSpeaks(IHomeAnimal animal) {
		System.out.print(animal.getName() + " goes ");
		animal.speak();
	}

}
