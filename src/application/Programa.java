package application;

import bordaGame.Board;
import chess.ChessMatch;


public class Programa {

	public static void main(String[] args) {
		
			ChessMatch chessMatch = new ChessMatch();
			Ui.printBoard(chessMatch.getpieces());		
	}

}
