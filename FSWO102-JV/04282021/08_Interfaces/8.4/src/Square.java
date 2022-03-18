
public class Square {

	private float length;
	
	public Square(float length) {
		super();
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public static void main(String[] args) {
		Square square = new Square(4.0f);
		System.out.println(square.length);

	}
}
