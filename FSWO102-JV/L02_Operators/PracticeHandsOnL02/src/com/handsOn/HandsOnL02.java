package com.handsOn;

public class HandsOnL02 {

	public static void main(String[] args) {

		int age = 13;
		boolean isStudent = true;
		
		// Step 01
		RunStep01(age);
		
		// Step 02
		RunStep02(66, isStudent);
		
		// Step 03
		RunStep03(-1, false);
		
	}
	
	public static void RunStep01(int age) {
		
		// if senior citizen, pay $7
		// if child, pay $8
		// everyone else, pay $10	
		if (age >=0 && age <= 12) {
			System.out.println("You pay $8.");
		} else if (age >=13 && age <= 65) {
			System.out.println("You pay $10.");
		} else {
			System.out.println("You pay $7.");
		}
	}
	
	public static void RunStep02(int age, boolean isStudent) {

		// if senior citizen, pay $7
		// if student, pay $8
		// if child, pay $8
		// everyone else, pay $10
		if (age > 65) {
			System.out.println("You pay $7.");
		} else if (isStudent) {
			System.out.println("You pay $8.");
		} else if (age >= 0 && age <= 12) {
			System.out.println("You pay $8.");
		} else {
			System.out.println("You pay $10.");
		}

	}
	
	public static void RunStep03(int age, boolean isStudent) {
		// What if the age is -1? "Invalid Age".
		if (age < 0) {
			System.out.println("Invalid Age!");
		} else {
			RunStep02(age, isStudent);
		}
	}

}
