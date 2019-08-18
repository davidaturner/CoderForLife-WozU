package lesson07;

public abstract class Vehicle {
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
        System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + 
        					this.fuelLevel + ". Is it running? " + this.isRunning);
    }
}

