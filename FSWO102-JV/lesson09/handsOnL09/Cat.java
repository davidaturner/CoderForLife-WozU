package handsOnL09;

public class Cat extends Animal {

	public static int COUNT = 0;
	public static String ARCHETYPE = "cat";
	
	// Constructors
	public Cat() {
		name = ARCHETYPE;
		COUNT++;
	}
	public Cat(Animal cat) {
		this();
		length = cat.length;
		height = cat.height;
		weight = cat.weight;
		
		isGrassFed = cat.isGrassFed;
	}	
	
	
	public static void main(String[] args) {
		System.out.println(new Cat().getName());

	}

}
