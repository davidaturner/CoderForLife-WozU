package com.davidaturner.l05;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		this(null, null, 0);
	}
	public Person(String firstName) {
		this(firstName, null);
	}
	public Person(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		checkAge(age);
	}
	
	@Override
	public String toString() {
		return "Name: " + ((firstName != null)? firstName + " " : "") 
				+ ((lastName != null)? lastName + " " : "") 
				+ "Age: " + age;
	}
	private void checkAge(int age) {
		if (age < 0) {
			this.age = 0;
			System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
		}
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
		this.age = age;
		checkAge(age);
	}
}
