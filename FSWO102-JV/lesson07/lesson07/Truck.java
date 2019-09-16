package lesson07;

public class Truck extends Vehicle {

    int flatbedLength;

    public Truck(String make, String color, int fuelLevel, int flatbedLength) {
        super(make, color, fuelLevel);
        this.flatbedLength = flatbedLength;
    }

    @Override
    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a flatbed length of " + 
        					this.flatbedLength + " and a fuel level of " + this.fuelLevel + ". Is it running? " +
        	        		((this.isRunning)?"yes":"no"));
    }

    public static void main(String[] args) {
    	Truck truck = new Truck("Dodge F150", "red", 8, 80);
    	truck.isRunning = true;
    	truck.printDetails();

    }

}
