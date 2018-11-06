package com.davidaturner.github.FSWO102JV.Lesson7;

public class SoftwareEngineer extends Engineer {

	public SoftwareEngineer ()
	{
		this("", "", "", -1, -1, "");
	}
	public SoftwareEngineer (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, -1, -1, "");
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
		return "The Engineer, " + firstName + " " + lastName + ", has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
				jobTitle + ".";
	}


}
