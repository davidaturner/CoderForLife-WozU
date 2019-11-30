package org.codercamps.FSWO1043JV.tictactoe.classes.interfaces;

public interface ITicTacToeExportTemplate {

	boolean isValid();
	
	int determineRowsize() throws Exception;
	
	void display();
}
