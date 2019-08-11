package lesson02;

public class HandsOnL02 {

	public static void Step01(int age) {
		
		if (age >= 65) {
			System.out.println("Pay $7");
		}
		else if (age <= 12) {
			System.out.println("Pay $8");
		}
		else {
			System.out.println("Pay $10");
		}
	}
	
	public static void Step02(int age, boolean isStudent) {
		
		if (age >= 65) {
			System.out.println("Pay $7");
		}
		else if (isStudent) {
			System.out.println("Pay $8");			
		}
		else if (age <= 12) {
			System.out.println("Pay $8");
		}
		else {
			System.out.println("Pay $10");
		}
	}
	
	public static void Step03(int age, boolean isStudent) {
		
		if (age < 0) {
			System.out.println("Invalid age");
		}
		else if (age >= 65) {
			System.out.println("Pay $7");
		}
		else if (isStudent) {
			System.out.println("Pay $8");			
		}
		else if (age <= 12) {
			System.out.println("Pay $8");
		}
		else {
			System.out.println("Pay $10");
		}
	}
	
	public static void main(String[] args) {
		
		// Testing
		System.out.println("\r\nStart testing...");
		Step01(0);		// Pay $8
		Step01(12);		// Pay $8
		Step01(13);		// Pay $10
		Step01(65);		// Pay $7
		System.out.println("\r\n");
		
		Step02(4, false);	// Pay $8
		Step02(14, true);	// Pay $8
		Step02(28, false);	// Pay $10
		Step02(64, true);	// Pay $8
		System.out.println("\r\n");
		
		Step03(11, true); 	// Pay $8
		Step03(34, false); 	// Pay $10
		Step03(-12, true); 	// Invalid age.
		Step03(66, true); 	// Pay $7
		System.out.println("\r\n... DONE!");
	}

}
