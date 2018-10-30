package com.davidaturner.github.FSWO102JV.Lesson5;

public class HandsOn5 {

	public void Step1 ()
	{
		System.out.println("STEP 1");
		
		Person person = new Person();
		person.setFirstName("David");
		person.setLastName("Green");
		
		person.describe();
		
		System.out.println("Updating Person information...");
		System.out.println("Update lastName to 'Turner'");
		System.out.println("Update age to '56'");
		System.out.println("Corrected!");
		System.out.println();
		
		person.setLastName("Turner");
		person.setAge(56);

		person.describe();
	}
	
	
	public void Step2 ()
	{
		System.out.println("STEP 2");
		
		Person firstPerson = new Person("David");
		Person secondPerson = new Person("David", "Turner");
		Person thirdPerson = new Person("David", "Turner", 56);
		
		System.out.println("New Membership Information: ");
		System.out.println("Person(fn)");
		firstPerson.describe();
		System.out.println("Person(fn, ln)");
		secondPerson.describe();
		System.out.println("Person(fn, ln)");
		System.out.println("Person(age)");
		thirdPerson.describe();
		
	}
	
	public void Step3 ()
	{
		System.out.println("STEP 3");
		
		System.out.println("Creating Person of age -10");
		Person thirdPerson = new Person("David", "Turner", -10);
		System.out.println("Person(fn, ln)");
		System.out.println("Person(age)");
		thirdPerson.describe();
		
		System.out.println("Resetting age to -1!");
		thirdPerson.setAge(-1);
		System.out.println("Person(fn, ln)");
		System.out.println("Person(age)");
		thirdPerson.describe();		
		
	}
}
