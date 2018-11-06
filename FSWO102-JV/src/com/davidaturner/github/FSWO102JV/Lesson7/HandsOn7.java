package com.davidaturner.github.FSWO102JV.Lesson7;

public class HandsOn7 {

	public void Step1 ()
	{
		System.out.println("STEP 1");
		System.out.println();		

		System.out.println("Employee 1");
		Employee emp = new Employee("David", "Turner", "Smith Micro", 1, 155228888);
		System.out.println(emp.toString());
		
		System.out.println("Employee 2");
		Employee initemp = new Employee();
		initemp.setFirstName("David");
		initemp.setCompanyTitle("Smith Micro");
		initemp.setYearsAtCompany(28);
		System.out.println(initemp.toString());

		
		System.out.println("Manager 1");
		Manager man1 = new Manager("David", "Turner", "Smith Micro", 1, 155228888);
		man1.setJobTitle(Employee.JOBTITLE);
		System.out.println(man1.toString());
		
		System.out.println("Manager 2");
		Manager man2 = new Manager("David", "Turner", "Smith Micro", 1, 155228888, "Employee");
		System.out.println(man2.toString());
		
		System.out.println("Engineer 1");
		Engineer eng1 = new Engineer("David", "Turner", "Smith Micro", 1, 155228888);
		eng1.setJobTitle(Employee.JOBTITLE);
		System.out.println(eng1.toString());
		
		System.out.println("Engineer 2");
		Engineer eng2 = new Engineer("David", "Turner", "Smith Micro", 1, 155228888, "Cool Guy");
		System.out.println(eng2.toString());
		
		System.out.println("Designer 1");
		Designer des1 = new Designer("David", "Turner", "Smith Micro", 1, 155228888);
		des1.setJobTitle(Employee.JOBTITLE);
		System.out.println(des1.toString());
		
		System.out.println("Designer 2");
		Designer des2 = new Designer("David", "Turner", "Smith Micro", 1, 155228888, "Yummy Treat");
		System.out.println(des2.toString());
		
		System.out.println();		

			
	}
	
	public void Step2 ()
	{
		System.out.println("STEP 2");
		System.out.println();		

		System.out.println("Software Engineer 1");
		SoftwareEngineer soft1 = new SoftwareEngineer();
		soft1.setFirstName("David");
		soft1.setLastName("Turner");
		soft1.setCompanyTitle("Smith Micro");
		soft1.setYearsAtCompany(1);
		soft1.setJobTitle(Employee.JOBTITLE);
		System.out.println(soft1.toString());
		
		System.out.println("Software Engineer 2");
		SoftwareEngineer soft2 = new SoftwareEngineer("David", "Turner", "Smith Micro", 1, 155228888, "Oingo Boingo");
		System.out.println(soft2.toString());
		
		System.out.println("QA Engineer 1");
		QAEngineer qae1 = new QAEngineer();
		qae1.setFirstName("David");
		qae1.setLastName("Turner");
		qae1.setCompanyTitle("Smith Micro");
		qae1.setYearsAtCompany(1);
		qae1.setJobTitle(Employee.JOBTITLE);
		System.out.println(qae1.toString());
		
		System.out.println("QA Engineer 2");
		QAEngineer qae2 = new QAEngineer("David", "Turner", "Smith Micro", 1, 155228888, "Yummy Treat");
		System.out.println(qae2.toString());
		
		System.out.println("Mobile Designer 1");
		MobileDesigner mob1 = new MobileDesigner();
		mob1.setFirstName("David");
		mob1.setLastName("Turner");
		mob1.setCompanyTitle("Smith Micro");
		mob1.setYearsAtCompany(1);
		mob1.setJobTitle(Employee.JOBTITLE);
		System.out.println(mob1.toString());
		
		System.out.println("Mobile Designer 2");
		MobileDesigner mob2 = new MobileDesigner("David", "Turner", "Smith Micro", 1, 155228888, "Muy Loco");
		System.out.println(mob2.toString());
		
		System.out.println("Web Designer 1");
		WebDesigner web1 = new WebDesigner();
		web1.setFirstName("David");
		web1.setLastName("Turner");
		web1.setCompanyTitle("Smith Micro");
		web1.setYearsAtCompany(1);
		web1.setJobTitle(Employee.JOBTITLE);
		System.out.println(web1.toString());
		
		System.out.println("Web Designer 2");
		WebDesigner web2 = new WebDesigner("David", "Turner", "Smith Micro", 1, 155228888, "Tomcatt");
		System.out.println(web2.toString());
		
		System.out.println();		

	}
	
	public void Step3 ()
	{
		System.out.println("STEP 3");
		System.out.println();		

		System.out.println("Employee 1");
		Employee emp = new Employee("David", "Turner", "Smith Micro", 1, 155228888);
		System.out.println(emp.toString());
		System.out.println();
		System.out.println("Verify 1 to HashCode... " + emp.verifySSN(1));
		System.out.println("Verify " + emp.getSSN() + " to HashCode... " + emp.verifySSN(emp.getSSN()));
		
		System.out.println();			
	}
}
