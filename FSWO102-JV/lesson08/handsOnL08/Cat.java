package handsOnL08;

public class Cat implements Mammal {

	@Override
	public void speak() {
		System.out.println("Meow!");

	}

	@Override
	public void run() {
		System.out.println("Cats can run at a top speed of 30 mph!");

	}

	@Override
	public void eat() {
		System.out.println("Cats eat mice.");
		
	}
	
	public static void main(String[] args) {
//		Cat mrwhiskers = new Cat();
		Mammal mrwhiskers = new Cat();
		mrwhiskers.speak();
		mrwhiskers.run();
		mrwhiskers.eat();

	}

}
