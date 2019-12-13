package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

import java.util.List;

public interface IGameImportable {
	
	List<String> getPieces();
	List<String> getCells();
	
	List<String> getPlayers();
	
	void display();
}
