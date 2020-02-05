package com.davidaturner.l05;

public class HandsOnL05 {

	public static void main(String[] args) {
		
		RunStep01();
		System.out.println();
		
		RunStep02();
		System.out.println();
		
		RunStep03();
		System.out.println();

	}

	private static void print(String message) {
		System.out.println(message);
	}
	
	public static void RunStep01() {
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Q");
		person.setAge(45);
		
		print(person.toString());
	}
	public static void RunStep02() {
		Person person1 = new Person("Jerry");
		Person person2 = new Person("James", "Poulenc");
		Person person3 = new Person("Frank", "Stabenow", 46);
		
		print(person1.toString());
		print(person2.toString());
		print(person3.toString());
		
	}
	public static void RunStep03() {
		
		Person benjaminButton = new Person();
		benjaminButton.setLastName("Button");
		benjaminButton.setAge(-23);
		print(benjaminButton.toString());
	}
}
