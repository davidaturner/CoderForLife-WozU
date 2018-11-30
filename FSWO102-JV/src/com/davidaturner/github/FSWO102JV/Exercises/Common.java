package com.davidaturner.github.FSWO102JV.Exercises;

public class Common {

	public static int OUT_OF_BOUNDS= -1;
	
	public static void printArray( int[]array, String prompt)
	{
		if (array == null || array.length <= 0)
		{
			return;
		}
		
		if (prompt != null)
		{
			System.out.print(prompt);
		}
		for(int val : array)
		{
			System.out.print(val + " ");
		}
		
		System.out.println();
	}
	
	public static void printValue( int value, String prompt)
	{		
		if (prompt != null)
		{
			System.out.print(prompt);
		}
		System.out.println(value);
		System.out.println();
		
	}
}
