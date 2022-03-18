public class Employee {
    // mandatory parameters
    private String firstName;
    private String lastName;
    private String jobTitle;
    private float salary;

    // optional parameters
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;
    
	private Employee(EmployeeBuilder builder) {
	    this.firstName = builder.firstName;
	    this.lastName = builder.lastName;
	    this.jobTitle = builder.jobTitle;
	    this.salary = builder.salary;
	    this.streetAddress = builder.streetAddress;
	    this.city = builder.city;
	    this.state = builder.state;
	    this.zipCode = builder.zipCode;
	    this.phoneNumber = builder.phoneNumber;
	}
	
	// EmployeeBuilder class, nested within Employee class
	public static class EmployeeBuilder {
	    // mandatory
	    private String firstName;
	    private String lastName;
	    private String jobTitle;
	    private float salary;

	    // optional
	    private String streetAddress;
	    private String city;
	    private String state;
	    private int zipCode;
	    private String phoneNumber;

	    public EmployeeBuilder(String firstName, String lastName, String jobTitle, float salary) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }

	    public EmployeeBuilder setStreetAddress(String streetAddress) {
	        this.streetAddress = streetAddress;
	        return this;
	    }

	    public EmployeeBuilder setCity(String city) {
	        this.city = city;
	        return this;
	    }

	    public EmployeeBuilder setState(String state) {
	        this.state = state;
	        return this;
	    }

	    public EmployeeBuilder setZip(int zipCode) {
	        this.zipCode = zipCode;
	        return this;
	    }

	    public EmployeeBuilder setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	        return this;
	    }
	    
        // last method in `EmployeeBuilder` class
        public Employee build() {
            return new Employee(this);
        }
	}
	
	public static void main(String[] args) {
		
	    // simple Employee object using only mandatory parameters
	    Employee johnEmployee = new Employee.EmployeeBuilder("John", "Smith", "Writer", 50000f).build();
	    System.out.println(
	    		johnEmployee.firstName + " " + johnEmployee.lastName+ " makes " + 
	    				johnEmployee.salary + " as a " + johnEmployee.jobTitle);

	    // complex Employee object using additional setters from EmployeeBuilder class
	    Employee patEmployee = new Employee.EmployeeBuilder("Pat", "Green", "Chemist", 70000f)
	    		.setPhoneNumber("555-123-4567").setStreetAddress("123 Alphabet St.").setCity("Tempe")
	    		.setState("Arizona").setZip(85281).build();
	    System.out.println(patEmployee.firstName + " " + patEmployee.lastName + " makes " + 
	    		patEmployee.salary + " as a " + patEmployee.jobTitle + " and lives in " + 
	    		patEmployee.city + ", " + patEmployee.state);

	}
}