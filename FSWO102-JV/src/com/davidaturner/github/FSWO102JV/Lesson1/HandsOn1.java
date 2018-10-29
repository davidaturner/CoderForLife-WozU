package com.davidaturner.github.FSWO102JV.Lesson1;

public class HandsOn1 {

	
	static public void Step1 ()
	{
		boolean isSunny = true;
		if (isSunny)
		{
			System.out.println("Wear Sunglasses!");
		}
		else
		{
			System.out.println("Do not wear Sunglasses.");
		}
	}
	
	static public void Step2 ()
	{
		boolean isSunny = true;
		boolean atBeach = true;
		if (isSunny)
		{
			System.out.println("Wear Sunglasses!");
			if (atBeach)
			{
				System.out.println("Wear Sunblock!");
			}
			else 
			{
				System.out.println("Don't need Sunblock.");
			}
		}
		else
		{
			System.out.println("Do not wear Sunglasses.");
		}		
	}
	
	static public void Step3 ()
	{
		System.out.println("isSunny = true, atBeach = true");
		makeDecision(true, true);
		System.out.println();
		
		System.out.println("isSunny = true, atBeach = false");
		makeDecision(true, false);
		System.out.println();
		
		System.out.println("isSunny = false, atBeach = true");
		makeDecision(false, true);
		System.out.println();
		
		System.out.println("isSunny = false, atBeach = false");
		makeDecision(false, false);
		System.out.println();
	}
	
	static public void makeDecision (boolean isSunny, boolean atBeach)
	{
		if (isSunny)
		{
			System.out.println("Wear Sunglasses!");
			if (atBeach)
			{
				System.out.println("Wear Sunblock!");
			}
			else 
			{
				System.out.println("Don't need Sunblock.");
			}
		}
		else
		{
			System.out.println("Do not wear Sunglasses.");
			if (atBeach)
			{
				System.out.println("Come back tomorrow.");
			}
			else 
			{
				System.out.println("Don't go to the Beach");
			}
		}			
	}
}
