package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.IGameStatus;

public class TicTacToeTwoPlayerResult implements IGameStatus {

	private String playerOrStatus;
	private String[] players;
	
	public static String PLAYER_WINS = "Wins!";
	public static String GAME_DRAWN = "Game Drawn!";
	public static String GAME_IN_PROGRESS = "Game In Progress";
	public static String GAME_IN_ERROR = "Error evaluating Game!";
	
	public static int MAXNUM_PLAYERS = 2;
	
	public static String PLAYER_X = "X";
	public static String PLAYER_O = "O";
	
	// Getters and setters.
	public String getPlayerOrStatus() {
		return playerOrStatus;
	}

	public void setPlayerOrStatus(String playerOrStatus) {
		this.playerOrStatus = playerOrStatus;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	// Interface methods.
	@Override
	public String getPlayerOrGameStatus() {
		return null;
	}

	@Override
	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGameDrawn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setGameDrawn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGameWon(String player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addPlayer(String player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findPlayer(String player) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[]args) {
		RunTest01();
	}
	
	public static void RunTest01 () {		
		TicTacToeTwoPlayerResult result = new TicTacToeTwoPlayerResult();
		System.out.println("Starting game... initial state:");
		System.out.println(result.getPlayerOrGameStatus());
	}



}
