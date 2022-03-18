
public class BoxWithWheels {

    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
    
	public static void main(String[] args) {

		try {
			
			Square square = new Square(4.0f);
			BoxWithWheels box = new BoxWithWheels();
			
			box.set(square);
			
			Vehicle vehicle = (Vehicle) box.get();
			vehicle.printDetails();	
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("\r\nHow would box casted as a vehicle know it represents a vehicle?");
		}
	}

}
