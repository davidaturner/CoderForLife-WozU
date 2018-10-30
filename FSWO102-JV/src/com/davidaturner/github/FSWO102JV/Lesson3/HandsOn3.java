package com.davidaturner.github.FSWO102JV.Lesson3;

public class HandsOn3 {

	final int ARRLENGTH = 5;
	
	int [] arr = null;
	public HandsOn3 ()
	{
		arr = readInputIntoArray(ARRLENGTH);
	}

	public void Step1 ()
	{
		if (arr != null)
		{
			System.out.println("Numbers stored: ");
			for(int val : arr)
			{
				System.out.print(val + " ");
			}
			System.out.println();			
		}
		else
		{
			System.out.println("Array not loaded!");
		}
	}	
	public void Step2 ()
	{
		if (arr != null)
		{
			System.out.println("Numbers stored (in reverse): ");
			for(int i=arr.length-1; i>=0; i--)
			{
				int val = arr[i];
				System.out.print(val + " ");
			}
			System.out.println();			
		}
		else
		{
			System.out.println("Array not loaded!");
		}

	}
	public void Step3 ()
	{
		if (arr != null)
		{
			System.out.println("Numbers stored (odd only): ");
			for(int i=0; i<arr.length; i++)
			{
				if ( i%2 != 0)
				{
					int val = arr[i];
					System.out.print(val + " ");				
				}
			}
			System.out.println();			
		}
		else
		{
			System.out.println("Array not loaded!");
		}

	}
	
	public static int[] readInputIntoArray (int arrlength)
	{
		int [] arr = new int[arrlength];
		
		for(int i=0; i<arrlength; i++)
		{
			System.out.print("Enter a Number: ");
			arr[i] = StudentHelper.ReadInputInt();
			System.out.println();
		}
		
		return arr;
	}
	
}


