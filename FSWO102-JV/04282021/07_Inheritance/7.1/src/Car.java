
public class Car {

    String make;
    String color;
    boolean isRunning;
    int fuelLevel;
    int trunkWidth;

    public Car(String make, String color, int fuelLevel, int trunkWidth) {
        this.make = make;
        this.color = color;
        this.isRunning = false;
        this.fuelLevel = fuelLevel;
        this.trunkWidth = trunkWidth; // only on Car
    }
    
    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + this.fuelLevel + ". Is it running? " + this.isRunning);
    }
    
	public static void main(String[] args) {
		
		Car theCar = new Car("Chevrolet", "Cajun Red Tintcoat", 12, 64);
		theCar.isRunning = true;
		
		theCar.printDetails();

	}

}
