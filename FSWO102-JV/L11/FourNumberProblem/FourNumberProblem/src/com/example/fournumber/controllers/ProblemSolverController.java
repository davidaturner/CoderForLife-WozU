package com.example.fournumber.controllers;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.solvable.FourNumberProblemRecursive;

public class ProblemSolverController {

	private final IProblemSolvable solver;
	private final String problemSolved, problemNotSolved, problemInvalid;
	
	public ProblemSolverController(String problemSolved,
									String problemNotSolved,
									String problemInvalid,
									IProblemSolvable solver) {
		this.solver = solver;
		this.problemSolved = problemSolved;
		this.problemNotSolved = problemNotSolved;
		this.problemInvalid = problemInvalid;
	}
	
	public void run() {	
		if (validate()) {
			String[] solution = solve();
			if (solution != null && solution.length>0) {
				System.out.println("\r\n" + problemSolved);
				for(int i=0;i<solution.length;i++) {
					System.out.println(solution[0]);
				}
			}
			else {
				System.out.println("\r\n" + problemNotSolved);
				System.out.println(describe());
			}
		} else {
			System.out.println("\r\n" + problemInvalid);
			System.out.println(describe());
		}
	}
	
	private String describe() {
		return (solver != null)?solver.describe():null;
	}
	
	private boolean validate() {
		return (solver != null && solver.validate());
	}
	
	private String[] solve() {
		return (solver != null)?solver.solve(): null;
	}
	
	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};

		ProblemSolverController controller = new ProblemSolverController( 
						"Solution Found!", "Solution Not Found.", "Unable to Solve.",
						new FourNumberProblemRecursive(goal, corners));
		
		System.out.println(controller.describe());
	}

}
