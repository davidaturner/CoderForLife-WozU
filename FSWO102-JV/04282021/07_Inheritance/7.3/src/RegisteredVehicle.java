
public class RegisteredVehicle extends Vehicle {

	protected String licensePlate;
	
	public RegisteredVehicle(String model, String color, int fuelLevel, String licensePlate) {
		super(model, color, fuelLevel);
		this.licensePlate = licensePlate;
	}
	
	public int hashCode() {
	    // convert the String license plate to an integer
	    int hash = Integer.decode(this.licensePlate);
	    return hash;
	}
	
	public static void main(String[] args) {
		
	        // string here given the value of 64
	        String nstr = "0100";
	  
	        // Returns an Integer object holding the int value.
	        // in Hex = 64. WHEN WILL THIS BE NEEDED????
	        System.out.println("Actual Integral Number = " +
	        Integer.decode(nstr));
	        
	        // Different value is using hexadecimal.
	        // in Decimal. Remove leading zeroes = 100.
	        System.out.println("Parsing String Number = " + 
	        Integer.parseInt(nstr));

	}

}
