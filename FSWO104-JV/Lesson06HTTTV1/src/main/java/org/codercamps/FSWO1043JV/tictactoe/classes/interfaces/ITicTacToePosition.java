package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface ITicTacToePosition {

	void load(String[]moves);
	String[] unload();
	
	ITicTacToeResult evaluate();
	
	boolean isGameOver();
	boolean isGameDrawn();
}
