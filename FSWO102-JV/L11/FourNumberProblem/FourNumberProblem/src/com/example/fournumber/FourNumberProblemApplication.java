package com.example.fournumber;

import com.example.fournumber.controllers.FourNumberProblemSolver;
import com.example.fournumber.objects.FourNumberProblemRecursive;

public class FourNumberProblemApplication {

	public static void run() {
		
		System.out.println("The Four Number Problem.");
		System.out.println("Enter a goal and four numbers.");
		
		int goal = loadGoal();
		
		int[] corners = loadCorners();
		
		FourNumberProblemSolver solver = new FourNumberProblemSolver(goal, corners, new FourNumberProblemRecursive());
		if (solver.validate()) {			
			String[]solution = solver.solve();
			if (solution != null && solution.length>0) {
				System.out.println("Solution found! " + solution.length + " Steps:");
				for(int i=0; i<solution.length; i++) {
					System.out.println(solution[i]);
				}
			} else {
				System.out.println("Sorry. Solution not found.");
			}
		} else {
			System.out.println("Unable to solve.");
			System.out.println(solver.describe());
		}
	}
	
	private static int loadGoal() {
		return 41;
	}
	
	private static int[] loadCorners() {
		int[] corners = {4, 9, 3, 5};
		return corners;
	}
	
	public static void main(String[] args) {
		
		run();
	}

}
