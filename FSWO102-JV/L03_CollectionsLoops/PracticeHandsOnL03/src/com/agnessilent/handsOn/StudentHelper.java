package com.agnessilent.handsOn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentHelper {

	private static BufferedReader br = null;
	
	public static void openReader() {
		if (br == null) {
			br = new BufferedReader( new InputStreamReader(System.in));
		}
	}
	
	public static void closeReader() {
		try {
			br.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		br = null;
	}
	
	public static String readInputString() {
		String result = null;
		try {
			result = br.readLine();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return result;
	}
	
	public static int readInputInt() {
		String result = null;
		try {
			result = br.readLine();
			return Integer.parseInt(result);
		} catch (Exception e) {
			e.getStackTrace();		
		}
		return -1;
	}
}
