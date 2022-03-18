
public class Truck extends Vehicle {

    int flatbedLength;

    public Truck(String make, String color, int fuelLevel, int flatbedLength) {
        super(make, color, fuelLevel);
        this.flatbedLength = flatbedLength;
    }
    
	public static void main(String[] args) {
		
		Truck theTruck = new Truck("Chevrolet", "Cajun Red Tintcoat", 12, 64);
		theTruck.isRunning = true;
		
		theTruck.printDetails();

	}

}
