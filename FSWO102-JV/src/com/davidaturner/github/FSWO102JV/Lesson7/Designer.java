package com.davidaturner.github.FSWO102JV.Lesson7;

public class Designer extends Employee {

	protected String jobTitle;
	
	public Designer()
	{
		this("", "", "", -1, -1);
		this.jobTitle = "";
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
		return getFirstName() + " " + getLastName() + " has worked at " +
					getCompanyTitle() + " for " + getYearsAtCompany() + " year(s) as a(n) " +
					getJobTitle() + ".";
	}

}
