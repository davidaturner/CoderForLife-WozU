
public class Vehicle {

    String make;
    String color;
    boolean isRunning;
    int fuelLevel;

    public Vehicle(String make, String color, int fuelLevel) {
        this.make = make;
        this.color = color;
        this.isRunning = false;
        this.fuelLevel = fuelLevel;
    }

    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + this.fuelLevel + ". Is it running? " + this.isRunning);
    }
    
    // static method
    // example of polymorphism
    // v.color
    public static void printVehicleColor(Vehicle v) {
        String vehicleColor = v.color;
        System.out.println(vehicleColor);
    }
    
    // static method
    public static void printTotalFuelLevel(Vehicle[] vehicles) {
        int total = 0;
        for(Vehicle v : vehicles) {
            total += v.fuelLevel;
        }
        System.out.println(total);
    }
    
    
	public static void main(String[] args) {
	    Vehicle vehicle = new Vehicle("AcmeVehicle", "Gray", 5);
	    vehicle.printDetails();
	    Vehicle.printVehicleColor(vehicle);

	    Car car = new Car("AcmeCar", "Black", 15, 10);
	    car.printDetails();
	    printVehicleColor(car);

	    Truck truck = new Truck("AcmeTruck", "White", 25, 20);
	    truck.printDetails();
	    printVehicleColor(truck);
	    
	    // operation to total fuel levels of vehicles
	    Vehicle[] vehicles = { vehicle, car, truck };
	    printTotalFuelLevel(vehicles);
	}

}
