package handsOnL08;

public class Cow implements Mammal {

	@Override
	public void speak() {
		System.out.println("Moo!");

	}

	@Override
	public void run() {
		System.out.println("Cows can run at a top speed of 25 mph!");

	}

	@Override
	public void eat() {
		System.out.println("Cows eat grass.");
		
	}
	
	public static void main(String[] args) {
//		Cow bessie = new Cow();
		Mammal bessie = new Cow();
		bessie.speak();
		bessie.run();
		bessie.eat();
	}

}
