package com.example.fournumber.controllers;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.interfaces.IProblemSolverController;
import com.example.fournumber.interfaces.ISolvable;
import com.example.fournumber.objects.FourNumberProblem;
import com.example.fournumber.solvable.FourNumberProblemRecursive;

public class ProblemSolverController implements IProblemSolverController {

	private final IProblemSolvable solver;
	private String ready;
	
	public ProblemSolverController(IProblemSolvable solver) {
		this.solver = solver;
		ready = IProblemSolverController.NOT_READY;		
	}
	
	@Override
	public String run() {
		System.out.println("Goal: " + ((FourNumberProblemRecursive)solver).getGoal());
		System.out.println("Corners: " + ((FourNumberProblemRecursive)solver).getCorners());
		solve();
		String[] listing = listing();
		System.out.println("\r\nSolution:");
		for(int i=0;i<listing.length;i++) {
			System.out.println("   " + listing[i]);
		}
		return evaluation();
	}

	@Override
	public void solve() {
		if (solver.validate()) {
			solver.solve();
			ready = IProblemSolverController.READY;
		}		
	}
	
	@Override
	public String ready() {
		return ready;
	}
	
	@Override
	public String evaluation() {
		return solver.evaluate();
	}

	@Override
	public String[] listing() {
		return solver.listing();
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
		String result = controller.run();
		System.out.println("\r\n" + result);
	}

}
