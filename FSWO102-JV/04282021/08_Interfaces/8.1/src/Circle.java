
public class Circle implements IShape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        // area = 3.14 * radius * radius
        return 3.14f * radius * radius;
    }

	public static void main(String[] args) {
		
		float squareLength = 3f;
		Square sq = new Square(squareLength);
		float area = sq.area();
		System.out.println(area);
		
		float circleRadius = 4f;
		Circle cir = new Circle(circleRadius);
		float circleArea = cir.area();
		System.out.println(circleArea);

	}

}
