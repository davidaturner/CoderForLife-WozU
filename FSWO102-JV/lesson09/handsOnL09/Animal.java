package handsOnL09;

public class Animal {

	String name;
	float length;
	float height;
	float weight;
	
	boolean isGrassFed = false;
	
	// Constructors
	public Animal () {
		this("");
	}
	public Animal(String name) {
		this.name = name;
		length = 0.0f;
		height = 0.0f;
		weight = 0.0f;
	}	
	// Private constructor to use Builder.
	private Animal(AnimalBuilder ab) {
		name = ab.name;
		length = ab.length;
		height = ab.height;
		weight = ab.weight;
		
		isGrassFed = ab.isGrassFed;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isGrassFed() {
		return isGrassFed;
	}

	public void setGrassFed(boolean isGrassFed) {
		this.isGrassFed = isGrassFed;
	}

	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);		
		if (length > 0.0f || length > 0.0f || weight > 0.0f) {
			sb.append(": length(" + length);
			sb.append(") height(" + height);
			sb.append(") weight(" + weight);
			sb.append(") isGrassFed(" + (isGrassFed?"yes":"no") + ").");
		}
		return sb.toString();
	}
	
	// static Builder class.
	public static class AnimalBuilder {
		String name;
		float length;
		float height;
		float weight;
		
		boolean isGrassFed = false;
		public static int BUILDS = 0;
		
		public AnimalBuilder(String name) {
			this(name, 0.0f, 0.0f, 0.0f);
		}
		
		public AnimalBuilder(String name, float length, float height, float weight) {
			this.name = name;
			this.length = length;
			this.height = height;
			this.weight = weight;
		}
		
		public AnimalBuilder setGrassFed(boolean isGrassFed) {
			this.isGrassFed = isGrassFed;
			return this;
		}
		
		public Animal build() {		
			BUILDS++;
			return new Animal(this);
		}

	}

	public static void main(String[] args) {
		
		Animal tabby = new Animal.AnimalBuilder("Lonnie", 23f, 8f, 35f)
									.setGrassFed(true)
									.build();
		System.out.println(tabby.getName());
	}

}
