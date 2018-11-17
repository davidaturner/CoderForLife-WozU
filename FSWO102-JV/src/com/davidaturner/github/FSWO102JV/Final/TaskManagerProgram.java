package com.davidaturner.github.FSWO102JV.Final;

public class TaskManagerProgram {

	public static void main(String[] args) {
		
		ReadInput reader = new ReadInput();
		
		reader.OpenInput();
		String test = reader.ReadLine("Prompt :   ");
		
		System.out.println("I read " + test);

	}

}
