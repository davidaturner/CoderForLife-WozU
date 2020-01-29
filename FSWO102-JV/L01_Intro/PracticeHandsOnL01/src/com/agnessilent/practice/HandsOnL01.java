package com.agnessilent.practice;

public class HandsOnL01 {

	public static void main(String[] args) {
		
		boolean isSunny = true;
		boolean atBeach = true;
		
		RunStep01(isSunny);
		
		RunStep02(isSunny, false);
		
		RunStep03(false, atBeach);

	}
	
	public static void print(String message) {
		if (message != null && !message.isEmpty()) {
			System.out.println(message);
		} else {
			System.out.println("No message to print.");
		}
	}
	public static void RunStep01(boolean isSunny) {
		// if it's sunny
		    // print "Wear sunglasses!"

		// else
		    // print "Don't wear sunglasses."
		print("Running Step01 (isSunny: " + isSunny + ", atBeach: N/A).");
		print("Results:");
		if (isSunny) {
			print("Wear sunglasses!");
		} else {
			print("Don't wear sunglasses");
		}
		print("\r\n");
		
	};
	
	public static void RunStep02(boolean isSunny, boolean atBeach) {
		// if it's sunny
	    	// print "Wear sunglasses!"
	    	// if at the beach
	        	// print "Wear sunblock!"

	    	// else
	        	// print "Don't need sunblock."

		// else
	    	// print "Don't need to wear sunglasses."
		print("Running Step02 (isSunny: " + isSunny + ", atBeach: " + atBeach + ").");
		print("Results:");
		if (isSunny) {
			print("Wear sunglasses!");
			if (atBeach) {
				print("Wear sunblock!");
			} else {
				print("Don't need sunblock.");
			}
		} else {
			print("Don't need to wear sunglasses.");
		}
		print("\r\n");
	};
	
	public static void RunStep03(boolean isSunny, boolean atBeach) {
		// if it's sunny
	    	// print "Wear sunglasses!"
	    	// if at the beach
	        	// print "Wear sunblock!"

	    	// else
	        	// print "Don't need sunblock."

		// else
	    	// print "Don't need to wear sunglasses."
	    	// if at the beach
	        	// print "Come back tomorrow."
	    	// else
	        	// print "Don't go to the beach."	
		print("Running Step03 (isSunny: " + isSunny + ", atBeach: " + atBeach + ").");
		print("Results:");
		if (isSunny) {
			print("Wear sunglasses!");
			if (atBeach) {
				print("Wear sunblock!");
			} else {
				print("Don't need sunblock!");
			}
		} else {
			print("Don't need to wear sunglasses.");
			if (atBeach) {
				print("Come back tomorrow.");
			} else {
				print("Don't go to the beach.");
			}
		}
		print("\r\n");
	}

}
