package com.davidaturner.l09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentHelper {

	private static BufferedReader br;
	
	public static void openReader() {
		br = new BufferedReader( new InputStreamReader(System.in));
	}
	
	public static void closeReader() {
		try {
			br.close();			
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public static int readIntInput() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return -1;
	}
	
	public static String readStringInput() {
		try {
			return br.readLine();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
}
