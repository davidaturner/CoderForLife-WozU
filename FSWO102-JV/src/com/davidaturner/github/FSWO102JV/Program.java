package com.davidaturner.github.FSWO102JV;

import com.davidaturner.github.FSWO102JV.Lesson1.HandsOn1;
import com.davidaturner.github.FSWO102JV.Lesson2.HandsOn2;
import com.davidaturner.github.FSWO102JV.Lesson3.HandsOn3;

public class Program {

	
	public static void main(String[] args) {
		
		HandsOn3 lesson = new HandsOn3 ();

		System.out.println("Running HandsOn Exercises");
		System.out.println();
		
		System.out.println("Step 1");
		lesson.Step1();
		System.out.println();
		
		System.out.println("Step 2");
		lesson.Step2();
		System.out.println();	
		
		System.out.println("Step 3");
		lesson.Step3();	
		System.out.println();
	}

}
