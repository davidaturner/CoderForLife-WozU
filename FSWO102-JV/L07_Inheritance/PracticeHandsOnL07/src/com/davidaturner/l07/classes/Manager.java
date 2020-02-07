package com.davidaturner.l07.classes;

public class Manager extends Employee {

	public String jobTitle;
	
	public Manager() {
		this("", "", "", -1, "");
	}
	
	public Manager(String firstName, String lastName, String companyName, 
			int yearsAtCompany, String jobTitle) {
		super(firstName, lastName, companyName, yearsAtCompany);
		this.jobTitle = jobTitle;
	}

	// Getters and Setters
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + 
				" has worked at " + companyName + 
				" for " + getYearsAtCompany() + 
				" year(s) as a(an) " + jobTitle + ".";
	}
}
