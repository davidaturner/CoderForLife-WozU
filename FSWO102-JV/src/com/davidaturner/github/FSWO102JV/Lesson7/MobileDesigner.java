package com.davidaturner.github.FSWO102JV.Lesson7;

public class MobileDesigner extends Designer {

	public MobileDesigner ()
	{
		super();
		JOBTITLE="Mobile Designer";
	}
	public MobileDesigner (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN, jobTitle);
		JOBTITLE = "Mobile Designer";
	}
	
	@Override
	public String toString()
	{
		return "The " + jobTitle + " " + firstName + " " + lastName + " has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s).";
	}


}
