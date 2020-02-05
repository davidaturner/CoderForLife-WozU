package com.davidaturner.l04;

public class HandsOnL04 {

	public static int doubleMe(int val) {
		return val + val;
	}
	public static int quadrupleMe(int val) {
		return doubleMe(val) + doubleMe(val);
	}
	public static int doubleMeTimes(int val, int times) {
		for(int i=0; i<times; i++) {
			val = doubleMe(val);
		}
		return val;
	}
	public static int doubleMeTimesBatman(int val, int times) {
		if (times == 1) {
			return doubleMe(val);
		}
		
		return doubleMe(doubleMeTimesBatman(val, times-1));
	}
	public static void main(String arg[]) {
		
		int val = 2;
		int times = 3;
		
		Step01(val);
		System.out.println();
		
		Step02(val);
		System.out.println();
		
		Step03(val, times);
		System.out.println();
//		Extra(val, times);

	}
	
	public static void Step01(int val) {
		// Step 01
		System.out.println("Value: " + val);
		System.out.println("Doubled: " + doubleMe(val));
	}
	public static void Step02(int val) {
		// Step 02
		System.out.println("Value: " + val);
		System.out.println("Quadrupled: " + quadrupleMe(val));
	}
	public static void Step03(int val, int times) {
		// Step 03
		System.out.println("Value: " + val);
		System.out.println("Result: " + doubleMeTimes(val, times));
	}
	public static void Extra(int val, int times) {
		// Extra
		System.out.println("Value: " + val);
		System.out.println("Result: " + doubleMeTimesBatman(val, times));
	}

}
