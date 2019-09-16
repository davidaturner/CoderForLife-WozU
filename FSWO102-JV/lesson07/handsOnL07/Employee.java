package handsOnL07;

public class Employee {

	public String firstName;
	public String lastName;
	public String companyName;
	private int yearsAtCompany;
	
	public Employee () {
		this("","","",-1);
	}
	public Employee(String firstName, String lastName, String companyName, int yearsAtCompany) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.yearsAtCompany = yearsAtCompany;
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getYearsAtCompany() {
		return yearsAtCompany;
	}

	public void setYearsAtCompany(int yearsAtCompany) {
		this.yearsAtCompany = yearsAtCompany;
	}
/*	
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", yearsAtCompany=" + yearsAtCompany + "]";
	}
*/
	@Override
	public String toString() {		
		return firstName + " " + lastName + " has worked at " + companyName + " for " + yearsAtCompany + 
				" year(s).";
	}

	public static void main(String[] args) {

//		Employee emp = new Employee("John", "Smith", "Acme, Inc.", 2);
		Employee emp = new Employee();
		emp.setFirstName("John");
		emp.setLastName("Smith");
		emp.setCompanyName("Acme, Inc.");
		emp.setYearsAtCompany(2);
		
		System.out.println(emp.toString());
	}
	
}
