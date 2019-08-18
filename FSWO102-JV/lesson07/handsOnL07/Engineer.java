package handsOnL07;

public class Engineer extends Employee {

	public String jobTitle;
	
	// Constructors.
	public Engineer() {
		super();
		jobTitle = "";
	}
	public Engineer(String firstName, String lastName, String companyName, int yearsAtCompany, String jobTitle) {
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
		return super.toString().substring(0, baseclassstrlen-1) + " as a(n) " + jobTitle + " Engineer.";
	}
	

	
	
	public static void main(String[] args) {
		
//		Engineer eng = new Engineer("John", "Smith", "Acme, Inc.", 2, "Widgit Box");
		Engineer eng = new Engineer();
		eng.setFirstName("John");
		eng.setLastName("Smith");
		eng.setCompanyName("Acme, Inc.");
		eng.setYearsAtCompany(2);
		eng.setJobTitle("Widgit Gadget");
		
		System.out.println(eng.toString());

	}

}
