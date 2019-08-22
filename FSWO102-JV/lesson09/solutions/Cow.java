package solutions;

public class Cow implements IHomeAnimal {
	
	String name;
	
	public Cow() {
		this("Cow");
	}
	public Cow(String name) {
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("Moo!");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat grass.");
		
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
		return "cow";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
