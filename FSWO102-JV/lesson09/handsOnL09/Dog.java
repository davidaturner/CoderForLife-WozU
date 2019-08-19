package handsOnL09;

public class Dog extends Animal {

	public static int COUNT = 0;
	public static String ARCHETYPE = "dog";	
	
	// Constructors
	public Dog() {
		name = ARCHETYPE;
		COUNT++;
	}
	public Dog(Animal dog) {
		this();
		length = dog.length;
		height = dog.height;
		weight = dog.weight;
		
		isGrassFed = dog.isGrassFed;
	}
	
	public static void main(String[] args) {
		System.out.println( new Dog().getName());

	}

}
