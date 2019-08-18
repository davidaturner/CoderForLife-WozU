package solutions;

public class CowFactory extends AnimalFactory {

	@Override
	IAnimal getAnimal() {
		return new Cow();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
