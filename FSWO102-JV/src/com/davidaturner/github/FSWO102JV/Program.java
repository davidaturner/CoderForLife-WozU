package com.davidaturner.github.FSWO102JV;

import com.davidaturner.github.FSWO102JV.Lesson1.HandsOn1;
import com.davidaturner.github.FSWO102JV.Lesson2.HandsOn2;
import com.davidaturner.github.FSWO102JV.Lesson3.HandsOn3;
import com.davidaturner.github.FSWO102JV.Lesson4.HandsOn4;

public class Program {

	
	public static void main(String[] args) {
		
		System.out.println("Running HandsOn Exercises");
		System.out.println();
		
		HandsOn4 lesson = new HandsOn4 ();
		
		lesson.Step1();	
		lesson.Step2();
		lesson.Step3();	

		System.out.println("DONE!");
		System.out.println();
	}

}
