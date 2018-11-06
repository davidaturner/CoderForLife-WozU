package com.davidaturner.github.FSWO102JV.Lesson7;

public class Engineer extends Employee {
	
	protected String jobTitle;
	
	public Engineer()
	{
		this("", "", "", -1, -1, "");
	}
	public Engineer(String firstName, String lastName, String companyTitle,
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, yearsAtCompany, SSN, "");
	}	
	public Engineer(String firstName, String lastName, String companyTitle,
						int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		this.jobTitle = jobTitle;
		
		JOBTITLE = "Engineer";
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
