package com.davidaturner.github.FSWO102JV.Lesson7;

public class Designer extends Employee {

	protected String jobTitle;
	
	public Designer()
	{
		this("", "", "", -1, -1, "");
	}
	public Designer(String firstName, String lastName, String companyTitle,
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, yearsAtCompany, SSN, "");
	}	
	public Designer(String firstName, String lastName, String companyTitle,
						int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		this.jobTitle = jobTitle;
		
		JOBTITLE = "Designer";
	}

	// TODO Move duplicate code to parent - Employee
	public String getJobTitle()
	{
		return jobTitle;
	}
	public void setJobTitle(String jobTitle)
	{
		if (this.jobTitle == "")
		{
			this.jobTitle = jobTitle;
		}
	}
	
	@Override
	public String toString()
	{
		return "The Employee, " + firstName + " " + lastName + ", has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
				jobTitle + ".";
	}

}
