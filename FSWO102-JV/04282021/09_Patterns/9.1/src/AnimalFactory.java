
// This commonly used pattern is categorized as a creational pattern. 
// Thus, the purpose of this pattern is to create new objects.
public class AnimalFactory {

    public IAnimal getAnimal(String animalType) {
    	
        if(animalType.equalsIgnoreCase("cow")) {
            return new Cow();
        }
        else if(animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        else if(animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else {
            // factory cannot create an unrecognized object
            System.out.println(animalType + " is not recognized by AnimalFactory.");
            return null;
        }
    }
    
	public static void main(String[] args) {
		
	    // animal factory
	    AnimalFactory animalFactory = new AnimalFactory();

	    // produce a cow and speak
	    IAnimal cow = animalFactory.getAnimal("Cow");
	    cow.speak();

	    // produce a dog and speak
	    IAnimal dog = animalFactory.getAnimal("Dog");
	    dog.speak();

	    // produce a cat and speak
	    IAnimal cat = animalFactory.getAnimal("Cat");
	    cat.speak();

	}

}
