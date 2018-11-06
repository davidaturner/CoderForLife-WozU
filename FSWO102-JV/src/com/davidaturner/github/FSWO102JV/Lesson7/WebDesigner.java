package com.davidaturner.github.FSWO102JV.Lesson7;

public class WebDesigner extends Designer {

	public WebDesigner ()
	{
		super();
		JOBTITLE="Web Designer";
	}
	public WebDesigner (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN, jobTitle);
		JOBTITLE = "Web Designer";
	}
	
	@Override
	public String toString()
	{
		return "The " + jobTitle + " " + firstName + " " + lastName + " has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s).";
	}


}
