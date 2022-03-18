// Developers can pass in the class type as a parameter to the Box class. The syntax 
// for generics uses the diamond <> with a letter "T" in between. The letter "T" 
// acts as a placeholder for any class, similar to how variables in method 
// declarations which have parameters are placeholders for data. All instances of 
// Object within the Box class can be swapped out with the class that will be passed 
// in, or "T".

public class BoxWithWheels2 <T> {
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
  
    public void printDetails() {
    	System.out.println("Yep. I am a " + this.get().getClass().getTypeName());
    }
    
	public static void main(String[] args) {
		try {
			
			Square square = new Square(4.0f);
			BoxWithWheels2<Square> boxA = new BoxWithWheels2<Square>();
			
			boxA.set(square);
			
//			Vehicle vehicle = (Vehicle) box.get(); // cannot cast to vehicle. it knows what type of box it is.
//			vehicle.printDetails();	
			
			boxA.printDetails();
			
			Vehicle vehicle = new Vehicle("Toyota Camry", "blue", 12);
			BoxWithWheels2<Vehicle> boxB = new BoxWithWheels2<Vehicle>();
			
			boxB.set(vehicle);
			
			boxB.printDetails();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("\r\nHow would box casted as a vehicle know it represents a vehicle?");
		}

	}

}
