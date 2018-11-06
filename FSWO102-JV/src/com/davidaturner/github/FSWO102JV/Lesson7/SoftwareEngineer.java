package com.davidaturner.github.FSWO102JV.Lesson7;

public class SoftwareEngineer extends Engineer {

	public SoftwareEngineer ()
	{
		super();
		JOBTITLE="Software Engineer";
	}
	public SoftwareEngineer (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN, jobTitle);
		JOBTITLE = "Software Engineer";
	}
	
	@Override
	public String toString()
	{
		return "The " + getJobTitle() + " " + getFirstName() + " " + getLastName() + " has worked at " +
					getCompanyTitle() + " for " + getYearsAtCompany() + " year(s).";
	}


}
