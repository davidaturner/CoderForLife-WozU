package com.davidaturner.github.FSWO102JV.Lesson3;

import java.util.Scanner;

public class StudentHelper {


	public static String ReadInputString()
	{		
		Scanner scan = new Scanner(System.in);
		
		String scanned = scan.nextLine();

		return scanned;
	}


	public static int ReadInputInt()
	{
		Scanner scan = new Scanner(System.in);
		
		int scanned = scan.nextInt();
		
		return scanned;
	}
	
	public static void Random(int numberOfTries)
	{
        // define the range 
        int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 10 
        for (int i = 0; i < numberOfTries; i++) { 
            int rand = (int)(Math.random() * range) + min; 
  
            // Output is different everytime this code is executed 
            System.out.println(rand); 
        } 
	}
	
}
