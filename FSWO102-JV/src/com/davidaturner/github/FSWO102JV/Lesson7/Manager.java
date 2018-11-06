package com.davidaturner.github.FSWO102JV.Lesson7;

public class Manager extends Employee {
	
	protected String jobTitle;
		
	public Manager()
	{
		this("", "", "", -1, -1);
		this.jobTitle = "";
	}
	public Manager(String firstName, String lastName, String companyTitle,
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, yearsAtCompany, SSN, "");
	}	
	public Manager(String firstName, String lastName, String companyTitle,
						int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		this.jobTitle = jobTitle;
		JOBTITLE = "Manager";
	}
	
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
		return firstName + " " + lastName + " has worked at " +
					companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
					jobTitle + ".";
	}

}
