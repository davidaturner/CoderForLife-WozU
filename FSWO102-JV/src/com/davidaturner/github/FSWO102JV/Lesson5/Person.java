package com.davidaturner.github.FSWO102JV.Lesson5;

public class Person {

		private String firstName;
		private String lastName;
		private int age;
		
		// Chaining constructors.
		public Person()
		{
			this("");			
		}		
		public Person(String firstName)
		{
			this(firstName, "");			
		}		
		public Person(String firstName, String lastName)
		{
			this(firstName, lastName, 0);
		}
		
		/* Old way! Bad way!
		public Person()
		{
			initialize();
		}	
		private void initialize()
		{
			firstName = "";
			lastName = "";
			age = 0;			
		}
		
		public Person(String firstName)
		{
			initialize();
			this.firstName = firstName;
			
		}	
		public Person(String firstName, String lastName)
		{
			initialize();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		*/
		public Person(String firstName, String lastName, int age)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = checkedAge(age);
		}

		private int checkedAge(int age)
		{
			if (age < 0)
			{
				System.out.println(">>>Attempting to set age to an Invalid value!");
				System.out.println(">>>Setting age to 0...");
				System.out.println();
				return 0;
			}
			
			return age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			
			this.age = checkedAge(age);
		}
				
		public void describe()
		{
			System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
			System.out.println("Age: " + this.getAge());
			System.out.println();
		}
}
