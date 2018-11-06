package com.davidaturner.github.FSWO102JV.Lesson7;

public class HandsOn7 {

	public void Step1 ()
	{
		System.out.println("STEP 1");
		System.out.println();		

		System.out.println("Employee class examples");
		Employee emp = new Employee("David", "Turner", "Smith Micro", 1, 155228888);
		System.out.println(emp.toString());
		
		Employee initemp = new Employee();
		initemp.setFirstName("David");
		initemp.setCompanyTitle("Smith Micro");
		initemp.setYearsAtCompany(28);
		System.out.println(initemp.toString());

		System.out.println();
		
		System.out.println("Manager, Engineer and Designer subclasses examples");
		Manager man1 = new Manager("David", "Turner", "Smith Micro", 1, 155228888);
		man1.setJobTitle(Employee.JOBTITLE);
		System.out.println(man1.toString());
		
		Manager man2 = new Manager("David", "", "Smith Micro", 1, 155228888, "Employee");
		System.out.println(man2.toString());
		
		Engineer eng1 = new Engineer("David", "Turner", "", 1, 155228888);
		eng1.setJobTitle(Employee.JOBTITLE);
		eng1.setLastName("Furner");
		System.out.println(eng1.toString());
		
		Engineer eng2 = new Engineer("David", "Turner", "Smith Micro", 1, 155228888, "Cool Guy");
		System.out.println(eng2.toString());
		
		Designer des1 = new Designer("David", "Turner", "Smith Micro", 1, 155228888);
		des1.setCompanyTitle("Lazy Bum!");
		des1.setJobTitle(Employee.JOBTITLE);
		System.out.println(des1.toString());
		
		Designer des2 = new Designer("David", "Turner", "Smith Micro", 1, 155228888, "Yummy Treat");
		System.out.println(des2.toString());
		
		System.out.println();		

			
	}
	
	public void Step2 ()
	{
		System.out.println("STEP 2");
		System.out.println();		

		System.out.println("Engineer subclass examples");
		SoftwareEngineer soft1 = new SoftwareEngineer();
		soft1.setFirstName("David");
		soft1.setLastName("Turner");
		soft1.setCompanyTitle("Smith Micro");
		soft1.setYearsAtCompany(1);
		soft1.setJobTitle(Employee.JOBTITLE);
		System.out.println(soft1.toString());
		
		SoftwareEngineer soft2 = new SoftwareEngineer("David", "", "Smith Micro", 1, 155228888, "Oingo Boingo");
		soft2.setFirstName("Bobby");
		soft2.setLastName("Bluebland");
		System.out.println(soft2.toString());
		
		QAEngineer qae1 = new QAEngineer();
		qae1.setFirstName("David");
		qae1.setLastName("Turner");
		qae1.setCompanyTitle("Smith Micro");
		qae1.setYearsAtCompany(1);
		qae1.setJobTitle(Employee.JOBTITLE);
		System.out.println(qae1.toString());
		
		QAEngineer qae2 = new QAEngineer("David", "Turner", "Smith Micro", 1, 155228888, "Yummy Treat");
		qae2.setCompanyTitle("Smith and Wesson");
		System.out.println(qae2.toString());
		
		System.out.println();	
		
		System.out.println("Designer subclass examples");
		MobileDesigner mob1 = new MobileDesigner();
		mob1.setFirstName("David");
		mob1.setLastName("Turner");
		mob1.setCompanyTitle("Smith Micro");
		mob1.setJobTitle(Employee.JOBTITLE);
		System.out.println(mob1.toString());
		
		MobileDesigner mob2 = new MobileDesigner("David", "Turner", "Smith Micro", 1, 155228888, "Muy Loco");
		System.out.println(mob2.toString());
		
		WebDesigner web1 = new WebDesigner();
		web1.setFirstName("David");
		web1.setLastName("Turner");
		web1.setCompanyTitle("Smith Micro");
		web1.setYearsAtCompany(1);
		web1.setYearsAtCompany(22);
		web1.setJobTitle(Employee.JOBTITLE);
		System.out.println(web1.toString());
		
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
		System.out.println("SSN to verify: " + emp.getSSN());
		System.out.println("Verify 1 to HashCode... " + emp.verifySSN(1));
		System.out.println("Verify " + emp.getSSN() + " to HashCode... " + emp.verifySSN(emp.getSSN()));
		
		System.out.println();			
	}
}
