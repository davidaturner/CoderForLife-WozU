
public class Car extends Vehicle {

    int trunkWidth;

    public Car(String make, String color, int fuelLevel, int trunkWidth) {
        super(make, color, fuelLevel);
        this.trunkWidth = trunkWidth;
    }
    
	public static void main(String[] args) {
		
		Car theCar = new Car("Chevrolet", "Cajun Red Tintcoat", 12, 64);
		theCar.isRunning = true;
		
		theCar.printDetails();

	}

}
