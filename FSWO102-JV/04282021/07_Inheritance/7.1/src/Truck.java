
public class Truck {

    String make;
    String color;
    boolean isRunning;
    int fuelLevel;
    int flatbedLength;

    public Truck(String make, String color, int fuelLevel, int flatbedLength) {
        this.make = make;
        this.color = color;
        this.isRunning = false;
        this.fuelLevel = fuelLevel;
        this.flatbedLength = flatbedLength; // only on Truck
    }
    
    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + this.fuelLevel + ". Is it running? " + this.isRunning);
    }

    
	public static void main(String[] args) {
		
		Truck theTruck = new Truck("Chevrolet", "Cajun Red Tintcoat", 12, 64);
		theTruck.isRunning = true;
		
		theTruck.printDetails();

	}

}
