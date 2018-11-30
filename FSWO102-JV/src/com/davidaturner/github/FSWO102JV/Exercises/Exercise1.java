package com.davidaturner.github.FSWO102JV.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	// Exercise 1:
	// Find the Primary Element/Value in an array of integers.
	// A Primary Element is any value that takes up MORE than n/2 slots or more in an array. 
	
	public static int[] arr =  {3, 2, 2, 1, 2, 2, 1};
	
	public static int[] arr2 = {3, 1, 3, 1, 3, 1, 2};
	public static int[] arr3 = {1, 2, 2, 1, 2, 1, 1};
	public static int[] arr4 = {3, 1, 3, 1, 3, 1, 2, 3};
	public static int[] arr5 = {56, -24, 56, -24, 56, 56, 2, 56};
	
	public static void main(String[] args) {
		
		Exercise1 e = new Exercise1();
		
		System.out.println("Running Exercise 1 tests.");
		System.out.println();
		
//		e.runDraft1();
//		e.runDraft2();
		e.runDraft3(arr);
		
		System.out.println("DONE!");
		System.out.println();
	}
	
	// Find simple solution using recursion.
	public void runDraft1()
	{
		System.out.println("TEST 1:");
		
		int melem = determinePrimaryElementDraft3(arr);
		if (melem == Common.OUT_OF_BOUNDS)
		{
			System.out.println("No majority element found.");
		}
		else
		{
			System.out.println("Majority element found: " + melem);
		}
		
		System.out.println();
	}
	// Reduce (or eliminate) recursion with use of memoize array.
	public void runDraft2()
	{
		System.out.println("TEST 2:");
		
		int melem = determinePrimaryElementDraft3(arr);
		if (melem == Common.OUT_OF_BOUNDS)
		{
			System.out.println("No majority element found.");
		}
		else
		{
			System.out.println("Majority element found: " + melem);
		}
		
		System.out.println();
	}

	// Approach: Bottom up.
	// The Determine method only returns candidates.
	// The Verify determines if candidate IS a majority element.
	public void runDraft3(int [] arr)
	{
		System.out.println("TEST 3:");
		
		int [] useArray = arr5;
		
		int melem = determinePrimaryElementDraft3(useArray);
		if (melem == Common.OUT_OF_BOUNDS || verifyCandidate(useArray,melem) == false)
		{
			System.out.println("No majority element found.");
		}
		else
		{
			System.out.println("Majority element found: " + melem);
		}
		
		System.out.println();
	}

	

	public static int determinePrimaryElementDraft3(int []arr)
	{
		Common.printArray(arr, "Array tested: "); 
		
		if (arr == null || arr.length == 0)
		{
			return Common.OUT_OF_BOUNDS;
		}
		int count = 1, maj = arr[0];
		System.out.println("Initially testing : " + maj + " Count : " + count);
		for(int i = 1; i < arr.length; i++)
		{
			if (arr[i] == maj)
			{
				count++;
			}
			else 
			{
				count--;
			}
			
			System.out.println("Comparing Maj : " + maj + " Arr[i] : " + arr[i] + " Count : " + count);
			if (count == 0)
			{
				maj = arr[i];
				count = 1;
				
				System.out.println("Zero crossing detected! Now testing : " + maj + " Count : " + count);
			}
		}
		
		return maj;
	}
	
	public static boolean verifyCandidate(int []arr, int maj)
	{
		if (arr == null || arr.length == 0)
		{
			return false;
		}
		
		int n = arr.length, count = 0;
		System.out.println("Verify that candidate : " + maj + " has a Count  > " + n/2);
		for(int val : arr)
		{
			System.out.println("Checking val : " + maj + " Current: " + val + " Count : " + count);
			if (val == maj)
			{
				count++;
			}
			if (count > n/2)
			{
				System.out.println("Primary Element found! Count : " + count + " > n/2 : " + n/2);
				return true;
			}
		}
		
		return false;
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
		int n2 = arr.length / 2;
		
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
		int n2 = arr.length / 2;
		
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
	// PROBLEM 1: Array length is fixed. n/2 cannot be assumed to always be 4.
/*	
	public static int determinePrimaryElementDraft3()
	{
		int [] inputarr = getArr();
		printArr("In Input Array: ", inputarr);
		System.out.println();

		return determinePrimaryElementDraft3( inputarr);
	}
	*/
	public static int determinePrimaryElementDraft0(int[] inputarr)
	{
		if (inputarr == null || inputarr.length == 0)
		{
			return -1;
		}
		int arrn2 = inputarr.length / 2;
		
		int melem = inputarr[0];
		int count = 1;
		for(int inp : inputarr)
		{
			if (inp == melem)
			{
				count++;
				System.out.println("Testing melem : " + melem + " count : " + count);

			}
			else
			{
				count--;
				System.out.println("Testing melem : " + melem + " count : " + count);
			}
			if (count > arrn2)
			{
				System.out.println("Primary element : " + melem);
				return inp;
			}
			if (count <= 0)
			{
				melem = inp;
				count = 1;
				System.out.println("Testing melem : " + melem + " count : " + count);
			}
		}
		return -1;
	}
}
