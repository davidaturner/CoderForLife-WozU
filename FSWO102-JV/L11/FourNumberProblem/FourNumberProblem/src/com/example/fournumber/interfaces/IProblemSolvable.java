package com.example.fournumber.interfaces;

public interface IProblemSolvable {

	String describe();
	boolean validate();
	
	String evaluate();
	
	String[] solve();

}
