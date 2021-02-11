package com.example.fournumber.interfaces;

import java.util.ArrayList;

import com.example.fournumber.objects.FourNumberProblem;

public abstract class FourNumberProblemEvaluator {

	// Class Methods
	abstract public String evaluate(FourNumberProblem theProblem);	
	abstract public ArrayList<String> solve(FourNumberProblem theProblem);
	
	public FourNumberProblem reducetheProblem(int a, int b, char op, FourNumberProblem problem) {

		int[] numbers = problem.getNumbers();
		int goal = problem.getGoal();
		
		// Create new number zero.
		int reducedNumbersZero = numbers[a];
		switch (op) {
		case '+':
			reducedNumbersZero = numbers[a] + numbers[b];
			break;
		case '-':
			reducedNumbersZero = numbers[a] - numbers[b];
			break;
		case '*':
			reducedNumbersZero = numbers[a] * numbers[b];
			break;
		case '/':
			if (b != 0 || (a % b == 0)) {
				reducedNumbersZero = numbers[a] / numbers[b];
			}
			break;
		default:
			System.out.println("Invalid op");
			break;
		}

		// Fill out remaining int[] with problem numbers.
		int[] newnumbers = new int [numbers.length-1];
		newnumbers[0] = reducedNumbersZero;
		
		int j=1;
		for(int i=0; i<numbers.length; i++) {
			if (i == a || i == b) {
				continue;
			}
			newnumbers[j] = numbers[i];
			j++;
		}
		
		// Create (new) reduced problem.
		FourNumberProblem reduced = new FourNumberProblem(); 
		reduced.setNumbers(newnumbers);
		reduced.setGoal(goal);
		
		reduced.describe();

		return reduced;
	}
}
