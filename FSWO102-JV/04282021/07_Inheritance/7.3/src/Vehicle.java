
public class Vehicle {
	
    protected String make;
    protected String color;
    protected boolean isRunning;
    protected int fuelLevel;

    public Vehicle() {    	
    }
    
    public Vehicle(String model, String color, int fuelLevel) {
        this.make = model;
        this.color = color;
        this.isRunning = false;
        this.fuelLevel = fuelLevel;
    }

    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + 
        					this.fuelLevel + ". Is it running? " + this.isRunning);
    }

    final public void start() {
        isRunning = true;
    }
	public static void main(String[] args) {
		
	    Vehicle vehicle = new Vehicle("AcmeVehicle", "Gray", 5);
	    vehicle.printDetails();

	    Car car = new Car("AcmeCar", "Black", 15, 10);
	    car.printDetails();

	    Truck truck = new Truck("AcmeTruck", "White", 25, 20);
	    truck.printDetails();

	}

}
