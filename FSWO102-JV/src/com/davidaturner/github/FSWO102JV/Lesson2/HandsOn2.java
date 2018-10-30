package com.davidaturner.github.FSWO102JV.Lesson2;

public class HandsOn2 {

	static public void Step1()
	{
		boolean isStudent = false;
		
		System.out.println("You want a ticket and you are 0 years old?");
		makeDecision(0, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket and you are 6 years old?");
		makeDecision(6, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket and you are 12 years old?");
		makeDecision(12, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket and you are 13 years old?");
		makeDecision(13, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket and you are 64 years old?");
		makeDecision(64, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket and you are 65 years old?");
		makeDecision(65, isStudent);
		System.out.println();
	}
	
	static public void Step2()
	{
		boolean isStudent = false;
		
		System.out.println("You want a ticket, you are 0 years and not a Student?");
		makeDecision(0, isStudent);
		System.out.println();
		isStudent = true;
		
		System.out.println("You want a ticket, you are 6 years and a Student?");
		makeDecision(6, isStudent);
		System.out.println();
		
		System.out.println("You want a ticket, you are 13 years and a Student?");
		makeDecision(13, true);
		System.out.println();
		
		System.out.println("You want a ticket, you are 14 years and not a Student?");
		makeDecision(14, false);
		System.out.println();
		
		System.out.println("You want a ticket, you are 64 years and a Student?");
		makeDecision(64, true);
		System.out.println();
		
		System.out.println("You want a ticket, you are 66 years and a Student?");
		makeDecision(66, true);	
		System.out.println();
		
	}
	
	static public void Step3()
	{
		makeDecision(-1, false);	
		makeDecision(-1, true);	
	}
	
	static public void makeDecision(int age, boolean isStudent)
	{
		if (age < 0)
		{
			System.out.println("Invalid age value!");			
		}
		else if (age >= 65)
		{
			System.out.println("You pay 7 dollars.");
		}
		else if ( age >= 0 && (age <= 12 || isStudent))
		{
			System.out.println("You pay 8 dollars.");
		}
		else
		{
			System.out.println("You pay 10 dollars.");
		}
	}
}
