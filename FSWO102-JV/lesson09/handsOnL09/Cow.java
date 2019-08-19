package handsOnL09;

public class Cow extends Animal {

	public static int COUNT = 0;
	public static String ARCHETYPE = "cow";	
	
	// Constructors
	public Cow() {
		name = ARCHETYPE;
		COUNT++;
	}
	public Cow(Animal cow) {
		this();
		length = cow.length;
		height = cow.height;
		weight = cow.weight;
		
		isGrassFed = cow.isGrassFed;
	}
	
	public static void main(String[] args) {
		System.out.println( new Cow().getName());

	}

}
