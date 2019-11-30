package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface ITicTacToeResult {

	String getResult();
	
	boolean isGameOver();
	
	boolean isGameDrawn();
	void setGameDrawn();
	
	void setGameWon(String player);
	
	boolean addPlayer(String player);
	
}
