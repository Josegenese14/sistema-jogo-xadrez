package bordaGame;

public class Piece {
	
	protected posicao position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position=null;
	}

	protected Board getBoard() {
		return board;
	}

	
}
