package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface IGameStatus {

	String getCurrent();
	
	boolean isGameOver();
	
	boolean isGameDrawn();
	void setGameDrawn();
	
	void setGameWon(String player);
	
	boolean addPlayer(String player);
	String findPlayer(String player);
	
}
