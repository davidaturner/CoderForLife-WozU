
public class Square implements IShape {

    float length;

    // overloaded constructor
    public Square(float length) {
        this.length = length;
    }

    // interface method
    public float area() {
        // area = length * length
        return length * length;
    }
    
	public static void main(String[] args) {
		float squareLength = 3f;
		Square sq = new Square(squareLength);

		float area = sq.area();
		System.out.println(area);

	}

}
