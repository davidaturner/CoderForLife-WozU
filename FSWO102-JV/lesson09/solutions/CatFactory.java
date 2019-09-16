package solutions;

public class CatFactory extends AnimalFactory {

	@Override
	IAnimal getAnimal() {
		return new Cat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
