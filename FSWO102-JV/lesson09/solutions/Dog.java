package solutions;

public class Dog implements IHomeAnimal {

	String name;
	
	public Dog() {
		this("Dog");
	}
	public Dog(String name) {
		this.name = name;
	}
	
	
	@Override
	public void speak() {
		System.out.println("Bark!");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat bones.");
		
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getType() {
		return "dog";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
