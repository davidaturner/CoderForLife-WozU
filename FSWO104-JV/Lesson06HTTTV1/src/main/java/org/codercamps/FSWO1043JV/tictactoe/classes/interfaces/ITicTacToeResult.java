package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface ITicTacToeResult {

	String getResult();
	void setResult(String playerOrStateResult);
	
	boolean isGameOver();
	boolean isGameDrawn();
	
	boolean addPlayer(String player);
	
	String playerWon();
}
