package handsOnL07;

public class Manager extends Employee {

	public String jobTitle;
	
	// Constructors.
	public Manager() {
		super();
		jobTitle = "";
	}
	public Manager(String firstName, String lastName, String companyName, int yearsAtCompany, String jobTitle) {
		super(firstName, lastName, companyName, yearsAtCompany);
		this.jobTitle = jobTitle;
	}
	
	// Getters and Setters.
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		int baseclassstrlen = super.toString().length();
		return super.toString().substring(0, baseclassstrlen-1) + " as a(n) " + jobTitle + " Manager.";
	}
	

	
	
	public static void main(String[] args) {
		
		// Manager man = new Manager("John", "Smith", "Acme, Inc.", 2, "Widgit Box");
		Manager man = new Manager();
		man.setFirstName("John");
		man.setLastName("Smith");
		man.setCompanyName("Acme, Inc.");
		man.setYearsAtCompany(2);
		man.setJobTitle("Widgit Gadget");
		
		System.out.println(man.toString());

	}

}
