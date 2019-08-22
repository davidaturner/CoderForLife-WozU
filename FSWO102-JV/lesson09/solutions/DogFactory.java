package solutions;

public class DogFactory extends AnimalFactory {

	@Override
	IAnimal getAnimal() {
		return new Dog();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
