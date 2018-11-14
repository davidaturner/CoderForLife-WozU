package com.davidaturner.github.FSWO102JV.Lesson7;

public class WebDesigner extends Designer {

	public WebDesigner ()
	{
		this("", "", "", -1, -1, "");
	}
	public WebDesigner (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, -1, -1, "");
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
		return "The Designer, " + firstName + " " + lastName + ", has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
				jobTitle + ".";
	}


}
