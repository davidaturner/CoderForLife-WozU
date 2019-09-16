package solutions;

public class Cat implements IHomeAnimal {

	String name;
	
	public Cat() {
		this("Cat");
	}
	public Cat(String name) {
		this.name = name;
	}

	public void howManyLives() {
		System.out.println(name + " has nine lives!");
	}
	
	@Override
	public void speak() {
		System.out.println("Meow!");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat mice!");
		
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
		return "cat";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
