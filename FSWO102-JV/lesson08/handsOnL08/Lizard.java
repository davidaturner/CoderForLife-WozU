package handsOnL08;

public class Lizard implements Reptile {

	@Override
	public void eat() {
		System.out.println("Turtles eat lettuce.");

	}

	@Override
	public void crawl() {
		System.out.println("Lizard crawl.");

	}

	public static void main(String[] args) {
//		Lizard lizard = new Lizard();
		Reptile lizard = new Lizard();
		lizard.eat();
		lizard.crawl();

	}

}
