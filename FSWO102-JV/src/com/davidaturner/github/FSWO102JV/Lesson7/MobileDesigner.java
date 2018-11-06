package com.davidaturner.github.FSWO102JV.Lesson7;

public class MobileDesigner extends Designer {

	public MobileDesigner ()
	{
		this("", "", "", -1, -1, "");
	}
	public MobileDesigner (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, -1, -1, "");
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
		return "The Designer, " + firstName + " " + lastName + ", has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
				jobTitle + ".";
	}


}
