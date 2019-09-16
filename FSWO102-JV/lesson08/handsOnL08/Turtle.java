package handsOnL08;

public class Turtle implements Reptile {

	@Override
	public void eat() {
		System.out.println("Turtles eat lettuce.");

	}

	@Override
	public void crawl() {
		System.out.println("Turtles crawl.");

	}

	public static void main(String[] args) {
//		Turtle dude = new Turtle();
		Reptile dude = new Turtle();
		dude.eat();
		dude.crawl();

	}

}
