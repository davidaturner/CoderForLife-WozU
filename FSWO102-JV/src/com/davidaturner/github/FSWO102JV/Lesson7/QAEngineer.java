package com.davidaturner.github.FSWO102JV.Lesson7;

public class QAEngineer extends Engineer {

	public QAEngineer ()
	{
		this("", "", "", -1, -1, "");
	}
	public QAEngineer (String firstName, String lastName, String companyTitle, 
			int yearsAtCompany, int SSN)
	{
		this(firstName, lastName, companyTitle, -1, -1, "");
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
		return "The Engineer, " + firstName + " " + lastName + ", has worked at " +
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " +
				jobTitle + ".";
	}


}
