package handsOnL08;

public class Dog implements Mammal {

	@Override
	public void speak() {
		System.out.println("Bark!");

	}

	@Override
	public void run() {
		System.out.println("Dogs can run at a top speed of 45 mph!");

	}

	@Override
	public void eat() {
		System.out.println("Dogs eat bones.");
		
	}
	
	public static void main(String[] args) {
//		Dog bowwow = new Dog();
		Mammal bowwow = new Dog();
		bowwow.speak();
		bowwow.run();
		bowwow.eat();

	}



}
