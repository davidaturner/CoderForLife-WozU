package com.example.fournumber;

import com.example.fournumber.controllers.ProblemSolverController;
import com.example.fournumber.interfaces.ISolvable;
import com.example.fournumber.objects.FourNumberProblem;
import com.example.fournumber.solvable.FourNumberProblemRecursive;

public class FourNumberProblemApplication {

	public static String problemSolved = "Solution Found!";
	public static String problemNotSolved = "Solution Not Found.";
	public static String problemInvalid = "Unable to Solve.";
	
	public static void main(String[] args) {
		
		startApplication();
		
		int goal = loadGoal();		
		int[] corners = loadCorners();
		
		stateProblem(goal, corners);
		
		FourNumberProblem original = new FourNumberProblem();
		original.setGoal(goal);
		original.setCorners(corners);
		original.setPrestep(ISolvable.START);
		
		ProblemSolverController controller = new ProblemSolverController(
													new FourNumberProblemRecursive(original));
		controller.success("Solution Found!");
		controller.failure("Solution Not Found.");
		controller.invalid("Unable to Solve.");
		
		controller.run();
		
		endApplication();
		
	}
	
	private static void startApplication() {
		System.out.println("The Four Number Problem.");
		System.out.println("Enter a goal and four numbers.");

	}
	
	private static void endApplication() {
		System.out.println("\r\n...Done!");		
	}
	
	private static void stateProblem(int goal, int[]corners) {
		System.out.println("\r\nGoal: " + goal);
		if (corners != null && corners.length>0) {
			String str = "\r\nCorners:";
			for(int i=0;i<corners.length;i++) {
				str += " " + corners[i];
			}
			System.out.println(str);
		}
	}
	
	private static int loadGoal() {
		return 41;
	}
	
	private static int[] loadCorners() {
		int[] corners = {4, 9, 3, 5};
		return corners;
	}
	


}
