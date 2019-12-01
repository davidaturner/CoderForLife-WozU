package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface IGamePositional {

	boolean load(IGameImportable importedGame);
	
	void display();
	
	boolean evaluate();
	
}
