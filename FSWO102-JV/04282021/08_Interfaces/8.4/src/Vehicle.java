
public class Vehicle {

	protected String make;
	protected String color;
	protected int fuelLevel;
	protected boolean isRunning;
	

	public Vehicle(String make, String color, int fuelLevel) {
		super();
		this.make = make;
		this.color = color;
		this.fuelLevel = fuelLevel;
	}

	public void printDetails() {
		System.out.println("Details of a Vehicle.");
	}
	
	// getter and setters
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Toyota Camry", "Blue", 12);
		vehicle.printDetails();
		
		Car car = new Car("Honda Accord", "Blue", 12);
		car.printDetails();
		
		Truck truck = new Truck("Chrysler Rambler", "Blue", 12);
		truck.printDetails();
		
		Vehicle truckAsAVehicle = (Vehicle)truck;
		truckAsAVehicle.printDetails();				// Still, details of a truck.

	}

}
