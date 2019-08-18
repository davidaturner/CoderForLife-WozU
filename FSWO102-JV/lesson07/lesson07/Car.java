package lesson07;

public class Car extends Vehicle {

    int trunkWidth;

    public Car(String make, String color, int fuelLevel, int trunkWidth) {
        super(make, color, fuelLevel);
        this.trunkWidth = trunkWidth;
    }

    @Override
    public void printDetails() {
        System.out.println("The " + this.color + " " + this.make + " has a trunk width of " + 
        				this.trunkWidth + " and has a fuel level of " + this.fuelLevel + ". Is it running? " + 
        		((this.isRunning)?"yes":"no"));
    }


	public static void main(String[] args) {
		
		Car mycar = new Car("Subaru", "gray", 1, 40);
		mycar.printDetails();

	}

}
