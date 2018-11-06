package com.davidaturner.github.FSWO102JV.Lesson7;

public class QAEngineer extends Engineer {

	public QAEngineer ()
	{
		super();
		JOBTITLE="QA Engineer";
	}
	public QAEngineer (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN, String jobTitle)
	{
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN, jobTitle);
		JOBTITLE = "QA Engineer";
	}
	
	@Override
	public String toString()
	{
		return "The " + jobTitle + " " + firstName + " " + lastName + " has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s).";
	}


}
