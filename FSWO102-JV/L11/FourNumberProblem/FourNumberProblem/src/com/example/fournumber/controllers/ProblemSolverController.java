package com.example.fournumber.controllers;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.interfaces.IProblemSolverController;
import com.example.fournumber.interfaces.ISolvable;
import com.example.fournumber.objects.FourNumberProblem;
import com.example.fournumber.solvable.FourNumberProblemRecursive;

public class ProblemSolverController implements IProblemSolverController {

	private final IProblemSolvable solver;
	private String problemSolved, problemNotSolved, problemInvalid;
	
	public final String success = "Success";
	public final String failure = "Failure";
	public final String invalid = "Invalid";
	
	public ProblemSolverController(IProblemSolvable solver) {
		this.solver = solver;
		
		this.problemSolved = success;
		this.problemNotSolved = failure;
		this.problemInvalid = invalid;
	}
	
	@Override
	public String[] run() {
		System.out.println("Working...");
		if (solver.validate()) {
			String solution = solver.solve();
			if (solution != null && !solution.isEmpty()) {
				System.out.println("\r\n" + problemSolved);
				System.out.println(solution);
			}
			else {
				System.out.println("\r\n" + problemNotSolved);
			}
		} else {
			System.out.println("\r\n" + problemInvalid);
		}
		return null;
	}
	
	@Override
	public String[] solve(String problemJSON) {
		System.out.println("Solve() not implemented.");
		return null;
	}
	
	@Override
	public void success(String message) {
		problemSolved = message;	
	}

	@Override
	public void failure(String message) {
		problemNotSolved = message;
		
	}

	@Override
	public void invalid(String message) {
		problemInvalid = message;
		
	}

	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		FourNumberProblem problem = new FourNumberProblem();
		problem.setGoal(goal);
		problem.setCorners(corners);
		problem.setPrestep(ISolvable.START);
		
		ProblemSolverController controller = new ProblemSolverController(
													new FourNumberProblemRecursive(problem));
		controller.run();
	}

}
