package com.davidaturner.github.FSWO102JV.Lesson7;

public class Employee {

	private String firstName;
	private String lastName;
	private String companyTitle;
	private int yearsAtCompany;
	private int SSN;
	
	public static String JOBTITLE;
	
	public Employee()
	{
		this("", "", "", -1, -1);
		JOBTITLE = "Employee";
		
	}
	
	public Employee(String firstName, String lastName, String companyTitle,
			int yearsAtCompany, int SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyTitle = companyTitle;
		this.yearsAtCompany = yearsAtCompany;
		this.SSN = SSN;		
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		if (this.firstName == "")
		{
			this.firstName = firstName;			
		}
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		if (this.lastName == "")
		{
			this.lastName = lastName;			
		}
	}
	public String getCompanyTitle()
	{
		return companyTitle;
	}
	public void setCompanyTitle(String companyTitle)
	{
		if (this.companyTitle == "")
		{
			this.companyTitle = companyTitle;			
		}

	}
	public int getYearsAtCompany()
	{
		return yearsAtCompany;
	}
	public void setYearsAtCompany(int yearsAtCompany)
	{
		if (this.yearsAtCompany == -1)
		{
			this.yearsAtCompany = yearsAtCompany;			
		}
	}
	public int getSSN()
	{
		return SSN;
	}
	public void setSSN(int SSN)
	{
		if (this.SSN == -1)
		{
			this.SSN = SSN;
		}
	}

	public boolean verifySSN(int SSN)
	{
		return (Integer.hashCode(SSN) == hashCode())? true : false;
	}
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName + " has worked at " +
					companyTitle + " for " + yearsAtCompany + " year(s).";
	}
	
	@Override
	public int hashCode(){
	    
	    return Integer.hashCode(SSN);
	}
}
