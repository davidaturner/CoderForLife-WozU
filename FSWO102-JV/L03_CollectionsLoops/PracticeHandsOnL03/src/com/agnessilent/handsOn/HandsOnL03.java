package com.agnessilent.handsOn;

public class HandsOnL03 {

	public static int[] numberArray = {0, 0, 0, 0, 0};
	
	public static void main(String[] args) {
		
		StudentHelper.openReader();

		System.out.println("Enter five numbers: ");
		
		for(int i=0; i<5; i++) {
			numberArray[i] = StudentHelper.readInputInt();
		}
		
		System.out.println("\r\nGenerating sequences...");
		
		// Step 01
		RunStep01();
		
		// Step 02
		RunStep02();
		
		// Step 03
		RunStep03();
		
		System.out.println("\r\n..DONE!");
		
		StudentHelper.closeReader();
	}
	
	public static void RunStep01() {
		
		System.out.print("Step01: Forward: ");
		for(int number : numberArray) {
			System.out.print(number + " ");
		}
		System.out.println();
		
	}
	
	public static void RunStep02() {

		System.out.print("Step02: Reverse: ");
		for(int i=numberArray.length-1; i>=0; i--) {
			System.out.print(numberArray[i] + " ");
		}
		System.out.println();

	}
	
	public static void RunStep03() {

		System.out.print("Step03: Odd Only: ");
		for(int i=1; i<numberArray.length-1; i+=2) {
			System.out.print(numberArray[i] + " ");
		}
		System.out.println();
	}

}
