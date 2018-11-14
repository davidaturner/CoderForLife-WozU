package com.davidaturner.github.FSWO102JV.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	// Exercise 1:
	// Find the Primary Element/Value in an array of integers.
	// A Primary Element is any value that takes up n/2 slots or more in an array. 
	
	public static int[] arr = {3, 1, 3, 1, 2, 3, 2, 3};
	public static int n2 = 4;
	public static int track = 0;
	
	public static void main(String[] args) {
		
		// Draft 3
		List<Integer> arrList = new ArrayList<Integer> ();
		for(int val : arr)
		{
			arrList.add(val);
		}
		printArr("In Array List: ", arrList);
		System.out.println();
		System.out.println("Primary Element found : " + determinePrimaryElement(arrList));
		
		// Drafts 1 and 2.
//		printArr("In Array: ", arr);
//		System.out.println();
//		System.out.println("Primary Element found : " + determinePrimaryElement());
	}

	public static void printArr (String prompt, int[] array)
	{
		if (prompt != null && !prompt.isEmpty())
		{
			System.out.print(prompt + " ");
		}
		for(int val : array)
		{
			System.out.print(val + " ");
		}
		System.out.println();
	}
	public static void printArr (String prompt, List<Integer> array)
	{
		if (prompt != null && !prompt.isEmpty())
		{
			System.out.print(prompt + " ");
		}
		if (array != null && array.size() > 0)
		{
			for(int val : array)
			{
				System.out.print(val + " ");
			}			
		}
		System.out.println();
	}
	public static int determinePrimaryElement(List<Integer> arrList)
	{
		return determinePrimaryElementDraft3(arrList);
	}
	public static int determinePrimaryElement()
	{
		return determinePrimaryElementDraft2();
//		return determinePrimaryElementDraft1();
	}
	
	// DRAFT 1: Find recursive function that works.
	public static int determinePrimaryElementDraft1()
	{
		return determinePrimaryElementDraft1(0);
	}
	public static int determinePrimaryElementDraft1(int index)
	{
		// If index > arr.length return -1
		if (index >= arr.length)
		{
			return -1;
		}
		
		// Set test to index element in arr.
		int test = arr[index];
		
		// Set count = 0; Set i = 0;
		int count = 0;
		int i = 0;
		// Loop through arr, counting number of occurrence of test.
		// End loop if number of occurrences are >= n2.
		while( (count < n2) && (i < arr.length) ) 
		{
			if ( arr[i++] == test)
			{
				count++;
			}
		}
		// If loop was ended by count >= n2 return test.
		// Else recurse with test+1,
		return (count >= n2)? test : determinePrimaryElementDraft1(index+1);	
	}
	// PROBLEM 1: All recursive solution is not easily scalable. The larger arr to
	// worse in performance until eventually a stack/resource exception occurs.
	// PROBLEM 2: All recursive solution drops in performance quickly the larger the arr.
	// Q time complexity would be Q(2exp n).
	// PROBLEM 3: Solution not scalable (esp in terms of arr.length).
	
	public static int[] memoize = {0, 0, 0, 0, 0, 0, 0, 0, 0}; // arr.length + 1
	// DRAFT 2: Use a memoize array to eliminate reliance on recursion. Increasing performance.
	public static int determinePrimaryElementDraft2()
	{
		// Set i = 0.
		int i = 0;
		// For each element in arr, set val.
		// 		If memoize[val] is zero, set test to determinePrimaryElementDraft2(i).
		//			If test is -1 then add val to memoize[val].
		// 			Else return test.
		//      Increment i.
		for(int val : arr)
		{		
			if ( memoize[val] == 0 )
			{
				int test = determinePrimaryElementDraft2(i);
				if (test == -1)
				{
					memoize[val] = val;
				}
				else
				{
					return test;					
				}
			}
			
			i++;
		}
		return -1;
	}
	public static int determinePrimaryElementDraft2(int index)
	{
		// If index > arr.length return -1
		if (index >= arr.length)
		{
			return -1;
		}
		
		// Set test to index element in arr.
		int test = arr[index];
		
		// Set count = 0; Set i = 0;
		int count = 0;
		int i = 0;
		// Loop through arr, counting number of occurrence of test.
		// End loop if number of occurrences are >= n2.
		while( (count < n2) && (i < arr.length) ) 
		{
			if ( arr[i++] == test)
			{
				count++;
			}
		}

		// If loop was ended by count >= n2 return test.
		// Else return -1,
		return (count >= n2)? test : -1;
	}
	// Performance is improved by reducing number of iterations and removing recursion.
	// PROBLEM 1: Memoize needs to be expanded for higher number values in arr, such as 10233, etc.
	// PROBLEM 2: Solution not scalable (esp in terms of arr.length).
	
	public static List<Integer> Memoize = new ArrayList<Integer>();
	// DRAFT 3: Update Memorize to an expandable List. Now takes an expandable input array as well.
	public static int determinePrimaryElementDraft3(List<Integer>arrList)
	{
		// TODO.
		return -1;
	}
}
