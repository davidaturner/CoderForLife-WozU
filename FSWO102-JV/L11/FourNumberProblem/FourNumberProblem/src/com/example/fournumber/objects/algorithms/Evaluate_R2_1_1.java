package com.example.fournumber.objects.algorithms;

import java.util.ArrayList;

import com.example.fournumber.interfaces.FourNumberProblemEvaluator;
import com.example.fournumber.objects.FourNumberProblem;

public class Evaluate_R2_1_1 extends FourNumberProblemEvaluator {
	
	ArrayList<String>solution= new ArrayList<String>();
	
	@Override
	public String evaluate(FourNumberProblem theProblem) {
		solution = new ArrayList<String>();
		return evaluateTHIS(theProblem);
	}
	
	private String evaluateTHIS(FourNumberProblem theProblem) {
		
		String evaluation = theProblem.evaluate();

		int i, j, numberslen;				
		FourNumberProblem problem;
		
		// Base cases
		if (evaluation == FourNumberProblem.NOTREADY) {
			return null;
		}
		if (evaluation != FourNumberProblem.VALIDATED) {
			return evaluation;
		}
		
		// Reclusive case
		problem = theProblem;
		numberslen = theProblem.getNumbers().length;
		
		if (numberslen == 4) {
			i = 0;
			while( i < numberslen-1 ) {
				j = i + 1;
				while ( j<numberslen) {
					problem = reducetheProblem(i, j, '*', theProblem);
					if (evaluate(problem) == FourNumberProblem.SOLVED) {
						solution.add(problem.describe());
						solution.add(theProblem.describe());
						invert();
						return FourNumberProblem.SOLVED;
					}
					j++;
				}
				i++;
			}
		}
		
		if (numberslen == 3) {				
			i = 0;
			while (i == 0) {					
				j = 1;
				while( j < numberslen) {
					problem = reducetheProblem(i, j, '+', theProblem);
					if (evaluate(problem) == FourNumberProblem.SOLVED) {
						solution.add(problem.describe());
						return FourNumberProblem.SOLVED;
					}
					problem = reducetheProblem(i, j, '-', theProblem);
					if (evaluate(problem)== FourNumberProblem.SOLVED) {
						solution.add(problem.describe());
						return FourNumberProblem.SOLVED;
					}
					j++;
				}					
				i++;
			}
		}
		
		if (numberslen == 2) {			
			problem = reducetheProblem(0, 1, '+', theProblem);
			if (problem.evaluate()== FourNumberProblem.SOLVED) {
				solution.add(problem.describe());
				return FourNumberProblem.SOLVED;
			}
			problem = reducetheProblem(0, 1, '-', theProblem);
			if (problem.evaluate()== FourNumberProblem.SOLVED) {
				solution.add(problem.describe());
				return FourNumberProblem.SOLVED;
			}
		}	
	
		return evaluation;
	}
	
	public ArrayList<String>solve(FourNumberProblem theProblem) {
		if (solution.isEmpty()) {
			evaluate(theProblem);
		}
		return solution;
	}
	
	// Additional methods.
	private void invert() {
		ArrayList<String>sorted = new ArrayList<String>();
		for(int i=solution.size()-1; i>=0; i--) {
			sorted.add(solution.get(i));
		}
		solution = sorted;		
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {9, 10, 9, 3};
		int goal = 28;
		
		FourNumberProblem problem  = new FourNumberProblem();
		problem.setNumbers(numbers);
		problem.setGoal(goal);
		System.out.println("The PROBLEM:");
		System.out.println(problem.describe());
		
		Evaluate_R2_1_1 evaluator = new Evaluate_R2_1_1();
		String evaluation = evaluator.evaluate(problem);
		System.out.println("\r\nThe RESOLUTION:");
		display(evaluation);
		
		ArrayList<String>solution = evaluator.solve(problem);
		System.out.println("\r\nThe SOLUTION:");
		display(solution);
	}
	
	private static void display(String evaluation) {
		System.out.println(evaluation);
	}
	private static void display(ArrayList<String>solution) {
		for(int i=0; i<solution.size(); i++) {
			System.out.println(solution.get(i));
		}
	}	
}
