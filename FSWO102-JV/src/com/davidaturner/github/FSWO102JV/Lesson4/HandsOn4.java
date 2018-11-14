package com.davidaturner.github.FSWO102JV.Lesson4;

import java.util.Scanner;

public class HandsOn4 {

	public static int value;
	public static int times;
	
	public HandsOn4 ()
	{
		System.out.print("Enter Value(Number>0) : ");		
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();		
	}
	
	public static void Step1 ()
	{
		System.out.println("Step 1");
		System.out.println();
		
		System.out.println(value);
		System.out.println( doubleMe(value));
		System.out.println();

	}
	public static void Step2 ()
	{
		System.out.println("Step 2");
		System.out.println();
		
		System.out.println(value);
		System.out.println( quadrupleMe(value));
		System.out.println();
	
	}
	public static void Step3 ()
	{
		System.out.println("Step 3");
		System.out.println();
		
		System.out.print("Enter Times(Number>0): ");
		Scanner sc = new Scanner(System.in);
		times = sc.nextInt();
		System.out.println(value);
		System.out.println( doubleMeTimes(value, times));
		System.out.println();
		
	}
	
	
	public static int doubleMe(int value)
	{		
		System.out.print("Doubling... ");
		int result = 2 * value;
		System.out.println(result);
		return result;
	}
	
	public static int quadrupleMe(int value)
	{
		return doubleMe( doubleMe(value));
	}
	
	public static int doubleMeTimes(int value, int times)
	{
		int result = value;
		if (value <= 0 || times <=0)
		{
			System.out.println("Invalid input!");
			return 0;
		}
		for(int i=0; i < times; i++)
		{
			result = doubleMe(result);
		}
		return result;
	}
	
}
