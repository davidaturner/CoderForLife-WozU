package solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalFarm {

	AnimalFactory factory;
	
	public AnimalFarm(AnimalFactory factory) {
		this.factory = factory;
	}
	
	public IAnimal getAnimal() {
		return factory.getAnimal();
	}
	
	public static void main(String[] args) {
		
		List<IAnimal> myAnimals = new ArrayList<IAnimal>();
		
		// Get some Dogs
		AnimalFarm af1 = new AnimalFarm( new DogFactory());
		for(int i=0; i<2; i++) {
			myAnimals.add( af1.getAnimal());
		}
		
		// Add some Cats
		AnimalFarm af2 = new AnimalFarm( new CatFactory());
		for(int i=0; i<3; i++) {
			myAnimals.add( af2.getAnimal());
		}
		
		// Add some Cows.
		for(int i=0; i<7; i++) {
			myAnimals.add( AnimalSimpleFactory.getAnimal(AnimalSimpleFactory.COW));
		}
		
		// And finally, a turkey or three.
		AnimalFarm af3 = new AnimalFarm( new TurkeyFactory());
		for(int i=0; i<3; i++) {
			myAnimals.add( af3.getAnimal());
		}
		
		Cat testSubjectA = null;
		Turkey testSubjectB = null;
		
		Iterator iter = myAnimals.iterator();
		int i=1;
		while( iter.hasNext()) {
			IAnimal testSubject = (IAnimal)iter.next();
			System.out.println("Animal " + i + ": " + testSubject);
			boolean gotTestSubjectA = false, gotTestSubjectB = false;
			if (testSubject.getType().toLowerCase().equals(AnimalSimpleFactory.CAT)
					&& !gotTestSubjectA) {
				testSubjectA = (Cat)testSubject;
				gotTestSubjectA = true;
			}
			if (testSubject.getType().toLowerCase().equals(AnimalSimpleFactory.TURKEY)
					&& !gotTestSubjectB) {
				testSubjectB = (Turkey)testSubject;
				gotTestSubjectA = true;
			}
			i++;
		}
		testSubjectA.setName("Mr Whiskers");
		testSubjectA.howManyLives();
		
		testSubjectB.setName("Sarge");
		testSubjectB.displayFullAddress();
		
							
		
	}

}
